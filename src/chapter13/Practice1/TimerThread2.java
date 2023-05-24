package chapter13.Practice1;

import javax.swing.*;

public class TimerThread2 extends Thread{
    private JLabel timeLabel;
    public TimerThread2(JLabel timerLabel){this.timeLabel=timerLabel;}
    @Override
    public void run() {
        int n=0;
        while(true){
            timeLabel.setText(Integer.toString(n));
            n++;
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                return;
            }
        }
    }
}
