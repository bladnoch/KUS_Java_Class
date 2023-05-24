package chapter13.Practice2;

import chapter13.Program2.TimerRunnable;

import javax.swing.*;
import java.awt.*;

public class Chapter13Practice2 extends JFrame {
    public Chapter13Practice2(){
        this.setTitle("Timer example Practice");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerLabel=new JLabel("timerLabel");
        timerLabel.setFont(new Font("Gothic",Font.BOLD,180));
        c.add(timerLabel);

        /**
         * implement는 클래스를 바로 만들 수 없기 때문에
         * Thread 클래스를 추가로 만들어서 runnable2를 사용할 수 있게 한다
         */
        TimerRunnable2 runnable2=new TimerRunnable2(timerLabel);
        Thread th=new Thread(runnable2);

        setSize(300,300);
        setVisible(true);

        th.start();
    }

    public static void main(String[] args){
        new Chapter13Practice2();
    }
}
