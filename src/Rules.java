import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Rules extends JFrame implements ActionListener{
    
    private JButton btn1;
    private JButton btn2;
 
     String username;
    Rules(String username){
       this.username = username;
       setBounds(250,120,900,650);
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       Font font = new Font("Viner Hand ITC",Font.BOLD,30);
       JLabel lab = new JLabel("WelCome "+username +" to Simple Quiz");
       lab.setBounds(120,60,650,35);
       lab.setFont(font);
       lab.setForeground(Color.BLUE);
      add(lab);
       
       Font font1 = new Font("TAHOMBO",Font.PLAIN,19);
       JLabel lab1 = new JLabel("1. In this Quiz, there will be 10 easy questions that you have to answer. ");
       lab1.setBounds(50,130,800,25);
       lab1.setFont(font1);
       lab1.setForeground(Color.BLACK);
       add(lab1);
       
       JLabel lab2 = new JLabel("2. You can also use 50-50 Lifeline once in this game.");
       lab2.setBounds(50,175,800,25);
       lab2.setFont(font1);
       lab2.setForeground(Color.BLACK);
       add(lab2);
       
       JLabel lab3 = new JLabel("3. Tick the right answer and if your answeris Correct then youget 10 points.");
       lab3.setBounds(50,220,800,25);
       lab3.setFont(font1);
       lab3.setForeground(Color.BLACK);
       add(lab3);
       
       JLabel lab4 = new JLabel("4. After completing 10 questions, click on the Submit button .");
       lab4.setBounds(50,265,800,25);
       lab4.setFont(font1);
       lab4.setForeground(Color.BLACK);
       add(lab4);
       
       JLabel lab5 = new JLabel("5. Your score will be displayed on the screen in the end.");
       lab5.setBounds(50,310,800,25);
       lab5.setFont(font1);
       lab5.setForeground(Color.BLACK);
       add(lab5);
       
       JLabel lab6 = new JLabel("6. Time will be 15 seconds for each question.");
       lab6.setBounds(50,355,900,25);
       lab6.setFont(font1);
       lab6.setForeground(Color.BLACK);
       add(lab6);
       
       JLabel lab7 = new JLabel("7. Good Luck for the game ,and I hope you do well so Click On start.");
       lab7.setBounds(50,400,900,25);
       lab7.setFont(font1);
       lab7.setForeground(Color.BLACK);
       add(lab7);
       
       Font font2 = new Font("TAHOMBO",Font.BOLD,18);
       Cursor cur = new Cursor(Cursor.HAND_CURSOR);
       
        btn1 = new JButton("Back");
       btn1.setBounds(200,475,110,35);
       btn1.setBackground(Color.BLUE);
       btn1.setForeground(Color.WHITE);
       btn1.setFont(font2);
       btn1.setCursor(cur);
       btn1.addActionListener(this);
       add(btn1);
       
       btn2 = new JButton("Start");
       btn2.setBounds(440,475,110,35);
       btn2.setBackground(Color.GREEN);
       btn2.setForeground(Color.WHITE);
       btn2.setFont(font2);
       btn2.addActionListener(this);
       btn2.setCursor(cur);
       add(btn2);
       
       
      setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn1){
            this.setVisible(false);
            new LoginQuiz().setVisible(true);
            
        }
        
        if(e.getSource() == btn2){
            this.setVisible(false);
            new QuizGame(username).setVisible(true);
        }
    }
    public static void main(String[] args){
        new Rules("");
    }
}
