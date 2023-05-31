package chapter14.Program3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class Chap14Program3 {
    public static String calc(String exp){
        StringTokenizer st=new StringTokenizer(exp," ");
        if(st.countTokens()!=3) return "error";

        String res="";
        int op1=Integer.parseInt(st.nextToken());
        String opcode=st.nextToken();
        int op2=Integer.parseInt(st.nextToken());
        switch (opcode){
            case "+": res=Integer.toString(op1+op2);
                break;
            case "-": res=Integer.toString(op1-op2);
                break;
            case "*": res=Integer.toString(op1*op2);
                break;
            default: res="error";
        }
        return res;
    }

    public static void main(String[] args){
        ServerSocket listener=null;
        Socket socket=null;

        try{
            listener=new ServerSocket(9999); //개발자가 사용하기 위한 테스트용, 서버로 사용하기 위해서는 고정 ip를 사용해야 한다.
            System.out.println("Waiting connection...");

            socket=listener.accept();
            System.out.println("Connected!");

            BufferedReader in =new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter out =new BufferedWriter(new OutputStreamWriter((socket.getOutputStream())));

            while(true) {
            String inputMessage = in.readLine();

            if (inputMessage.equalsIgnoreCase("bye")) {
                System.out.println("Connection terminated!");
                break;
            }
            System.out.println(inputMessage);
            String res = calc(inputMessage);
            out.write(res + "\n");
            out.flush();
        }
    } catch(IOException e){
            System.out.println(e.getMessage());
    } finally {
            {
                try{
                    if(socket!=null) socket.close();
                    if(listener!=null) listener.close();
                } catch (IOException e){
                    System.out.println("An error occured while communicating with the client");
                }
            }
        }
        }
}
