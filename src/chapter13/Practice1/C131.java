package chapter13.Practice1;

import javax.swing.*;
import java.awt.*;

/**
 * practice first Thread study
 * @author Dounguk Kim
 * @since 5/20/2023
 * @version v0.0.3
 */
public class C131 extends JFrame {

    public C131(){
        this.setTitle("C131");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerLabel=new JLabel();
        timerLabel.setFont(new Font("Gothic",Font.ITALIC,180));
        c.add(timerLabel);

        TimerThread2 th=new TimerThread2(timerLabel);

        setSize(300,300);
        setVisible(true);

        th.start();
    }
    public static void main(String[] args){
        new C131();
    }
}
