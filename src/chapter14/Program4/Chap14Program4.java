package chapter14.Program4;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
/**
 * server calculates the result and informs the client
 */
public class Chap14Program4 {
    public static void main(String[] args){
        Socket socket=null;
        Scanner sc=new Scanner(System.in);

        try{
            socket=new Socket("localhost",9999);

            BufferedReader in =new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter out =new BufferedWriter((new OutputStreamWriter(socket.getOutputStream())));

            while(true){
                System.out.println("ex) 2 + 3");
                String outputMessage=sc.nextLine();

                if(outputMessage.equalsIgnoreCase("bye")){
                    out.write(outputMessage+"\n");
                    out.flush();
                    break;
                }
                out.write(outputMessage+"\n");
                out.flush();
                String inputMessage =in.readLine();
                System.out.println("Server "+inputMessage);
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
        } finally {
            try{
                sc.close();
                if(socket!=null){
                    socket.close();
                }
            } catch(IOException e){
                System.out.println("An error occurred while communicating with the server.");
            }
        }
    }
}
