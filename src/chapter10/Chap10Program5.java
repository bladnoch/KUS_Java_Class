package chapter10;
import java.io.*;

/**
 * Chap10Program5.java
 * Example of Text_file output
 * @since 4-19-2023
 * @author Dounguk Kim
 */
public class Chap10Program5 {
    public static void main(String[] args) throws IOException{
        File outFile = new File("/Users/doungukkim/Desktop/workspace/Java_Inclass/src/chapter10/std.data");
        FileOutputStream outStream=new FileOutputStream(outFile);
        PrintWriter outPW=new PrintWriter(outStream); //사람이 읽을 수 있게 한다.


        //readable
        outPW.println(101);
        outPW.println("hello world");
        outPW.println(true);

        outPW.close();
    }
}

