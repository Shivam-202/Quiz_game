import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class QuizGame extends JFrame implements ActionListener{
   String q[][] = new String[10][5];
   public static int count = 0;
   public static int timer = 15;
   public static int ans_given = 0;
   public static int score = 0;
   public JLabel qno,question;
   public JRadioButton opt1,opt2,opt3,opt4;
   public ButtonGroup options;
   public JButton next,lifeline,submit;
   
   String pa[][] = new String[10][1];
   String qa[][] = new String[10][2];
   String username;
   
    QuizGame(String username){
       this.username = username;
        setBounds(70,50,1440,750);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
         
             
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("QuizImg/quiz.jpg"));
        JLabel lab1 = new JLabel(i2);
        lab1.setBounds(0,0,1440,392);
        add(lab1);
    
         qno = new JLabel("");
        qno.setBounds(60,430,100,30);
        qno.setFont(new Font("TAHOMBO",Font.PLAIN,19));
        add(qno);
        
         q[0][0] = " What do letters LBW stands for?";
   q[0][1] = "Left behind wicket";
   q[0][2] = "Left before wicket";
   q[0][3] = "Leg before wicket";
   q[0][4] = "Leg behind wicket";

q[1][0] = " Who did the last over for India in the 2007 T20 World Cup final?";
     q[1][1] = "Joginder Sharma";
     q[1][2] = "R P Singh";
     q[1][3] = "Irfan Pathan";
     q[1][4] = "S Sreesanth";

q[2][0] = " Who is the batsman to score the most consecutive centuries in ODIs World Cup?";
     q[2][1]  = "Sachin Tendulkar";
     q[2][2]  = "Rohit Sharma";
     q[2][3]  = "Ricky Ponting";
     q[2][4]  = "Kumar Sangakkara";


q[3][0] = " Who was the highest wicket taker in the 2019 World Cup?";
      q[3][1] = "Mitchell Starc";
      q[3][2] = "Jofra Archer";
      q[3][3] = "Jasprit Bumrah";
      q[3][4] = "Pat Cummins";

q[4][0] = " How many centuries did Rohit Sharma score in the 2019 World Cup?";
      q[4][1] = "5";
      q[4][2] = "3";
      q[4][3] = "4";
      q[4][4] = "6";


q[5][0] = " On which ground was the 2016 T20 World Cup final played?";
   q[5][1] = "Wankhede stadium";
   q[5][2] = "Eden Garden stadium";
   q[5][3] = "Chinnaswamy stadium";
   q[5][4] = "Feroz Shah Kotla stadium";

q[6][0] = " How many sixes did Ben stokes last over by carlos Brathwaite in the 2016 T20 World Cup final?";
      q[6][1] = "2";
      q[6][2] = "1";
      q[6][3] = "4";
      q[6][4] = "3";

q[7][0] = " When was first ICC cricket World Cup started?";
      q[7][1] = "1983";
      q[7][2] = "1975";
      q[7][3] = "1996";
      q[7][4] = "1979";
    
q[8][0] = " Which Indian cricketer had won the “Man of the Match” award in the final of the ICC World Cup 1983?";
      q[8][1] = "Mohinder Amarnath";
      q[8][2] = "Sunil Gavaskar";
      q[8][3] = "Kapil Dev";
      q[8][4] = "Ravi Shastri";
    
q[9][0] = " Which cricket team has won most ICC Cricket World Cup titles? ";
      q[9][1] = "England";
      q[9][2] = "India";
      q[9][3] = "West Indies";
      q[9][4] = "Australia";
      
     
      
    qa[0][1] = "Leg before wicket";
    qa[1][1] = "Joginder Sharma";
    qa[2][1] = "Kumar Sangakkara";
    qa[3][1] = "Mitchell Starc";
    qa[4][1] = "5";
    qa[5][1] = "Eden Garden stadium";
    qa[6][1] = "4";
    qa[7][1] = "1975";
    qa[8][1] = "Mohinder Amarnath";
    qa[9][1] = "Australia";
    
    
        
        question = new JLabel("");
        question.setBounds(80,430,900,30);
        question.setFont(new Font("TAHOMBO",Font.PLAIN,19));
        add(question);
        
        opt1 = new JRadioButton("");
        opt1.setBounds(90,480,500,30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("TAHOMBO",Font.PLAIN,17));
        add(opt1);
        
          opt2 = new JRadioButton("");
        opt2.setBounds(90,515,500,30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("TAHOMBO",Font.PLAIN,17));
        add(opt2);
       
        opt3 = new JRadioButton("");
        opt3.setBounds(90,550,500,30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("TAHOMBO",Font.PLAIN,17));
        add(opt3);
        
        opt4 = new JRadioButton("");
        opt4.setBounds(90,585,500,30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("TAHOMBO",Font.PLAIN,17));
        add(opt4);
        
        options = new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(1170,490,120,35);
        next.setBackground(Color.BLUE);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("TAHOMBO",Font.BOLD,19));
        next.addActionListener(this);
        add(next);
        
        lifeline = new JButton("50-50");
        lifeline.setBounds(1170,555,120,35);
        lifeline.setBackground(Color.RED);
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        lifeline.setFont(new Font("TAHOMBO",Font.BOLD,18));
        add(lifeline);
        
        submit = new JButton("Submit");
        submit.setBounds(1170,620,120,35);
        submit.setBackground(Color.ORANGE);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("TAHOMBO",Font.BOLD,19));
        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);
        
       
       setVisible(true);
         start(0);
         
    }
    
    
     
   @Override
    public void actionPerformed(ActionEvent e){
        // Next Button
        if(e.getSource() == next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }
            else{
                pa[count][0] = options.getSelection().getActionCommand();
            }
            
             if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
             
            count++;
            start(count);
        }
        // Lifeline Button
        else if(e.getSource() == lifeline){
           
          if(count == 0 || count == 6){
               opt1.setEnabled(false);
               opt2.setEnabled(false);
           }
           if(count == 1 || count == 3 || count == 4 || count == 8){
               opt2.setEnabled(false);
               opt4.setEnabled(false);
              
           }
            if(count == 2 || count == 9){
               opt1.setEnabled(false);
               opt3.setEnabled(false);
           }
           if(count == 5 || count == 7){
               opt3.setEnabled(false);
               opt4.setEnabled(false);
           }

          lifeline.setEnabled(false);
        }
        // Submit Button
       else if(e.getSource() == submit){
             if(options.getSelection() == null){
                      pa[count][0] = "";
                 }
                 else{
                     pa[count][0] = options.getSelection().getActionCommand();
                 }
                 
                 for(int i=0;i<pa.length;i++){
                     if(pa[i][0].equals(qa[i][1])){
                         score += 10;
                     }else{
                         score +=0;
                     }
                 }
                 this.setVisible(false);
                 new Score(username,score).setVisible(true);
             }
        
    } 
   
     public void start(int count){
        qno.setText(""+ (count + 1)+  ". ");
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
     
     
   @Override
    public void paint(Graphics g){
        super.paint(g);
        String time = "Time Left :- "+ timer +" Seconds";
        
        g.setFont(new Font("TAHOMBO",Font.BOLD,25));
        g.setColor(Color.BLUE);
       
   
        if(timer > 0){
             g.drawString(time,1110,485);
        }
        else{
            g.setFont(new Font("TAHOMBO",Font.BOLD,25));
            g.setColor(Color.RED);
            g.drawString("Times Up...!!",1150,485);  
        } 
        
       
        timer--;
        try{
              Thread.sleep(1000);
              repaint();
           }catch(Exception e){
             e.printStackTrace();
        }
        
        if(ans_given == 1){
             ans_given = 0;
            timer = 15;
           
        }
         
         if(timer < 0){
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
           if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
           
           if(count == 9){
                 if(options.getSelection() == null){
                      pa[count][0] = "";
                 }
                 else{
                     pa[count][0] = options.getSelection().getActionCommand();
                 }
                 
                 for(int i=0;i<pa.length;i++){
                     if(pa[i][0].equals(qa[i][1])){
                         score += 10;
                     }else{
                         score +=0;
                     }
                 }
                 this.setVisible(false);
                 new Score(username,score).setVisible(true);
             }
           else{
               if(options.getSelection() == null){
                      pa[count][0] = "";
                 }
                 else{
                     pa[count][0] = options.getSelection().getActionCommand();
                 }
                 count++;
                 start(count);

           }
          
        }
    }
    
    
    public static void main(String[] args){
        new QuizGame("");
    }
}
