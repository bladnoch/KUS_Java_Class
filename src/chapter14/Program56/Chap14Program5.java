package chapter14.Program56;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

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
        @Override
        public void run() {
            ServerSocket listener=null;
            Socket socket=null;
            try{
                listener=new ServerSocket(1234);
                while(true){
                    socket=listener.accept();
                    log.append("Client connected..\n");
                    new ServiceThread(socket).start();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
            try{
                if(listener!=null){
                    listener.close();
                }
                if(socket!=null){
                    listener.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public class ServiceThread extends Thread{
        private Socket socket=null;
        private BufferedReader in = null;
        private BufferedWriter out=null;

        public ServiceThread(Socket socket){
            this.socket=socket;
            try{
                in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out =new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            while(true){
                try{
                    String first=in.readLine();
                    String operator = in.readLine();
                    String second=in.readLine();
                    int a=Integer.parseInt(first);
                    int b=Integer.parseInt(second);

                    String resText="";
                    int res=0;
                    switch (operator){
                        case "+":res=a+b;resText=Integer.toString(res); break;
                        case "-":res=a-b;resText=Integer.toString(res); break;
                        case "*":res=a*b;resText=Integer.toString(res); break;
                        case "/":
                            if(b==0) resText="cannot divided by zero!";
                            else{
                                res=a/b;
                                resText=Integer.toString(res);
                            }
                            break;
                        default:
                            resText="Wrong input";
                    }
                    out.write(resText+"\n");
                    out.flush();
                    log.append(first+operator+second+"="+resText+"\n");
                } catch (IOException e){
                    log.append("Connection terminated! \n");
                    System.out.println("Connection terminated!");
                    return;
                }
            }
        }

    }
    public static void main(String[] args){
        new Chap14Program5();
    }
}
