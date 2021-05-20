import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Score extends JFrame implements ActionListener{
    JButton btn1,btn2;
   String username;
    Score(String username,int fscore){
        this.username = username;
        setBounds(280,120,750,600);
        getContentPane().setBackground(Color.WHITE);
         setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("QuizImg/score.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 350,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel lab1 = new JLabel(i3);      
        lab1.setBounds(0,200,200,350);
        add(lab1);
        
       
        JLabel lab2 = new JLabel("Thank You "+ username + " For Playing");
        lab2.setFont(new Font("Railway",Font.BOLD,26));
        lab2.setForeground(Color.RED);
        lab2.setBounds(80,40,600,35);
        add(lab2);
        
        JLabel lab3 = new JLabel("Your Score is " +fscore);
        lab3.setFont(new Font("Jokerman",Font.BOLD,45));
        lab3.setForeground(new Color(199,21,133));
        lab3.setBounds(240,220,600,50);
        add(lab3);
        
        
        btn2 = new JButton("Cancel");
        btn2.setBounds(400,350,120,35);
        btn2.setBackground(Color.RED);
        btn2.setForeground(Color.WHITE);
        btn2.setFont(new Font("TAHOMBO",Font.BOLD,16));
        btn2.addActionListener(this);
        add(btn2);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn2){
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
       new Score("",0);
    }
}
