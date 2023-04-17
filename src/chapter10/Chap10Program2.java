package chapter10;
/**
 * Chap10Program2.java
 * Example of file binary output using fileoutputstream(low level로 써진 파일을 사람이 읽을 수 있게 바꾸기)
 * @since 4-17-2023
 * @author Dounguk Kim
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Chap10Program2 {
    public static void main(String[] args) throws IOException {
        File inFile =new File("/Users/doungukkim/Desktop/workspace/Java_Inclass/src/chaper10/Program1.txt");
        FileInputStream inStream= new FileInputStream(inFile);

        int filesize=(int)inFile.length();//어레이 값을 구하기 위해 사용
        byte[] byteArray=new byte[filesize];

        inStream.read(byteArray);
        for(int i=0;i<filesize;i++){
            System.out.println(byteArray[i]);
        }

        inStream.close();
    }
}
