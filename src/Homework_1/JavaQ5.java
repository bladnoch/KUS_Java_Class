package Homework_1;

import java.util.Scanner;

/*
        JavaQ5.java
        change input money to paper money, and coin money
        4-4-2023
        Dounguk Kim
 */
public class JavaQ5 {
    final static int[] MONEY={50000,10000,5000,1000,500,100,50,10,5,1};
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] count=new int[MONEY.length];
        System.out.println("give me money: ");
        int input=sc.nextInt();

        for (int i=0;i<(MONEY.length);i++){
            if (input>=MONEY[i]){
                count[i]=input/MONEY[i];
                input=input%MONEY[i];
//                System.out.println(count[i]);
            }
        }

        for (int j=0;j<(MONEY.length);j++){
//            System.out.println("2");
            if (count[j]!=0){
//                System.out.println("2");
                System.out.println(MONEY[j]+" * "+count[j]);
            }

        }
    }
}
