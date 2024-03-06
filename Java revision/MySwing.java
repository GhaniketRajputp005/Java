import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;


public class MySwing  {
    
    public static void main(String[] args) {
        
JFrame  frame = new JFrame("my frame");
frame.setSize(500,500);
frame.setLocation(400,500);
frame.setVisible(true);    
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

JButton save = new JButton("save");
JButton exit = new JButton("exit");

JLabel label = new JLabel("swing means powerful GUI");
frame.setLayout(new FlowLayout());
frame.add(label);
frame.add(save);
frame.add(exit);

       
    }

}


