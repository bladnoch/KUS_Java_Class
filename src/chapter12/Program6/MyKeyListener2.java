package chapter12.Program6;

import javax.swing.*;

public class MyKeyListener2 implements Runnable {
    private JLabel timerLabel;

//    public TimerThread(JLabel timerLabel){
//        this.timerLabel=timerLabel;
//    }

    public void run(){
        int n=0;
        while(true){
            timerLabel.setText(Integer.toString(n));
            n++;
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                return;
            }
        }
    }

}
