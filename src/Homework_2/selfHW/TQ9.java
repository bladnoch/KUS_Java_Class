package Homework_2.selfHW;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  TQ9.java
 *  make solution with overriding
 * @since 4-24-2023
 * @author Dounguk Kim
 */
public class TQ9{

    public static void main(String[] args){
        ArrayList<Integer> intValue=new ArrayList<>();
        ArrayList<Double> doubleValue=new ArrayList<>();
        Stud4 sum= new Stud4();
        int intCount=0;
        int doubleCount=0;

        Scanner sc=new Scanner(System.in);

        /**
         * 모든 값들을 받는다 정수 실수 아닐경우 예외처리
         */
        while (true){
            System.out.println("put number(quit) ");
            String temp=sc.next();
            if(temp.equals("quit")){
                break;
            }
            try{
                intValue.add(Integer.parseInt(temp));
                intCount+=1;
            } catch (NumberFormatException e){
                try{
                    doubleValue.add(Double.parseDouble (temp));
                    doubleCount+=1;
                } catch (NumberFormatException a){
                    System.out.println("input is not a int or double value");
                    intCount--;
                    doubleCount--;
                }
            }

        }
        int[] allNum;
        double[] allDouble;
        int count=0;

        /**
         * int 2개만 있을경우 실행 Stud에 있는 파라미터 2개의 getSum()을 호출
         */
        if(doubleValue.size()==0 && intCount==2){
            allNum=new int[intCount];
            for (int i=0;i<allNum.length;i++){
                allNum[i]=intValue.get(i);
            }
            System.out.println("sum of all input number is "+sum.getSums(allNum[0],allNum[1]));
        }
        /**
         * int 2개만 있을경우 실행 Stud에 있는 파라미터 2개의 getSum()을 호출
        */
        else if(doubleValue.size()==0 && intCount==3){
            allNum=new int[intCount];
            for (int i=0;i<allNum.length;i++){
                allNum[i]=intValue.get(i);
            }
            System.out.println("sum of all input number is "+sum.getSums(allNum[0],allNum[1],allNum[2]));
        }
        /**
         * int가 여러개있을경우 실행 Stud에 있는 int array 파라미터의 getSum()을 호출
         */

        else if(doubleValue.size()==0 && intCount>=4){
            allNum=new int[intCount];
            for (int i=0;i<allNum.length;i++){
                allNum[i]=intValue.get(i);
            }
            System.out.println("sum of all input number is "+sum.getSums(allNum));
        }
        /**
         * double이 여러개있을경우 실행 Stud에 있는 double array 파라미터의 getSum()을 호출
         */
        else if (doubleValue.size()>=1){
            allDouble=new double[intCount+doubleCount];
            for (int i=0;i<doubleValue.size();i++){
                allDouble[i]=doubleValue.get(i);
            }
            for (int i=doubleValue.size();i<doubleValue.size()+ intValue.size();i++){
                allDouble[i]=intValue.get(count);
                count++;
            }

            System.out.println("sum of all input number is "+sum.getSums(allDouble));
        }



    }
}
