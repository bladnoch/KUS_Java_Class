package chapter12.Self6;

import chapter12.Program6.Chapter12Program6;
import chapter12.Self5.Chapter12Self5;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class MyKeyListenerFor6 extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode=e.getKeyCode();
        switch (keyCode){
            case KeyEvent.VK_UP:
                Chapter12Self6.simple.setLocation(Chapter12Self6.simple.getX(),Chapter12Self6.simple.getY()-Chapter12Self6.DST);
                break;
            case KeyEvent.VK_DOWN:
                Chapter12Self6.simple.setLocation(Chapter12Self6.simple.getX(),Chapter12Self6.simple.getY()+Chapter12Self6.DST);
                break;
            case KeyEvent.VK_LEFT:
                Chapter12Self6.simple.setLocation(Chapter12Self6.simple.getX()-Chapter12Self6.DST,Chapter12Self6.simple.getY());
                break;
            case KeyEvent.VK_RIGHT:
                Chapter12Self6.simple.setLocation(Chapter12Self6.simple.getX()+Chapter12Self6.DST,Chapter12Self6.simple.getY());
                break;
        }
    }
}
