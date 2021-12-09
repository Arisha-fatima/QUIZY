package quizy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener{
   
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
    Quiz(String username){
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
       
        q[0][0] = "Forest is to tree as tree is to ?";
        q[0][1] = "Plant";
        q[0][2] = "Leaf";
        q[0][3] = "Branch";
        q[0][4] = "Mangrove";

        q[1][0] = "Which of the following can be arranged into a 5-letter English word?";
        q[1][1] = "H R G S T";
        q[1][2] = "R L I A S";
        q[1][3] = "W Q R G S";
        q[1][4] = "A P X S O";

        q[2][0] = "Which answer expresses the meaning of the specified word best?reassuring";
        q[2][1] = "Compassionate";
        q[2][2] = "Comforting";
        q[2][3] = "Explanatory";
        q[2][4] = "Meddlesome";

        q[3][0] = "You answer me although I never ask you questions. What am I?";
        q[3][1] = "Google";
        q[3][2] = "Telivision";
        q[3][3] = "TelePhone";
        q[3][4] = "None of them";

        q[4][0] = "Which answer expresses the meaning opposite of tough?";
        q[4][1] = "Masculine";
        q[4][2] = "Cowardly";
        q[4][3] = "Tender";
        q[4][4] = "Strong";

        q[5][0] = "Water is to a pipe as ? is to a wire.";
        q[5][1] = "Heat";
        q[5][2] = "Electricity";
        q[5][3] = "Cord";
        q[5][4] = "Gas";

        q[6][0] = "Brother is to sister as niece is to";
        q[6][1] = "Mother";
        q[6][2] = "Daughter";
        q[6][3] = "Nephew";
        q[6][4] = "Uncle";

        q[7][0] = "What is the relation between level and equal?";
        q[7][1] = "Not related";
        q[7][2] = "Contradictory";
        q[7][3] = "Opposite";
        q[7][4] = "None of them";

        q[8][0] = "Inflammable and flammable have the same meaning?";
        q[8][1] = "True";
        q[8][2] = "False";
        q[8][3] = "Opposites";
        q[8][4] = "None of them";

        q[9][0] = "Winners never quit and quitters never win. This statement is?";
        q[9][1] = "Motivation";
        q[9][2] = "Doubt";
        q[9][3] = "Strength";
        q[9][4] = "Negativity";
       
        q[10][0] = "Ceiling fan rotates in winter";
        q[10][1] = "Anti-clockwise";
        q[10][2] = "Clockwise";
        q[10][3] = "Litle clock";
        q[10][4] = "Do not rotate";

        q[11][0] = "Knowledge is to ignorance, light is to darkness and weakness is to";
        q[11][1] = "Patience";
        q[11][2] = "Motivation";
        q[11][3] = "Old-age";
        q[11][4] = "None of them";

         q[12][0] = "Shorter + Shorter = Taller, Taller + Taller = ?";
        q[12][1] = "Taller";
        q[12][2] = "Shortest";
        q[12][3] = "Tallest";
        q[12][4] = "Both a and c";

        q[13][0] = "Choose the best analogy.";
        q[13][1] = "sheep : sheeps";
        q[13][2] = "sheep : sheep";
        q[13][3] = "sheep : ship";
        q[13][4] = "Sheep : sheap";
       
        q[14][0] = "Actions speak louder than words. It means";
        q[14][1] = "Every action has its reaction.";
        q[14][2] = "Actions are more important than reactions.";
        q[14][3] = "Actions speak, words don’t.";
        q[14][4] = "None of them";
       
        qa[0][1] = "Leaf";
        qa[1][1] = "R L I A S";
        qa[2][1] = "Comforting";
        qa[3][1] = "TelePhone";
        qa[4][1] = "Tender";
        qa[5][1] = "Electricity";
        qa[6][1] = "Nephew";
        qa[7][1] = "None of them";
        qa[8][1] = "True";
        qa[9][1] = "Motivation";
        qa[10][1] = "Litle clock";
        qa[11][1] = "None of them";
        qa[12][1] = "Both a and c";
        qa[13][1] = "sheep : sheep";
        qa[14][1] = "None of them";
       
       
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
            if(count == 0 || count == 1 || count == 2 || count == 3 || count == 4 || count == 5 || count == 6 || count == 7 || count == 10){
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }else {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
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
            if(count == 14){
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
        new Quiz("").setVisible(true);
    }
}
