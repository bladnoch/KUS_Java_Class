package chapter12.Self4;

import javax.swing.*;
import java.awt.*;

public class Chapter12Self4 extends JFrame {
    static JLabel simpleLabel=new JLabel("JLabel text");
    public Chapter12Self4(){

        setTitle("self12-4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.addMouseListener(new MyMouseListener2());

        c.setLayout(null);
        simpleLabel.setSize(100,50);
        simpleLabel.setLocation(110,50);
        c.add(simpleLabel);


        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args){
        new Chapter12Self4();
    }
}
