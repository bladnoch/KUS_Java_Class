package chapter12.Self5;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseListenerFor5 extends MouseAdapter {
    @Override
    public void mousePressed(MouseEvent e) {
//        super.mousePressed(e);
        int x=e.getX();
        int y=e.getY();

        Chapter12Self5.simple.setLocation(x,y);
        Chapter12Self5.simple.setText(x+", "+y);
    }
}
