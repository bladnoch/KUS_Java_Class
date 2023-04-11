package Homework_2;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Q4.java
 * bubble sort, sort out biggest to smallest
 * @since 2023-4-12
 * @author Dounguk kim
 */
public class Q5 {
    public static int setGender(){
        Scanner sc=new Scanner(System.in);
        int gen=0;
        System.out.println("What is your gender? \n1)Male   2)Female");
        while(gen==0){
            try{
                gen=sc.nextInt();
            } catch (InputMismatchException e){
                sc.nextLine();
            }
            if(gen!=1 && gen!=2){
                gen=0;
                System.out.println("Please put number\n1)Male   2)Female");
            }
        }
        return gen;
    }
    public static void mFm(int gen){
        if (gen==1){
            idealMale();
        }
        else {
            idealFemale();
        }
    }
    public static double idealMale(){




    }
    public static double idealFemale(){



    }
    public static int setHeight(){
        Scanner sc=new Scanner(System.in);
        int height=0;
        System.out.println("How tall are you?(cm)");
        while(height==0){
            try{
                height=sc.nextInt();
            } catch (InputMismatchException e){
                sc.nextLine();
            }
            System.out.println("How tall are you?(cm)");
        }
        return height;
    }

    public static void main(String[] args){
        int gen=setGender();
        int height=setHeight();

        System.out.println(height);
        if(gen==1){
            System.out.println("male");
        }
        else if(gen==2){
            System.out.println("female");
        }

    }
}
