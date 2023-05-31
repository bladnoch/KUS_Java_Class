package chapter14.Program56;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.Socket;

public class Chap14Program6 extends JFrame {
    private JTextField startTf=new JTextField(7);
    private JTextField operatorTf= new JTextField(3);
    private JTextField endTf=new JTextField(7);
    private JTextField resTf=new JTextField(7);
    private JButton calcBtn=new JButton("calc");
    private Socket socket=null;
    private BufferedReader in = null;
    private BufferedWriter out=null;
}
