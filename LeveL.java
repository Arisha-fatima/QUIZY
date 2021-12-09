package quizy;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;

public class Level extends JFrame implements ActionListener {
    JButton b3,b4,b5;
    String username;
    Level(String username){
        this.username = username;
        setBounds(70, 250, 1150, 550); // dleft, //dup // length, height ///////
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
       
        JLabel l1 = new JLabel("Select Your Level");
        l1.setForeground(new Color(30, 144, 255));
        l1.setFont(new Font("Times New Roman", Font.BOLD, 32));
        l1.setBounds(450, 90, 700, 30);
        add(l1);
       
        b3 = new JButton("PATTERN");
        b3.setBounds(450, 170, 250, 40);
        b3.setBackground(new Color(30, 144, 254));
        b3.setFont(new Font("Times New Roman", Font.BOLD, 18));
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        add(b3);
       
        b4 = new JButton("ANALOGIES");
        b4.setBounds(450, 230, 250, 40);
        b4.setBackground(new Color(30, 144, 254));
        b4.setFont(new Font("Times New Roman", Font.BOLD, 18));
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        add(b4);
       
        b5 = new JButton("PATTERN & ANALOGIES");
        b5.setBounds(450, 280, 250, 40);
        b5.setBackground(new Color(30, 144, 254));
        b5.setFont(new Font("Times New Roman", Font.BOLD, 18));
        b5.setForeground(Color.WHITE);
        b5.addActionListener(this);
        add(b5);
       
        setVisible(true);
    }
    //@Override  
        public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b4){
            this.setVisible(false);
             new Rules(username).setVisible(true);
        }
        else if(ae.getSource() == b3){
            this.setVisible(false);
             new Rules2(username).setVisible(true);
        }
        else if(ae.getSource() == b5){
            this.setVisible(false);
             new Rules3(username).setVisible(true);
        }
        else{
            System.exit(0);
        }
       
    }
    public static void main(String[] args) {
         new Level(" ");
    }
}