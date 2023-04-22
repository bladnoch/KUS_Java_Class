package chapter10.self;

import java.io.*;
import java.util.Scanner;

/**
 * Self6.java
 * study ch10program6
 * @since 4-22-2023
 * @author Dounguk Kim
 */
public class Self6 {
    public static void main(String[] args) throws IOException {
        File inFile=new File("/Users/doungukkim/Desktop/workspace/Java_Inclass/src/chapter10/self/self5.date");
        FileReader fileReader=new FileReader(inFile);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line;
        while((line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }

        Scanner sc=new Scanner(inFile);
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
        sc.close();

        bufferedReader.close();
    }
}