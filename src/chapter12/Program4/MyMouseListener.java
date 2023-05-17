package chapter12.Program4;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener implements MouseListener {
    private JLabel sl;

    public void setSL(JLabel sLabel, int x, int y){
        sl=sLabel;
        sl.setLocation(x,y);
    }
    public JLabel getSL(){
        return sl;
    }
    public void mousePressed(MouseEvent e){

        int x=e.getX();
        int y=e.getY();


//        simpleLabel.setLocation(x,y);
//        simpleLabel.setText(x+", "+y);
    }
    public void mouseReleased(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}

}
