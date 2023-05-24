package chapter12.Program3;

import chapter12.MyActionListener2;

import javax.swing.*;
import java.awt.*;


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

        JButton btn=new JButton("ON/OFF");
        JButton btn2=new JButton("Hey/Hello");

        btn.addActionListener(new MyActionListener());
        btn2.addActionListener(new MyActionListener2());

        c.add(btn);
        c.add(btn2);

        setSize(350,150);
        setVisible(true);
    }

    public static void main(String[] args){
        new Chap12Program3();
    }
}

//class MyActionListener implements ActionListener{
//    public void actionPerformed(ActionEvent e){
//        JButton b=(JButton) e.getSource();
//        if (b.getText().equals("Action")){
//            System.out.println("click");
//            b.setText("No Action");
//        } else {
//            b.setText("Action");
//        }
//
//    }
//}
