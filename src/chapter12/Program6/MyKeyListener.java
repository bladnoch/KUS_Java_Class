package chapter12.Program6;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyKeyListener extends KeyAdapter {
    public void keyPressed(KeyEvent e){
        int keyCode=e.getKeyCode();

        switch (keyCode){
            case KeyEvent.VK_UP:
                Chapter12Program6.la.setLocation(Chapter12Program6.la.getX(),Chapter12Program6.la.getY() - Chapter12Program6.FLYING_UNIT);
                break;
            case KeyEvent.VK_DOWN:
                Chapter12Program6.la.setLocation(Chapter12Program6.la.getX(),Chapter12Program6.la.getY() + Chapter12Program6.FLYING_UNIT);
                break;
            case KeyEvent.VK_LEFT:
                Chapter12Program6.la.setLocation(Chapter12Program6.la.getX()-Chapter12Program6.FLYING_UNIT, Chapter12Program6.la.getX());
                break;
            case KeyEvent.VK_RIGHT:
                Chapter12Program6.la.setLocation(Chapter12Program6.la.getX()+Chapter12Program6.FLYING_UNIT, Chapter12Program6.la.getY());
        }
    }
}
