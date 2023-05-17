package chapter12.Program4;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 set text on place where I clicked (implements with MouseListener)
 @version v0.0.1
 @since 2023-05-10
 @author Dounguk Kim
 */
public class Chap12Program4 extends JFrame{
    private JLabel simpleLabel=new JLabel("hello");

    public Chap12Program4(){
        setTitle("example of mouse event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.addMouseListener(new MyMouseListener());

        c.setLayout(null);
        simpleLabel.setSize(50,20);
        simpleLabel.setLocation(110,120);
        c.add(simpleLabel);

        setSize(250,250);
        setVisible(true);
    }

    public static void main(String[] args){
        new Chap12Program4();
    }

//    class MyMouseListener implements MouseListener {
//        public void mousePressed(MouseEvent e){
////            int x=e.getX();
////            int y=e.getY();
////            simpleLabel.setLocation(x,y);
//        }
//        public void mouseReleased(MouseEvent e){
////            int x=e.getX();
////            int y=e.getY();
////            simpleLabel.setLocation(x,y);
//        }
//        public void mouseClicked(MouseEvent e){
////            int x=e.getX();
////            int y=e.getY();
////            simpleLabel.setLocation(x,y);
//        }
//        public void mouseEntered(MouseEvent e){
////            int x=e.getX();
////            int y=e.getY();
////            simpleLabel.setLocation(x,y);
//        }
//        public void mouseExited(MouseEvent e){
//            int x=e.getX();
//            int y=e.getY();
//            simpleLabel.setLocation(x,y);
//        }
//    }
}

