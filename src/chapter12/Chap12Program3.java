package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 add class that implements main class.
 @version v0.0.1
 @since 2023-05-10
 @author Dounguk Kim
 */

public class Chap12Program3 extends JFrame {
    public Chap12Program3(){
        setTitle("Event example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();

        c.setLayout(new FlowLayout());

        JButton btn=new JButton("Action");
        btn.addActionListener(new MyActionListener());

        c.add(btn);

        setSize(350,150);
        setVisible(true);
    }

    public static void main(String[] args){
        new Chap12Program3();
    }
}

class MyActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        JButton b=(JButton) e.getSource();
        if (b.getText().equals("Action")){
            System.out.println("click");
        } else {
            b.setText("Action");
        }

    }
}
