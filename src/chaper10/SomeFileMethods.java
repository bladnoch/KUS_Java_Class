package chaper10;
/**
 * SomeFileMethods.java
 * print files in folder
 * @since 4-17-2023
 * @author Dounguk Kim
 */

import java.io.File;
import java.io.IOException;

public class SomeFileMethods {
    public static void main(String[] args) throws IOException {
        File dir=new File("/Users/doungukkim/Desktop/workspace");
        String filename[] = dir.list();
        for(int i = 0; i<filename.length;i++){
            System.out.println(filename[i]);
        }
    }
}
