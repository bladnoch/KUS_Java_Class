package Homework_2.selfHW;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * TQ2.java
 * get 10 ints get average, max value
 * @since 4-24-2023
 * @author Dounguk Kim
 */
public class TQ2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int nums=0;
        int num=0;
        int max=0;
        int count=0;

        for (int i=0;i<10;i++){
            System.out.print((i+1)+"th value >>");
            try{
                num=sc.nextInt();
            } catch (InputMismatchException e){
                break;
            }
            nums+=num;
            count++;
            if(max<num){
                max=num;
            }
        }
        System.out.println("Maximum value: "+max);
        System.out.println("Average value: "+nums/count);
    }
}
