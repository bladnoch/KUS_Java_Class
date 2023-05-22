package chapter12.Self5;

import javax.swing.*;
import java.awt.*;

public class Chapter12Self5 extends JFrame {
    static JLabel simple=new JLabel("12-5 self");
    public Chapter12Self5(){
        setTitle("self12-5");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.addMouseListener(new MyMouseListenerFor5());

        setLayout(null);
        simple.setSize(100,10);
        simple.setLocation(50,50);
        c.add(simple);


        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args){
        new Chapter12Self5();
    }
}
