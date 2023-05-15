package chapter12.Self12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.TextEvent;

public class Self124 extends JFrame {
    private JLabel simpleLabel =new JLabel("yohoho");

    public Self124(){
        setTitle("version 4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.addMouseListener(new CheckAction());

        c.setLayout(null);
        simpleLabel.setSize(50,30);
        simpleLabel.setLocation(100,100);
        c.add(simpleLabel);


        setSize(400,600);
        setVisible(true);

    }
    public static void main(String[] args){
        new Self124();
    }


class CheckAction implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        simpleLabel.setLocation(x, y);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }
}
}
