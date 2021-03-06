package quizy;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pattern extends JFrame implements ActionListener{
   
    JButton next, submit, lifeline;
    public static int count = 0;
    public static int timer = 15;
    public static int ans_given = 0;
    public static int score = 0;
    JLabel qno, question;
    String q[][] = new String[15][5];
    String pa[][] = new String[15][1];
    String qa[][] = new String[15][2];
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup options;
   
    String username;
    Pattern(String username){
        this.username = username;
        setBounds(70, 100, 1150, 700);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizy/icons/quiz2.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 1150, 300);
        add(l1);
       
        qno = new JLabel("");
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        qno.setBounds(100, 320, 50, 60);
        add(qno);
       
        question = new JLabel("");
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        question.setBounds(150, 320, 900, 60);
        add(question);
       
        q[0][0] = "Which number should come next in the pattern?37, 34, 31, 28";
        q[0][1] = "21";
        q[0][2] = "40";
        q[0][3] = "25";
        q[0][4] = "15";

        q[1][0] = "What number best completes the analogy of 8:4 as 10";
        q[1][1] = "3";
        q[1][2] = "7";
        q[1][3] = "5";
        q[1][4] = "9";

        q[2][0] = "Which number logically follows this series? 4 6  9 6 14 6 ?";
        q[2][1] = "19";
        q[2][2] = "9";
        q[2][3] = "17";
        q[2][4] = "4";

        q[3][0] = "Find x. 7x9-3x4+10";
        q[3][1] = "41";
        q[3][2] = "51";
        q[3][3] = "61";
        q[3][4] = "71";

        q[4][0] = "50% of 60 is equal to ____% of 120.";
        q[4][1] = "25";
        q[4][2] = "40";
        q[4][3] = "80";
        q[4][4] = "120";

        q[5][0] = " CAACCAC is to 3113313 as CACAACAC is to";
        q[5][1] = "31311313";
        q[5][2] = "31311131";
        q[5][3] = "13133313";
        q[5][4] = "None of the above.";

        q[6][0] = "Some months have 31 days; how many have 28?";
        q[6][1] = "10";
        q[6][2] = "2";
        q[6][3] = "1";
        q[6][4] = "12";

        q[7][0] = "Clark has 15 nickels, how many dollars does he have?";
        q[7][1] = "$1.20";
        q[7][2] = "$0.50";
        q[7][3] = "$1.00";
        q[7][4] = "$0.75";

        q[8][0] = "Which number should come next in the pattern?1,4,13,40,21";
        q[8][1] = "345";
        q[8][2] = "364";
        q[8][3] = "70";
        q[8][4] = "64";

        q[9][0] = "20% of 200 and 10% of ____ are equal";
        q[9][1] = "100";
        q[9][2] = "400";
        q[9][3] = "600";
        q[9][4] = "200";
       
        q[10][0] = "Which one of the following is odd.";
        q[10][1] = "sugar";
        q[10][2] = "Milk";
        q[10][3] = "Honey";
        q[10][4] = "oil";

        q[11][0] = "20% work has been done. Remaining work is";
        q[11][1] = "20/25";
        q[11][2] = "20/100";
        q[11][3] = "20/80";
        q[11][4] = "None of them";

        q[12][0] = "Two times of half of 20% of 100 is";
        q[12][1] = "5";
        q[12][2] = "10";
        q[12][3] = "15";
        q[12][4] = "20";

        q[13][0] = "49/1, 36/4, 25/9, 16/16, ?";
        q[13][1] = "9/25";
        q[13][2] = "4/16";
        q[13][3] = "9/24";
        q[13][4] = "4/24";
       
        q[14][0] = "6??6 =25, 5??5=16, 4??4=9, 3??3= ?";
        q[14][1] = "4";
        q[14][2] = "2";
        q[14][3] = "6";
        q[14][4] = "8";
       
       
        qa[0][1] = "25";
        qa[1][1] = "5";
        qa[2][1] = "19";
        qa[3][1] = "61";
        qa[4][1] = "25";
        qa[5][1] = "31311313";
        qa[6][1] = "12";
        qa[7][1] = "$0.75";
        qa[8][1] = "364";
        qa[9][1] = "400";
        qa[10][1] = "sugar";
        qa[11][1] = "20/25";
        qa[12][1] = "20";
        qa[13][1] = "9/25";
        qa[14][1] = "4";
       
        opt1 = new JRadioButton("");
        opt1.setBounds(170, 390, 300, 30);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt1.setBackground(Color.WHITE);
        add(opt1);
       
        opt2 = new JRadioButton("");
        opt2.setBounds(170, 430, 300, 30);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt2.setBackground(Color.WHITE);
        add(opt2);
       
        opt3 = new JRadioButton("");
        opt3.setBounds(170, 470, 300, 30);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt3.setBackground(Color.WHITE);
        add(opt3);
       
        opt4 = new JRadioButton("");
        opt4.setBounds(170, 510, 300, 30);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt4.setBackground(Color.WHITE);
        add(opt4);
       
        options = new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);
       
        next = new JButton("Next");
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        next.setBounds(850, 430, 200, 40);
        add(next);
       
        lifeline = new JButton("50-50 Lifeline");
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        lifeline.setBounds(850, 490, 200, 40);
        add(lifeline);
       
        submit = new JButton("Submit");
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setEnabled(false);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setBounds(850, 550, 200, 40);
        add(submit);
       
        start(0);
       
    }
   @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
           
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }
           
            if(count == 13){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
           
            count++;
            start(count);
        }
        else if(ae.getSource() == submit){
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }
            else {
                pa[count][0] = options.getSelection().getActionCommand();
            }

            for(int i =0 ; i < pa.length ; i++){
                if(pa[i][0].equals(qa[i][1])){
                    score+=10;
                }else{
                    score+=0;
                }
            }
            this.setVisible(false);
            new Score(username, score).setVisible(true);
        }
        else if(ae.getSource() == lifeline){
            if(count == 2 || count == 4 || count == 6 || count == 8 || count == 9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        }
    }
   
    public void paint(Graphics g){
        super.paint(g);
        String time = "Time Left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
       
        if(timer > 0) {
            g.drawString(time, 800, 440);
        }else {
            g.drawString("Times Up!!", 800, 440);
        }
       
        timer--; // 14
       
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
       
        if(ans_given == 1){
            ans_given = 0;
            timer = 15;
        }else if(timer < 0){
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
           
            if(count == 13){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count == 15){
                if(options.getSelection() == null){
                    pa[count][0] = "";
                }else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
               
                for(int i =0 ; i < pa.length ; i++){
                    if(pa[i][0].equals(qa[i][1])){
                        score+=10;
                    }else{
                        score+=0;
                    }
                }
                this.setVisible(false);
                new Score(username, score).setVisible(true);
            }else{
                if(options.getSelection() == null){
                    pa[count][0] = "";
                }else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
    }
   
    public void start(int count){
        qno.setText("" + (count + 1) + ". ");
        question.setText(q[count][0]);
        opt1.setLabel(q[count][1]);
        opt1.setActionCommand(q[count][1]);
        opt2.setLabel(q[count][2]);
        opt2.setActionCommand(q[count][2]);
        opt3.setLabel(q[count][3]);
        opt3.setActionCommand(q[count][3]);
        opt4.setLabel(q[count][4]);
        opt4.setActionCommand(q[count][4]);
        options.clearSelection();
    }
   
    public static void main(String[] args){
        new Pattern(" ").setVisible(true);
    }
}