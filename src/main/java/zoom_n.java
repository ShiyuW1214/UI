import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;


public class zoom_n{
    private JFrame frame = new JFrame("Arm CT");
    private ImageIcon i = new ImageIcon("D:/Year_3、programming3、group_project/image/ct.png");
    private JLabel image = new JLabel(i);
    private Container a = new Container();

    public zoom_n() {
        frame.setBounds(600, 200, 900, 900);
        a.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        frame.setVisible(true);
    }

    public void init(){
        JPanel imagepanel = new JPanel();
        imagepanel.setBounds(0,0,900,900);
        imagepanel.add(image);
        image.setBounds(100,100,510,429);
        frame.add(imagepanel);
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
        new zoom_n();
    }

}