package chapter10.self;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Self1 {
    public static void main(String[] args) throws IOException {
        File outF=new File("/Users/doungukkim/Desktop/workspace/Java_Inclass/src/chapter10/self/self1.txt");
        FileOutputStream outS=new FileOutputStream(outF);

        byte[] byteA={10,20,30,40,10};
        outS.write(byteA);
        outS.close();

    }
}
