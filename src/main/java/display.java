import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class display {
    private JFrame result = new JFrame("Result");
    private Container result_c = result.getContentPane();
    private ImageIcon image = new ImageIcon("D:/Year_3/programming3/group_project/UI/material/naughty_test.jpg");
    public JButton image_button = new JButton(image);
    private JLabel zoom = new JLabel(new ImageIcon("D:/Year_3/programming3/group_project/UI/material/naughty_test.jpg"));

    //private  JTextArea text = new JTextArea();
    //private JScrollPane jScrollBar1 = new JScrollPane(text,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);


    Font f=new Font(Font.DIALOG,Font.BOLD,18);


    public display(){
        result.setBounds(100,100,1100,1100);
        result_c.setLayout(new BorderLayout());
        result.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        init();
    }

    public void init() {
        JPanel fieldPanel = new JPanel();
        fieldPanel.setPreferredSize(new Dimension(200, 100));
        fieldPanel.setLayout(null);

        image_button.setBounds(50, 50, 300, 300);
        image.setImage(image.getImage().getScaledInstance(280, 280, 0));
        image_button.setIcon(image);
        fieldPanel.add(image_button);
        result_c.add(fieldPanel, "Center");
        result.setVisible(true);
        fieldPanel.setVisible(true);


        image_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new zoom();
            }
        });
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
        new display();
    }
}

