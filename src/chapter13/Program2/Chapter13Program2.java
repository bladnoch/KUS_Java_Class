package chapter13.Program2;

import javax.swing.*;
import java.awt.*;

public class Chapter13Program2 extends JFrame {
    public Chapter13Program2(){
        this.setTitle("Timer Example");
        Container c=getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerLabel= new JLabel("timerLabel");
        timerLabel.setFont(new Font("Gothic", Font.ITALIC,80));
        c.add(timerLabel);

        TimerRunnable runnable=new TimerRunnable(timerLabel);
        Thread th=new Thread(runnable);

        setSize(300,170);
        setVisible(true);

        th.start();

    }
    public static void main(String[] args){
        new Chapter13Program2();
    }
}
