import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class zoom {

    private JFrame zoom = new JFrame("Zoom in");
    private JLabel z_image = new JLabel(new ImageIcon("D:/Year_3/programming3/group_project/UI/material/naughty_test.jpg"));
    private File image = new File("D:/Year_3/programming3/group_project/UI/material/naughty_test.jpg");
    private Container zoom_c = zoom.getContentPane();
    int ratio;
    int flag = 0;


    BufferedImage image_f;
    {
        try {
            image_f = ImageIO.read(image);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    int width = image_f.getWidth();
    int height = image_f.getHeight();
    int width_n;
    int height_n;

    public zoom(){
        zoom.setBounds(20,20,1000,800);
        zoom.setLayout(new BorderLayout());
        zoom.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        zoom.setVisible(true);
        init();
    }

    public void init(){
        JPanel fieldPanel = new JPanel();
        //fieldPanel.setPreferredSize(new Dimension(width,height));
        fieldPanel.setLayout(null);
        if (width <= 1000 && height <= 800){
            z_image.setBounds(5,5,width,height);
        }else{
            if (width >1000){
                while (width >1000){
                    width = width/2;
                    flag ++;
                }
                int height_n= height/((2)^(flag));
                z_image.setBounds(5,5,width,height_n);
            }else{
                while (height >800){
                    height = height/20;
                    flag ++;
                }
                int width_n = width/((2)^(flag));
                z_image.setBounds(5,5,width_n,height);
            }
        }

        fieldPanel.add(z_image);
        zoom_c.add(fieldPanel, "Center");
        fieldPanel.setVisible(true);


    }
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(Exception e) {
            System.out.println(e);
        }
        new zoom();
    }


}
