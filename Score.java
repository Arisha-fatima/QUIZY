package quizy;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class Score extends JFrame implements ActionListener{
    String username;
    Score(String username, int score){
        this.username=username;
        setBounds(200, 200, 1000, 500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
       
       
        JLabel l2 = new JLabel("Thankyou " + username + " for Playing Quizy Fire");
        l2.setBounds(45, 30, 700, 30);
        l2.setFont(new Font("RALEWAY", Font.PLAIN, 26));
        add(l2);
       
        JLabel l3 = new JLabel("Your Score is " + score);
        l3.setBounds(350, 200, 300, 30);
        l3.setFont(new Font("Times New Roman", Font.BOLD, 28));
        l3.setForeground(new Color(200, 21, 133));
        add(l3);
       
        JButton b1 = new JButton("Play Again");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
       
        b1.setBounds(400, 270, 120, 30);
        add(b1);
       
    try{
    FileWriter fw=new FileWriter("users.txt",true);
    fw.write("Username: "+username+"   Score: "+score+"   Date & Time: ");
   
    Date thisDate=new Date();
    SimpleDateFormat date=new SimpleDateFormat("MM/dd/Y hh:mm a"+"\n");
    fw.write(date.format(thisDate));
    fw.write(" ");
    fw.close();
}
    catch(Exception e){
    System.out.println(e);
}    
    }

    @Override
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new Quizy().setVisible(true);
    }
   
   
    public static void main(String[] args){
        new Score("", 0).setVisible(true);
     
    }
}
