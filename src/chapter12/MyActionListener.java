package chapter12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        JButton b=(JButton) e.getSource();
        if (b.getText().equals("Action")){
            System.out.println("click");
            b.setText("No Action");
        } else {
            b.setText("Action");
        }
    }
}
