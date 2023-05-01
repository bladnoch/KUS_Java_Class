package chapter10;

import chapter7.Account;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//문제 내는 방법
//파일에 1개에 1명의 학생을 저장하는 파일을 100개 만들어라
public class Chap10Program7 {
    static int NUM_OF_ACCOUNT=20;
    public static void main(String[] args) throws IOException {
        File outFile=new File("/Users/doungukkim/Desktop/workspace/Java_Inclass/src/chapter10/studentsInfo.data");
        String[] name= new String[3];
        for (int i=0;i<3;i++){
            name[i]="std"+i+"data.txt";
        }
        FileOutputStream outFileStream=new FileOutputStream(outFile);
        ObjectOutputStream outObjectStream=new ObjectOutputStream(outFileStream);

        File[] outf=new File[3];

        for (int i=0;i<3;i++){
            outf[i]=new File("/Users/doungukkim/Desktop/workspace/Java_Inclass/src/chapter10/"+name[i]);
            outFileStream=new FileOutputStream(outf[i]);
            outObjectStream=new ObjectOutputStream(outFileStream);
        }
//
        Account[] account=new Account[NUM_OF_ACCOUNT];

        for (int i=0;i<NUM_OF_ACCOUNT;i++){
            account[i]=new Account();
            account[i].setOwnerName("Student_"+(i+1));
        }

        outObjectStream.writeObject(account);



    }
}
