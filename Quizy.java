package quizy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class Quizy extends JFrame implements ActionListener{
   
    JButton b1, b2;
    JTextField t1;
    public Quizy(){
        setBounds(70, 250, 1150, 550); // dleft, //dup // length, height ///////
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
       
        ImageIcon quiz = new ImageIcon(ClassLoader.getSystemResource("quizy/icons/quiz3.jpg"));
        JLabel quiz1 = new JLabel(quiz);
        quiz1.setBounds(0, 0, 550, 500);
        add(quiz1);
       
        JLabel l2 = new JLabel("Quizzy Quick Fire");
        l2.setFont(new Font("Times New Roman", Font.BOLD, 50));
        l2.setForeground(new Color(2, 144, 254));
        l2.setBounds(580, 60, 700, 45);
        add(l2);
       
        JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        l3.setForeground(new Color(30, 144, 254));
        l3.setBounds(660, 155, 300, 20);
        add(l3);
       
        t1 = new JTextField();
        t1.setBounds(600, 205, 320, 25);
        t1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(t1);
       
        b1 = new JButton("Start");
        b1.setBounds(580, 300, 120, 25);
        b1.setBackground(new Color(30, 144, 254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
       
        b2 = new JButton("Exit");
        b2.setBounds(800, 300, 120, 25);
        b2.setBackground(new Color(30, 144, 254));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
       
        setVisible(true);
    }  
   
    @Override  
        public void actionPerformed(ActionEvent ae){
          String username = t1.getText();
          if(ae.getSource() == b2){
            //this will display a confirm dialog box
            int choice = JOptionPane.showConfirmDialog(null,"Do you really want to quit?","Exit",JOptionPane.YES_NO_OPTION);
            if(choice==0) {
                dispose();
            }
          }
         
          else if(username.equals("")) //If username is null
        {
            JOptionPane.showMessageDialog(null,"Please enter username"); //Display dialog box with the message
        }  
          else if(ae.getSource() == b1){
            this.setVisible(false);
            new Level(username);
        }
        }
       
       
    public static void main(String[] args) {
         new Quizy();
    }
   
}
   
