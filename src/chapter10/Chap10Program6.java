package chapter10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Chap10Program6.java
 *  Example of Text-file input using BufferedReader
 * @since 4-19-2023
 * @author Dounguk Kim
 */

//      여기서 사용하는 파일의 경우 8비트로 나눠져 있는 파일을 불러오는게 아니기 때문에 렘으로 불러와서 읽을 때 8비트씩 불러와서 읽을 수 있는게 아니다.
//      그래서 불러올 떄 블럭 단위의 String으로 블러오는데 버퍼에 잠시 보관하고 렘으로 간다.
//      버퍼가 뭐야 ㅅㅂ

public class Chap10Program6 {
    public static void main(String[] args) throws IOException {
        File inF=new File("/Users/doungukkim/Desktop/workspace/Java_Inclass/src/chapter10/example2.data");
        FileReader fileReader=new FileReader(inF);
        BufferedReader bufReader=new BufferedReader(fileReader);
        String str;
        while ((str=bufReader.readLine())!=null){ //출력문
            System.out.println(str);
        }
        bufReader.close();

        Scanner sc=new Scanner(new File("/Users/doungukkim/Desktop/workspace/Java_Inclass/src/chapter10/example2.data"));
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
        sc.close();
    }
}
