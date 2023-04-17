package chapter10;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Vector;

public class Self2 {
    public static void main(String[] args) throws IOException {
        File inF=new File("/Users/doungukkim/Desktop/workspace/Java_Inclass/src/chapter10/self1.txt");
        FileInputStream inS=new FileInputStream(inF);
//        Vector<Byte> byteArray=new Vector<>();
//        byteArray.add(inS.read());


        int len=(int)inF.length();
        byte[] bA=new byte[len];

        for (int i=0;i<len;i++){
            System.out.println(bA[i]);
        }
    }
}
