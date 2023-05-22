package chapter12.Program5;

import chapter12.Program4.Chap12Program4;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MyMouseListener2 extends MouseAdapter {
    public void mousePressed(MouseEvent e){
        int x=e.getX();
        int y=e.getY();


        Chap12Program5.simpleLabel.setLocation(x,y);
    }
    class MyMouseListener extends MouseAdapter {
        public void mousePressed(MouseEvent e){
            int x=e.getX();
            int y=e.getY();
            Chap12Program5.simpleLabel.setLocation(x,y);
        }
    }

}
