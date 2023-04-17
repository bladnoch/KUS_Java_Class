package chapter10;
/**
 * Chap10Program4.java
 * Example of file high-level input
 * @since 4-17-2023
 * @author Dounguk Kim
 */
import java.io.*;

public class Chap10Program4 {
    public static void main(String[] args) throws IOException{
        File inFile = new File("/Users/doungukkim/Desktop/workspace/Java_Inclass/src/chapter10/example2.data");
        FileInputStream inStream=new FileInputStream(inFile);
        DataInputStream inDataStream=new DataInputStream(inStream);

//데이타 타입이 뭔지 미리 알고있지 않으면 high level이라도 알 수 없다. 따라서 이런 방법으로 security 시스템으로 사용할 수 있다
        int n=inDataStream.readInt();
        boolean b=inDataStream.readBoolean();
        double d= inDataStream.readDouble();


        System.out.println("n="+n);
        System.out.println("b="+b);
        System.out.println("d="+d);
    }
}
