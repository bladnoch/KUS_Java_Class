package chapter13.Practice3;

import javax.swing.*;
import java.awt.*;

public class FlickeringLabel2 extends JLabel implements Runnable {

    private long delay;
    public FlickeringLabel2(String text, long delay){
        super(text);
        this.delay=delay;
        setOpaque(true);
        Thread th=new Thread(this);
        th.start();
    }

    @Override
    public void run() {
        int n=0;
        while(true){
            if(n==0){
                setBackground(Color.GREEN);
            }
            else {
                setBackground(Color.BLUE);
            }
            if(n==0)n=1;
            else n=0;
            try{
                Thread.sleep(delay);
            } catch (InterruptedException e){
                return;
            }
        }
    }

}
