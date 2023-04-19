package chapter10.self;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Self4 {
    public static void main(String[] args) throws IOException {
        File inFile=new File("/Users/doungukkim/Desktop/workspace/Java_Inclass/src/chapter10/self/self3.txt");
        FileInputStream inS=new FileInputStream(inFile);
        DataInputStream dataI=new DataInputStream(inS);

        int a= dataI.readInt();
        double b= dataI.readDouble();
        boolean c= dataI.readBoolean();

        System.out.println(a+" "+b +" "+c);

    }
}
