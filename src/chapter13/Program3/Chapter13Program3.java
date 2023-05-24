package chapter13.Program3;

import chapter13.Program2.Chapter13Program2;

import javax.swing.*;
import java.awt.*;

/**
 * flickering multi Threads
 * @author Dounguk Kim
 * @since 5/24/2023
 * @version v0.0.1
 */
public class Chapter13Program3 extends JFrame {
    /**
     * this has total of 3 threads(thread it safe is also count as thread)
     */
    public Chapter13Program3(){
        setTitle("asdf");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(new FlowLayout());

        FlickeringLabel fLabel=new FlickeringLabel("Blink",500);
        JLabel label=new JLabel("no blink");
        FlickeringLabel flabel2=new FlickeringLabel("Blink independently",300);

        c.add(fLabel);
        c.add(label);
        c.add(flabel2);

        setSize(300,150);
        setVisible(true);

    }
    public static void main(String[] args){
        new Chapter13Program3();
    }
}
