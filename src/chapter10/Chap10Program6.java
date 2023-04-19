package chapter10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Chap10Program6.java
 *
 * @since 4-19-2023
 * @author Dounguk Kim
 */
public class Chap10Program6 {
    public static void main(String[] args) throws IOException {
        File inF=new File("/Users/doungukkim/Desktop/workspace/Java_Inclass/src/chapter10/example2.data");
        FileReader fileReader=new FileReader(inF);
        BufferedReader bufReader=new BufferedReader(fileReader);
        String str;
        while ((str=bufReader.readLine())!=null){
            System.out.println(str);
        }
        bufReader.close();

        Scanner sc=new Scanner(System.in);
        System.out.println(sc.next());
        System.out.println(sc.next());
        System.out.println(sc.next());
        sc.close();
    }
}
