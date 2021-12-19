import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class search {

    private JFrame search = new JFrame("Search");
    private Container search_c = search.getContentPane();
    private JButton confirm = new JButton("confirm");


    private JLabel region = new JLabel("Region");
    String[] choice_r = new String[] {"All","Heart","Arm","Chest","Brain","Neck"};
    private JComboBox r_choice = new JComboBox(choice_r);


    private JLabel modality = new JLabel("Modality:");
    JCheckBox choice_MRI = new JCheckBox("MRI");
    JCheckBox choice_CT = new JCheckBox("CT");
    JCheckBox choice_US = new JCheckBox("Ultrasound");
    JCheckBox choice_XRay = new JCheckBox("XRay");


    private  JLabel patient_name = new JLabel("Patient Name:");
    private JTextField name = new JTextField();


    private JPanel line = new JPanel();
    private JPanel display = new JPanel();
    Color line_color = new Color(190,190,190);
    Color fieldpanel_color = new Color(54,54,54);
    Color text_color = new Color(181,181,181);
    Color displaypanel_color = new Color(130,130,130);
    Font f=new Font(Font.DIALOG,Font.BOLD,16);


    public search(){
        search.setBounds(250, 110, 1000, 800);
        search_c.setLayout(null);
        search.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        search.setVisible(true);
        init();
    }


    public void init() {
        JPanel fieldPanel = new JPanel();
        fieldPanel.setBackground(fieldpanel_color);
        fieldPanel.setBounds(0,0,295,700);
        fieldPanel.setLayout(null);
        region.setBounds(20,25,70,50);
        modality.setBounds(20,100,100,20);
        patient_name.setBounds(20,190,130,50);
        name.setBounds(20,230,200,30);
        region.setFont(f);
        modality.setFont(f);
        patient_name.setFont(f);
        region.setForeground(text_color);
        modality.setForeground(text_color);
        patient_name.setForeground(text_color);
        r_choice.setForeground(text_color);
        r_choice.setBounds(100,30,150,40);
        choice_MRI.setBounds(20,130,50,20);
        choice_CT.setBounds(90,130,50,20);
        choice_US.setBounds(150,130,100,20);
        choice_XRay.setBounds(20,160,100,20);
        choice_MRI.setForeground(text_color);
        choice_CT.setForeground(text_color);
        choice_US.setForeground(text_color);
        choice_XRay.setForeground(text_color);
        fieldPanel.add(region);
        fieldPanel.add(modality);
        fieldPanel.add(patient_name);
        fieldPanel.add(r_choice);
        fieldPanel.add(choice_MRI);
        fieldPanel.add(choice_CT);
        fieldPanel.add(choice_US);
        fieldPanel.add(choice_XRay);
        fieldPanel.add(name);
        search.add(fieldPanel);


        //display panel
        display.setBounds(305,0,700,800);
        display.setBackground(displaypanel_color);
        search.add(display);

        //line panel
        line.setBounds(301,0,5,800);
        line.setBackground(line_color);
        search.add(line);

        //confirm button
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(fieldpanel_color);
        buttonPanel.setBounds(0,700,295,100);
        confirm.setBounds(100,30,100,40);
        buttonPanel.add(confirm);
        search.add(buttonPanel);

        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new display();
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
        new search();
    }
}
