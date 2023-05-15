package chapter12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        JButton b=(JButton) e.getSource();
        if (b.getText().equals("ON")){
            System.out.println("if");
            b.setText("OFF");
        } else if (b.getText().equals("Hey")) {
            b.setText("Hello");
        } else if (b.getText().equals("Hello")) {
            b.setText("Hey");
        }
        else {
            b.setText("ON");
            System.out.println("else");
        }
    }
}
