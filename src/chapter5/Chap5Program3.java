package chapter5;
/*
        Chap5Program.java
        creat methods get max, min, mean values
        3-27-2023
        Dounguk Kim
 */

import java.util.Scanner;

public class Chap5Program3 {

    public static void main(String[] args){
//        user input UI
        Scanner sc=new Scanner(System.in);
        int intArray[] =new int[5];

        System.out.println("put 5 real num");

        for (int i=0;i<5;i++){
            intArray[i]= sc.nextInt();
        }
//user output UI & computational
        System.out.println("max"+getMaximumValue(intArray));
        System.out.println(("min"+getMinimumValue(intArray)));
        System.out.println("# of elements:"+intArray.length);
        System.out.println("mean of value"+ getMean(intArray));

        int[] dup=checkUsersInput(intArray);
        dup[0]=100;
        System.out.println(checkUsersInput(intArray)[0]);
        sc.close();
    }



    public static int getMaximumValue(int[] array){
        int max=0;

        for(int i=0;i<5;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    public static int getMinimumValue(int[] array){
        int min=99999;

        for(int i=0;i<5;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
    public static Double getMean(int[] array){
        int sum=0;
        double mean=0.0d;

        for(int i=0;i< array.length;i++){
            sum+=array[i];
        }
        mean=sum / array.length;

        return mean;
    }
    public static int[] checkUsersInput(int[] array){
        int[] userInput=array;

        return userInput;
    }

}
