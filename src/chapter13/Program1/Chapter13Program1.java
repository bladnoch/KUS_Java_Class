package chapter13.Program1;

import javax.swing.*;
import java.awt.*;

public class Chapter13Program1 extends JFrame {
    public Chapter13Program1(){
        this.setTitle("13-1");
        Container c=getContentPane();
        c.setLayout((new FlowLayout()));
        
        JLabel timerLabel=new JLabel();
        timerLabel.setFont(new Font("Gothic",Font.ITALIC, 80));
        c.add(timerLabel);
        
        TimerThread th=new TimerThread(timerLabel);
        
        setSize(300,170);
        setVisible(true);
        
        th.start();
    }
    public static void main(String[] args){
        new Chapter13Program1();
    }
}
