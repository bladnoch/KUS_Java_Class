package chapter13.Practice3;

import chapter13.Practice2.Chapter13Practice2;

import javax.swing.*;
import java.awt.*;

public class Chapter13Practice3 extends JFrame {
    public Chapter13Practice3(){
        setTitle("practice 13-3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=new Container();
        c.setLayout(new FlowLayout());

        FlickeringLabel2 fLabel=new FlickeringLabel2("Hello, ",500);
        JLabel label=new JLabel("World! ");
        FlickeringLabel2 fLabel2=new FlickeringLabel2("This is DK" ,300);

        c.add(fLabel);
        c.add(label);
        c.add(fLabel2);

        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args){
        new Chapter13Practice3();
    }
}
