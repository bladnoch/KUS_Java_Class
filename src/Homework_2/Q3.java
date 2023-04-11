package Homework_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Q3.java
 * Get formula and show calc. step by step
 * @since 2023-4-11
 * @author Dounguk kim
 */
public class Q3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("entered formula");
        String formula=sc.nextLine();
        String[] form=formula.split(" ");

        for (int i=0;i<form.length;i++){
            System.out.println(form[i]);
        }
        if (form[1].equals("+")){
            System.out.println(Integer.parseInt(form[0])+ Integer.parseInt(form[2]));
        }
        else{
            System.out.println("nope");
        }
    }
}
