package chapter10;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Self4 {
    public static void main(String[] args) throws IOException {
        File inFile=new File("/Users/doungukkim/Desktop/workspace/Java_Inclass/src/chapter10/self3.txt");
        FileInputStream inStream=new FileInputStream(inFile);
        DataInputStream inData= new DataInputStream(inStream);

        boolean a= inData.readBoolean();
        double b=inData.readDouble();
        int c= inData.readInt();

        System.out.println(a+"\n"+b+"\n"+c);


    }
}
