package chapter10.self;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Self3 {
    public static void main(String[] args) throws IOException {
        File outFile= new File("/Users/doungukkim/Desktop/workspace/Java_Inclass/src/chapter10/self/self3.txt");
        FileOutputStream outStream= new FileOutputStream(outFile);
        DataOutputStream outData= new DataOutputStream(outStream);

        outData.writeBoolean(true);
        outData.writeDouble(2304234.23);
        outData.writeInt(691214);

        outData.close();

    }
}
