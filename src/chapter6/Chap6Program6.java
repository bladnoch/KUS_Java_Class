package chapter6;

/*
    Chapter6Program6.java
    exception for divisor==0;
    3-28-2023
    Dounguk Kim
 */

import java.util.Scanner;

public class Chap6Program6 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int dividend;
        int divisor;

        System.out.printf("Dividend: ");
        dividend=sc.nextInt();

        System.out.println("divisor: ");
        divisor=sc.nextInt();

//        System.out.println(dividend+" "+divisor+" "+dividend/divisor);
//        sc.close();
        try{
            System.out.println(dividend+" "+divisor+" "+dividend/divisor);
            sc.close();
        } catch (ArithmeticException e){
            System.out.println("divisor cannot be 0");
        }

    }
}
