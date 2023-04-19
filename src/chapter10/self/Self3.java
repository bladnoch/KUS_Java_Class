package chapter10.self;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Self3 {
    public static void main(String[] args) throws IOException {
        File outFile= new File("/Users/doungukkim/Desktop/workspace/Java_Inclass/src/chapter10/self/self3.txt");
        FileOutputStream outS=new FileOutputStream(outFile);
        DataOutputStream dataO=new DataOutputStream(outS);

        dataO.writeInt(1234);
        dataO.writeDouble(23.5);
        dataO.writeBoolean(true);

        dataO.close();

    }
}
