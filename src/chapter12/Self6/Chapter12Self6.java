package chapter12.Self6;


import javax.swing.*;
import java.awt.*;

public class Chapter12Self6 extends JFrame {
    final static int DST=15;
    static JLabel simple=new JLabel("hello");
    Chapter12Self6(){
        setTitle("title here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.addKeyListener(new MyKeyListenerFor6());
        c.setLayout(null);

        simple.setSize(50,100);
        simple.setLocation(120,50);
        c.add(simple);

        setSize(300,300);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    public static void main(String[] args){
        new Chapter12Self6();
    }
}
