import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.*;


/**
 * Chap14Program7 Client Program:
 * 
 * @author Minseok Seo
 * @since 2023-05-31
 * @version 0.0.1
 */
 
public class Chap14Program7 extends JFrame {
	
	private SpellChecker spellChecker = null;
	private JTextArea log = new JTextArea();
	
	public Chap14Program7() {
		super("English spell checker");
		setSize(400, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.add(new JLabel("This is spell checker!"));
		c.add(new JScrollPane(log), BorderLayout.CENTER);
		setVisible(true);
		
		spellChecker = new SpellChecker("words.txt");
		
		if(spellChecker.isFileRead()) {
			log.setText("Database file [words.txt] is succesfully loaded! \n");
			new ServerThread().start();
		}
	}
	
	class ServerThread extends Thread {
		@Override
		public void run() {
			ServerSocket listener = null;
			Socket socket = null;
			try {
				listener = new ServerSocket(9998);
				while(true) {
					socket = listener.accept();
					log.append("Connected client \n");
					new ServiceThread(socket).start();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(listener != null)
					listener.close();
				if(socket != null)
					socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	class SpellChecker {
		private Vector<String> v = new Vector<String>();
		private boolean fileOn = false;
		
		public SpellChecker(String fileName) {
			try {
				Scanner reader = new Scanner(new FileReader(fileName));
				while(reader.hasNext()) {
					String word = reader.nextLine();
					v.add(word);
				}
				reader.close();
				fileOn = true;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				fileOn = false;
			}
		}
		
		public boolean isFileRead() {
			return fileOn;
		}
		
		public boolean check(String word) {
			if(v.contains(word))
				return true;
			else
				return false;
		}
	}
	
	class ServiceThread extends Thread {
		private Socket socket = null;
		private BufferedReader in = null;
		private BufferedWriter out = null;
		public ServiceThread(Socket socket) {
			this.socket = socket;
			try {
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			while(true) {
				try {
					String word = in.readLine();
					boolean res = spellChecker.check(word);
					if(res == true) {
						out.write("CORRECT!\n");
						log.append(word + "=CORRECT\n");
					}
					else { 
						out.write("INCORRECT\n");
						log.append(word + "=INCORRECT\n");						
					}
					out.flush();
				} catch (IOException e) {
					log.append("Connection terminated... \n");
					System.out.println("Connection terminated...");
					try {
						socket.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					return;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Chap14Program7();
	}

}
