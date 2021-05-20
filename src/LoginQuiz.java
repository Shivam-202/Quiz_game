import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginQuiz extends JFrame implements ActionListener{
    public JButton btn1;
    public JButton btn2;
    public JButton btn3;
    public JTextField txt1;
    public int n;
   String username;
    LoginQuiz(){
       
        setBounds(250,100,1200,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        setResizable(false);
        setLayout(null);
         
        getContentPane().setBackground(Color.WHITE);
      
       
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("QuizImg/login.jpeg"));
        JLabel label1=new JLabel(i1);
        label1.setBounds(0,0,640,480);
        add(label1);
        
        Font font = new Font("TAHOMBO",Font.BOLD,33);
       
        JLabel label2 = new JLabel("Simple Quiz For You");
        label2.setBounds(755,60,350,35);
        label2.setFont(font);
        label2.setForeground(Color.BLUE);
        add(label2);
        
        Font font1 = new Font("TAHOMBO",Font.BOLD,25);
        JLabel label3 = new JLabel("Enter Your Name");
        label3.setBounds(810,140,350,35);
        label3.setFont(font1);
        label3.setForeground(Color.BLUE);
        add(label3);
        
        Font font2 = new Font("TAHOMBO",Font.BOLD,18);
        txt1 = new JTextField();
        txt1.setBounds(780,190,270,30);
        txt1.setFont(font2);
        txt1.setForeground(Color.BLACK);
        add(txt1);
        
        Cursor cur = new Cursor(Cursor.HAND_CURSOR);
        
        btn1 = new JButton("Exit");
        btn1.setBounds(720,280,110,35);
        btn1.setBackground(Color.RED);
        btn1.setForeground(Color.WHITE);
        btn1.setCursor(cur);
        btn1.setFont(font2);
        btn1.addActionListener(this);
        add(btn1);
        
        btn2 = new JButton("Rules");
        btn2.setBounds(860,280,110,35);
        btn2.setBackground(Color.blue);
        btn2.setForeground(Color.WHITE);
        btn2.setCursor(cur);
        btn2.setFont(font2);
        btn2.addActionListener(this);
        add(btn2);
        
        btn3 = new JButton("Start");
        btn3.setBounds(1000,280,110,35);
        btn3.setBackground(Color.GREEN);
        btn3.setForeground(Color.WHITE);
        btn3.setCursor(cur);
        btn3.setFont(font2);
        btn3.addActionListener(this);
        add(btn3);
        
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        username = txt1.getText();
        System.out.println(username);
       if(e.getSource() == btn1){
           this.setVisible(false);          
       }
       
       if(e.getSource() == btn2){
         
           this.setVisible(false); 
           new Rules(username).setVisible(true);
          
       }
       
        if(e.getSource() == btn3){
               this.setVisible(false);     
              new QuizGame(username).setVisible(true);
            
       }
    }
     public static void main(String[] args){
         new LoginQuiz();
         
     }

}
