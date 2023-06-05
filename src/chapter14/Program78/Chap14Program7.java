package chapter14.Program78;

import javax.swing.*;
import java.awt.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Chap14Program7 extends JFrame {
    private SpellChecker spellChecker=null;
    private JTextArea log=new JTextArea();

    public Chap14Program7(){
        super("English spell checker");
        setSize(400,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=getContentPane();
        c.add(new JLabel("This is spell checker"));
        c.add(new JScrollPane(log), BorderLayout.CENTER);
        setVisible(true);

        spellChecker=new Spellchecker("words.txt");

        if(spellChecker.isFileRead()){
            log.setText("Database file [words.txt] is succesfully loaded! \n");
            new ServerThread().start();
        }
    }
    class ServerThread extends Thread{
        public void run(){
            ServerSocket listener = null;
            Socket socket=null;
        }
    }
}
