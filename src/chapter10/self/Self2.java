package chapter10.self;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Vector;

public class Self2 {
    public static void main(String[] args) throws IOException {
        File inF=new File("/Users/doungukkim/Desktop/workspace/Java_Inclass/src/chapter10/self/self1.txt");
        FileInputStream inS=new FileInputStream(inF);

        int len=(int)inF.length();
        byte[] byteA=new byte[len];

        inS.read(byteA);
        for(int i=0; i< len;i++){
            System.out.println(byteA[i]);
        }
    }
}
