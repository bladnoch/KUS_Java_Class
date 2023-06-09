package Homework_2;

import java.util.Scanner;

/**
 * Q3.java
 * Get formula and show calc. step by step
 * @since 2023-4-11
 * @author Dounguk kim
 */
public class Q3 {
    /**
     * calculate numbers, and return calculated number
     * 계산을 하고 계산된 숫자를 리턴한다
     * @param a
     * @param and
     * @param b
     * @return afterCalc
     */
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

    /**
     * get formula and return it. print formula
     * 식을 받고, 프린트 하고 식을 리턴한다.
     * @param sc
     * @param formula
     * @return formula
     */
    public static String input(Scanner sc, String formula){
        System.out.print("Java Q3.java ");
        formula=sc.nextLine(); //식 입력
        System.out.print("entered formula: ");
        System.out.println(formula+"\n");
        return formula;
    }


    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String formula="";
        int allCalc=0;
        int count=2;

        String[] form=input(sc,formula).split(" "); //식 나눠서 저장
        count=showOperation(allCalc,form,count); //오퍼레이션 출력하고 포뮬러 갯수 리턴
        formulaOperationPrinter(count); //오퍼레이션, 표뮬러 출력

    }

    /**
     * print each operation and return number of formula
     * 계속 실행되는 오퍼래이션을 출력하고 식의 길이를 리턴한다.
     * @param allCalc
     * @param form
     * @param count
     * @return count
     */
    public static int showOperation(int allCalc,String[] form, int count){
        allCalc=calc(Integer.parseInt(form[0]),form[1],Integer.parseInt(form[2]));
        System.out.println("Operation1: "+form[0]+" "+form[1]+" "+form[2]+" = "+allCalc);

        for(int i=3;i<form.length;i+=2){
            System.out.print("Operation"+count+": "+allCalc+" "+form[i]+" "+form[i+1]+" = ");
            allCalc=calc(allCalc,form[i],Integer.parseInt(form[i+1]));
            System.out.println(allCalc);
            count++;
        }
        return  count;
    }

    /**
     * print number of formula, and number of operation
     * 식의 길이와 실행횟수를 프린트
     * @param count
     */
    public static void formulaOperationPrinter(int count){
        System.out.println("The result of the entered formula is "+count+".");
        System.out.println("The actual result of the compiler operation in Java is "+(count-1)+".");

    }

}
