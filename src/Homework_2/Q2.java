package Homework_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Q2.java
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
        max=getMax(num, sc);    //get max
        ave=getSum(num)/INPUT;  //get average
        printIt(max,ave);       //print max, average
    }

    /**
     * print max value and average value
     * 최대, 평균을 프린트
     * @param max
     * @param ave
     */
    public static void printIt(int max, int ave){
        System.out.println("Maximum value is "+max+"\nAverage value is "+ave);
    }

    /**
     * get maximum value
     * 최대값을 얻는다.
     * @param num
     * @param sc
     * @return max
     */
    public static int getMax(int[] num, Scanner sc){
        int max=0;
        for( int i =0;i<INPUT;i++){
            System.out.print((i+1)+"th value >> ");
            // get input and check exception.
            // 입력 받고 예외처리
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
        return max;
    }

    /**
     * add all numbers
     * 모든 숫자를 더한다.
     * @param num
     * @return
     */
    public static int getSum(int[] num){
        int sum=0;
        for (int i=0;i<INPUT;i++){
            sum+=num[i];
        }
        return sum;
    }
}
