package chapter12;

import chapter12.Program4.Chap12Program4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 set text on place where I clicked with extends MouseAdapter)
 @version v0.0.1
 @since 2023-05-10
 @author Dounguk Kim
 */

public class Chap12Program5 extends JFrame{
    private JLabel simpleLabel=new JLabel("hello");

    public Chap12Program5(){
        setTitle("example of mouse event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.addMouseListener(new Chap12Program5.MyMouseListener());

        c.setLayout(null);
        simpleLabel.setSize(50,20);
        simpleLabel.setLocation(30,30);
        c.add(simpleLabel);

        setSize(250,250);
        setVisible(true);
    }

    public static void main(String[] args){
        new Chap12Program4();
    }

    class MyMouseListener extends MouseAdapter {
        public void mousePressed(MouseEvent e){
            int x=e.getX();
            int y=e.getY();
            simpleLabel.setLocation(x,y);
        }
    }
}

