package chapter5;

/*
    Chap5Progrm1.java
    To find maximum value in array
    3-27-2023
    Dounguk Kim
 */

import java.util.Scanner;

public class Chap5Program1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double userinput;
        double min=0;

        System.out.println("Please input five numeric values.");
        for(int i =0;i<5;i++){
            userinput=sc.nextDouble();
            if (min==0){
                min=userinput;
            }
            if(userinput<min)
                min=userinput;
        }
        System.out.println("min value is "+ min);

        sc.close();

    }
}
