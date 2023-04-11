package Homework_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Q1.java
 * get ave. and max., and have exception control of type
 * @since 2023-4-11
 * @author Dounguk kim
 */
public class Q2 {
    final static int INPUT=10;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] num=new int[INPUT];
        int sum=0;
        int max=0;
        int ave;
        System.out.println("Please enter Integer");

        for( int i =0;i<INPUT;i++){
            System.out.print((i+1)+"th value >> ");

            try {
                num[i]=sc.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Input value is not integer. Please try it again!");
                sc.nextLine();
                i--;
            }

            if(max<num[i]){
                max=num[i];
            }
        }
        for (int i=0;i<INPUT;i++){
            sum+=num[i];
        }
        ave=sum/INPUT;
        System.out.println("Maximum value is "+max+"\nAverage value is "+ave);
    }
}
