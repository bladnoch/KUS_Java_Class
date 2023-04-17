package chaper10;
/**
 * Chap10Program3.java
 * Example of file high-level output
 * @since 4-17-2023
 * @author Dounguk Kim
 */
import java.io.*;

//하이레벨로 만들었지만 아직 사람이 읽을 수 없다 program4에서 어떤식으로 변환될 수 있다.

public class Chap10Program3 {
    public static void main(String[] args) throws IOException{
        File outFile = new File("/Users/doungukkim/Desktop/workspace/Java_Inclass/src/chaper10/example2.data");
        FileOutputStream outStream=new FileOutputStream(outFile);
        DataOutputStream outDataStream=new DataOutputStream(outStream);


        outDataStream.writeInt(44);
        outDataStream.writeBoolean(true);
        outDataStream.writeDouble(7.2);

        outDataStream.close();
    }
}
