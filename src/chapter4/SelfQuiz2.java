package chapter4;
/*
    SelfQuiz2.java
    hr, min, sec calc
    3-22-2023
    Dounguk Kim
 */

import java.util.Scanner;

public class SelfQuiz2 {
    final static int SIXTY=60;
    public static void main(String[] args){
        int insec, sec,min,hr;
        Scanner sc=new Scanner(System.in);
        System.out.println("put sec here: ");

//        input
        insec=sc.nextInt();

//        calc.
        min=(insec/SIXTY)%SIXTY;
        sec =insec%SIXTY;
        hr=(insec/SIXTY)/SIXTY;

//        output
        System.out.println("input is "+insec);
        System.out.print("which is "+hr+ "hrs ");
        System.out.print(min+ "minutes ");
        System.out.print(sec+"seconds");

    }
}
