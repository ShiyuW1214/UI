import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.*;

public class zoom {
    private String modality = "CT";
    private String part = "Arm";
    private String patientname = "Tom";

    private JFrame zoom = new JFrame("Modality:"+modality+"   "+"Part:"+part+"   "+"Patient name:"+patientname);
    //private ImageIcon logo = new ImageIcon("D:/Year_3/programming3/group_project/image/logo_w.png");
    //private ImageIcon image = new ImageIcon("image/b.jpg");
    //private JLabel image_label = new JLabel(image);

    //private JLabel z_image = new JLabel(new ImageIcon("D:/Year_3/programming3/group_project/UI/material/naughty_test.jpg"));
    private Container zoom_c = zoom.getContentPane();

    int ratio;
    int flag = 0;

/*
    BufferedImage image_f;
    {
        try {
            image_f = ImageIO.read((ImageInputStream) image);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    */

    //int width = image_f.getWidth();
    //int height = image_f.getHeight();
    //int width_n;
    //int height_n;

    public zoom(Image image) throws Exception {
        //zoom.setBounds(20,20,1000,800);
        zoom.setLayout(new BorderLayout());
        zoom.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        zoom.setVisible(true);
        init(image);

    }

    public void init(Image image) throws Exception {
        int w = image.getWidth(null)*10;
        int h = image.getHeight(null)*10;
        Image bImage = image.getScaledInstance(w, h, Image.SCALE_DEFAULT);
        //BufferedImage bImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        ImageIcon imageIcon= new ImageIcon(bImage);
        //JLabel image_label = new JLabel(image);
        //JFrame frame = new JFrame();
        JLabel label = new JLabel(new ImageIcon(image));
        //frame.getContentPane().add(label, BorderLayout.CENTER);
        //frame.pack();
        //frame.setVisible(true);
        JPanel imagepanel = new JPanel();
        //logopanel.setBounds(0, 0, 400, 130);
        //logopanel.setBackground(panel_color);
        //logo_label.setBounds(0, 0, 400, 130);
        imagepanel.add(label);
        zoom.add(imagepanel);

        zoom.pack();
        //zoom.MAXIMIZED_BOTH;

    }
/*
    public static Img scale(Img raw, File destImageFile,float scale){
        try {
            //????????????????????????
            BufferedImage bimg = ImageIO.read(new File(raw.getFile_name()));
            int width = (int) (bimg.getWidth()*scale);
            int height = (int) (bimg.getHeight()*scale);
            //??????????????????????????????????????????
            Image img = bimg.getScaledInstance(width , height, Image.SCALE_DEFAULT);
            //??????????????????????????????
           /* BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            //????????????
            Graphics2D graphics = image.createGraphics();
            //???Image?????????????????????,??????????????????,ImageObserver:???????????? Image ?????????????????????????????????,?????????????????????
            graphics.drawImage(img, 0, 0,null);
            //?????????????????????
            graphics.dispose();
            //???????????????????????????
            String fileName = srcImageFile.getName();
            String formatName = fileName.substring(fileName.lastIndexOf(".") + 1);
            //??????ImageIO???write??????????????????
            ImageIO.write(image,formatName,destImageFile);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
        return

 */

 /*
    public static void main(String[] args) {
        /*
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
*/

}
