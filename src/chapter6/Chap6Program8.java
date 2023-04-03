package chapter6;
/*
        Chap6Program8.java
        try InputMismatchException in loop
        4-3-2023
        Dounguk Kim
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Chap6Program8 {
    public static void main(String[] args){
        double a=0;
        Scanner sc=new Scanner(System.in);
        double sum=0;

        for (int i=0;i<3;i++){
            try{
                a=sc.nextDouble();
            } catch (InputMismatchException e){
                System.out.println("put int value");
                a=sc.nextDouble();
                i--;
                continue;
            }
            sum+=a;
        }
        System.out.println("sum: "+sum);
    }

}
