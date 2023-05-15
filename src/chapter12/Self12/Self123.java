package chapter12.Self12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Self123 : Practice 12-3 problem
 * @version v0.0.1
 * @author Dounguk Kim
 * @since 5-12-2023
 */

public class Self123 extends JFrame {
    public Self123(){
        setTitle("12-3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();

        c.setLayout(new FlowLayout());

        JButton button=new JButton("action");
        button.addActionListener(new Adder());

        c.add(button);


        setSize(350,150);
        setVisible(true);
    }
    public static void main(String[] args){
        new Self123();
    }
}

class Adder implements ActionListener{
    public void actionPerformed(ActionEvent e){
        JButton btn=(JButton) e.getSource();
        if (btn.getText().equals("Action")){
            System.out.println("Action");
            btn.setText("No Action");
        } else if(btn.getText().equals("No Action")){
            btn.setText("Action");
        } else {
            System.out.println("No Action");
            btn.setText("No Action");
        }
    }
}
