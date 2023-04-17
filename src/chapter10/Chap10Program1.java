package chapter10;
/**
 * Chap10Program1.java
 * Example of file binary output using fileoutputstream(파일 만들기 )
 * @since 4-17-2023
 * @author Dounguk Kim
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Chap10Program1 {
    public static void main(String[] args) throws IOException {
        File outFile =new File("/Users/doungukkim/Desktop/workspace/Java_Inclass/src/chapter10/Program1.txt");//원하는 위치에 파일 생성
        FileOutputStream outStream= new FileOutputStream(outFile);
        byte[] byteArray={10,20,30,40,50,60,70,80}; //바이트로 전환되서 저장되는 값
        outStream.write(byteArray);
        outStream.close();
    }
}
