package Homework_3.Quiz6;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyTest extends JFrame implements ActionListener {
    JButton button;
    JLabel label;


    public MyTest() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("File Chooser Example");


        button = new JButton("Open File Chooser");
        button.addActionListener(this);

        label = new JLabel("");

        add(button, "North");
        add(label, "Center");

        pack();
        setSize(500, 500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            label.setText("Selected file: " + selectedFile.getAbsolutePath());
        }
    }

    public static void main(String[] args) {
        new MyTest();
    }
}

