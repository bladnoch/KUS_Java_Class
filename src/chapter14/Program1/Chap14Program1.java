package chapter14.Program1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Chap14Program1 {
    public static void main(String[] args){
        ServerSocket listener =null;
        Socket socket =null;
        Scanner sc=new Scanner(System.in);

        try{
            listener=new ServerSocket(9999);
            System.out.println("Waiting connection...");

            socket=listener.accept();
            System.out.println("Connected!");

            BufferedReader in =new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter out =new BufferedWriter(new OutputStreamWriter((socket.getOutputStream())));

            while(true){
                String inputMessage=in.readLine();

                if (inputMessage.equalsIgnoreCase("bye")){
                    System.out.println("Connection terminated!");
                    break;
                }
                System.out.println("Client: "+ inputMessage);
                System.out.println("Server>>");

                String outputMessage=sc.nextLine();
                out.write(outputMessage+"\n");
                out.flush();
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            try{
                sc.close();
                socket.close();
                listener.close();
            } catch (IOException e ){
                System.out.println("An error occurred while communicating with the client");
            }
        }
    }
}
