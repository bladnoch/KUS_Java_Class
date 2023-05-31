package chapter14.Program56;

import javax.swing.*;
import java.awt.*;

public class Chap14Program5 extends JFrame {
    private JTextArea log =new JTextArea();
    public  Chap14Program5(){
        super("calc server");

        setSize(500,300);
        Container c=getContentPane();
        c.add(new JLabel("This is calc server"));
        c.add(new JScrollPane(log), BorderLayout.CENTER);

        setVisible(true);
        new ServerThread().start();
    }
    public class ServerThread extends Thread{

    }
}
