import java.util.Set;

import javax.crypto.NullCipher;
import javax.swing.*;
public class gui {
    public static void main(String[] args) {
        JFrame f = new JFrame("myexapmple");
        JLabel l1=new JLabel("addition of two no ");
        JLabel  l2=new JLabel("Enter first no :-");
        JLabel  l3=new JLabel("Enter second no :-");
        JLabel  l4=new JLabel();
        JTextField t1,t2;
        JButton b1;
        
        
       
       
       
        t1=new JTextField();
        t2=new JTextField();
        b1=new JButton("add");
        l1.setBounds(50,50,200,20);
        l2.setBounds(50,80,100,20);
        l3.setBounds(150,80,100,20);
        l4.setBounds(50,50,100,20);
        setLayout(null);
       f.add(l1);
       f.add(l2);
       f.add(l3);
       f.add(l4);
       f.add(t1);
       f.add(t2);
       f.add(b1);
      
        f.setSize(600,600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}