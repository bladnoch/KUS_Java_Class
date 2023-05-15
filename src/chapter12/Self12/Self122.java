package chapter12.Self12;

import javax.swing.*;
import java.awt.*;

/**
 * Self122 : Practice 12-2 problem
 * @version v0.0.1
 * @author Dounguk Kim
 * @since 5-12-2023
 */

public class Self122 extends JFrame {
    Self122(){
        setTitle("version 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grd=new GridLayout(4,2);
        grd.setVgap(5);

        Container c= getContentPane();
        c.setLayout(grd);

        c.add(new JLabel("label 1"));
        c.add(new JTextField(""));

        c.add(new JLabel("label 2"));
        c.add(new JTextField(""));

        c.add(new JLabel("label 3"));
        c.add(new JTextField(""));

        c.add(new JLabel("label 4"));
        c.add(new JTextField(""));

        setSize(300,200);
        setVisible(true);
    }
    public static void main(String[] args){
        Self122 a=new Self122();
    }
}
