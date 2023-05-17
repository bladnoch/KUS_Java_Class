package chapter12.Program5;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MyMouseListener2 extends MouseAdapter {
    private JLabel temp;
    MyMouseListener2(JLabel simpleLabel){
        temp=simpleLabel;
    }
    public void mousePressed(MouseEvent e){
        int x=e.getX();
        int y=e.getY();
        temp.setLocation(x,y);
    }

}
