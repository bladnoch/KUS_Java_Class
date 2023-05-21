package chapter12.Self4;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener2 implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int x= e.getX();
        int y=e.getY();

        Chapter12Self4.simpleLabel.setLocation(x,y);
        Chapter12Self4.simpleLabel.setText(x+", "+y);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
