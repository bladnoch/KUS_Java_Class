package chapter12;

import javax.swing.*;
import java.awt.*;

/**
 JFrame with some input
 @version v0.0.1
 @since 2023-05-10
 @author Dounguk Kim
 */

public class Chap12Program2  extends JFrame {
    public Chap12Program2(){
        setTitle("Chapter12Program2 Example!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid =new GridLayout(4,2);
        grid.setVgap(5);

        Container c=getContentPane();
        c.setLayout(grid);

        c.add(new JLabel("Name"));
        c.add(new JTextField(""));

        c.add(new JLabel("ID"));
        c.add(new JTextField(""));

        c.add(new JLabel("Department"));
        c.add(new JTextField(""));

        c.add(new JLabel("Grade"));
        c.add(new JTextField(""));

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args){
        new Chap12Program2();
    }
}
