package chapter12.Program6;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Chapter12Program6 extends JFrame{

    final static int FLYING_UNIT=10;
    static JLabel la=new JLabel("Hello");

    public Chapter12Program6(){
        setTitle("Example of key event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(null);
        c.addKeyListener(new MyKeyListener());

        la.setLocation(100,100);
        la.setSize(100,20);
        c.add(la);
        setSize(300,300);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();

        c.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                Component com=(Component) e.getSource();
                com.setFocusable(true);
                com.requestFocus();

                System.out.println("test working...");
            }
        });
    }

//class MyKeyListener extends KeyAdapter{
//    public void keyPressed(KeyEvent e){
//        int keyCode=e.getKeyCode();
//
//        switch (keyCode){
//            case KeyEvent.VK_UP:
//                la.setLocation(la.getX(),la.getY() - FLYING_UNIT);
//                break;
//            case KeyEvent.VK_DOWN:
//                la.setLocation(la.getX(),la.getY() + FLYING_UNIT);
//                break;
//            case KeyEvent.VK_LEFT:
//                la.setLocation(la.getX()-FLYING_UNIT, la.getX());
//                break;
//            case KeyEvent.VK_RIGHT:
//                la.setLocation(la.getX()+FLYING_UNIT, la.getY());
//        }
//    }

//}
    public static void main(String[] args){
        new Chapter12Program6();
    }
}