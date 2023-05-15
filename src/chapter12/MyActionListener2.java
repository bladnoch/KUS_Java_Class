package chapter12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener2 implements ActionListener {
    public void actionPerformed(ActionEvent e){
        JButton b=(JButton) e.getSource();
        if (b.getText().equals("Hey")) {
            b.setText("Hello");
        } else {
            b.setText("Hey");
        }

    }
}
