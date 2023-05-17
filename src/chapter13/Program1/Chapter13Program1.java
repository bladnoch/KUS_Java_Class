package chapter13.Program1;

import javax.swing.*;
import java.awt.*;

/**
 * first Thread study
 * @version v0.0.1
 * @since 5-17-2023
 * @author Dounguk Kim
 */



public class Chapter13Program1 extends JFrame {
    public Chapter13Program1(){
        this.setTitle("13-1");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout((new FlowLayout()));
        
        JLabel timerLabel=new JLabel(); //중요
        timerLabel.setFont(new Font("Gothic",Font.ITALIC, 100)); //중요
        c.add(timerLabel);
        
        TimerThread th=new TimerThread(timerLabel); //중요
        
        setSize(180,170);
        setVisible(true);
        
        th.start();
    }
    public static void main(String[] args){
        new Chapter13Program1();
    }
}
