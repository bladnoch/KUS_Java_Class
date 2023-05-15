package chapter12;

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
        setTitle("example of mouse event"); //타이틀 내용
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창 닫으면 종료
        Container c=getContentPane(); //c변수 안에 contentPane 생성
        c.addMouseListener(new Chap12Program5.MyMouseListener()); //

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

