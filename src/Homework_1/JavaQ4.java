package Homework_1;
import java.util.Scanner;
/*
        JavaQ4.java
        get 9 input return sum of row, column, and all numbers
        4-4-2023
        Dounguk Kim
 */

public class JavaQ4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] input=new int[9];
        int sum=0;

        for (int i=0;i<9;i++){
            System.out.println("put "+(9-i)+" more number");
            input[i]=sc.nextInt();
            sum+=input[i];
        }

        for(int i=0;i<7;i+=3){
            System.out.println(input[i]+"  "+input[i+1]+"  "+input[i+2]+"  "+(input[i]+input[i+1]+input[i+2]));
        }
        System.out.println((input[0]+input[3]+input[6])+"  "+(input[1]+input[4]+input[7])+"  "+(input[2]+input[5]+input[8])+" "+sum);
    }
}
