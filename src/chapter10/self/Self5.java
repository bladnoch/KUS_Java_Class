package chapter10.self;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Self5.java
 * study ch10program5
 * @since 4-22-2023
 * @author Dounguk Kim
 */
public class Self5 {
    public static void main(String[] args) throws IOException {
        File outFile=new File("/Users/doungukkim/Desktop/workspace/Java_Inclass/src/chapter10/self/self5.date");
        FileOutputStream outStream=new FileOutputStream(outFile);
        PrintWriter outWrite=new PrintWriter(outStream);

        outWrite.println("this is Daniel Kim");
        outWrite.println(true);

        outWrite.close();

    }
}
