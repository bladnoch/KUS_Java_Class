package Homework_2;

import java.util.Scanner;

/**
 * Q3.java
 * Get formula and show calc. step by step
 * @since 2023-4-11
 * @author Dounguk kim
 */
public class Q3 {
    public static int calc(int a,String and, int b){
        int afterCalc=0;
        if(and.equals("+")){
            afterCalc=a+b;
        }
        else if(and.equals("-")){
            afterCalc=a-b;
        }
        else if(and.equals("/")){
            afterCalc=a/b;
        }
        else if(and.equals("*")){
            afterCalc=a*b;
        }
        return afterCalc;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);


        System.out.print("Java Q3.java ");
        String formula=sc.nextLine(); //식 입력
        System.out.print("entered formula: ");
        System.out.println(formula+"\n");


        String[] form=formula.split(" "); //식 나눠서 저장
        int allCalc=0;
        int count=2;

        allCalc=calc(Integer.parseInt(form[0]),form[1],Integer.parseInt(form[2]));
        System.out.println("Operation1: "+form[0]+" "+form[1]+" "+form[2]+" = "+allCalc);

        for(int i=3;i<form.length;i+=2){

            System.out.print("Operation"+count+": "+allCalc+" "+form[i]+" "+form[i+1]+" = ");
            allCalc=calc(allCalc,form[i],Integer.parseInt(form[i+1]));
            System.out.println(allCalc);
            count++;

        }

        System.out.println("The result of the entered formula is "+count+".");
        System.out.println("The actual result of the compiler operation in Java is "+(count-1)+".");

    }
}
