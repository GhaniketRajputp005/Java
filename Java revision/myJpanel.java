import javax.swing.*;
// import java.awt.*;

public class myJpanel extends JFrame {

    myJpanel() {
       

        JPanel panel = new JPanel();
        JButton save = new JButton("save");
        JButton exit = new JButton("exit");

        JLabel label = new JLabel("Enter Name");
        label.setLocation(0, 20);
        JLabel lable2 = new JLabel("Enter Salary");
             label.setLocation(0, 20);



        JTextField text = new JTextField(20);
                     text.setLocation(0, 40);

        JTextField text2 = new JTextField(20);
                     text2.setLocation(0, 40);


        JCheckBox cb  = new JCheckBox("yes");
                JCheckBox cb1  = new JCheckBox("no");



        panel.add(label);

        panel.add(text);
        panel.add(lable2);
        panel.add(text2);
      
        panel.add(save);
        panel.add(exit);
          panel.add(cb);
        panel.add(cb1);

        add(panel);
 setVisible(true);
        setSize(700, 600);
        setLocation(100, 100);
        setTitle("heleo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        new myJpanel();

    }

}
