package chapter14.Program78;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

/**
 * Chap14Program8 Client Program:(client)
 * 
 * @author Minseok Seo
 * @since 2023-05-31
 * @version 0.0.1
 */
 

public class Chap14Prog8 extends JFrame {
	
	private JTextField wordTf = new JTextField(7);
	private JLabel resLabel = new JLabel("Check result ");
	private Socket socket = null;
	private BufferedReader in = null;
	private BufferedWriter out = null;
	
	public Chap14Prog8() {
		
		super("Client of English spell checker");
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("Input English word"));
		c.add(wordTf);
		c.add(resLabel);
		
		setVisible(true);
		setupConnection();
		
		wordTf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField tf = (JTextField)e.getSource();
				try {
					String word = tf.getText().trim();					
					if(word.length() == 0)
						return;
					
					out.write(word + "\n");
					out.flush();
					
					String result = in.readLine();
					resLabel.setText(word + " is " + result);
				} catch (IOException e1) {
					System.out.println("Client : terminated connection from server");
					return;
				}
				
			}
			
		});
	}
	
	public void setupConnection() {
		try {
			socket = new Socket("localhost", 9998);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Chap14Prog8();
	}

}
