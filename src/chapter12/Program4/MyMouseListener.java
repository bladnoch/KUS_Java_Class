package chapter12.Program4;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener implements MouseListener {
    public void mousePressed(MouseEvent e){

        int x=e.getX();
        int y=e.getY();


        Chap12Program4.simpleLabel.setLocation(x,y);
        Chap12Program4.simpleLabel.setText(x+", "+y);
    }
    public void mouseReleased(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}

}
