package Homework_2.selfHW;

import java.util.ArrayList;

import java.util.Scanner;

public class TQ3 {
    public static void numOrNot(String[] splited){
        ArrayList<Integer> num= new ArrayList<>();
        ArrayList<String> eq=new ArrayList<>();

        int count=1;
        int temp=0;
        for (int i=0;i<splited.length;i++){
            if (i%2==0){
                num.add(Integer.parseInt(splited[i]));
            }
            else {
                eq.add(splited[i]);
            }
        }
        temp=0;
        for (int i=0;i<splited.length;i++) {
            try {
                if (eq.get(i).equals("+")) {
                    System.out.println("Opertation" + (count) + ": " + num.get(i) + " + " + num.get(i+1) + " = " + (num.get(i) +num.get(i+1)));
                    num.set(i+1,(num.get(i) +num.get(i+1)));
                    count++;
                } else if (eq.get(i).equals("-")) {
                    System.out.println("Opertation" + (count) + ": " + num.get(i) + " - " + num.get(i+1) + " = " + (num.get(i) -num.get(i+1)));
                    num.set(i+1,(num.get(i) -num.get(i+1)));
                    count++;
                } else if (eq.get(i).equals("/")) {
                    System.out.println("Opertation" + (count) + ": " + num.get(i) + " / " + num.get(i+1) + " = " + (num.get(i) /num.get(i+1)));
                    num.set(i+1,(num.get(i) /num.get(i+1)));
                    count++;
                } else if (eq.get(i).equals("*")) {
                    System.out.println("Opertation" + (count) + ": " + num.get(i) + " * " + num.get(i+1) + " = " + (num.get(i) *num.get(i+1)));
                    num.set(i+1,(num.get(i) *num.get(i+1)));
                    count++;
                }
            } catch (IndexOutOfBoundsException e){
//                System.out.println(" end ");
                break;
            }
        }
        System.out.println("result of formula is "+(count));
        System.out.println("The actual result of the compiler operation in JAVA is "+(count-1));

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String formula=sc.nextLine();
        System.out.println("Entered formula: "+formula);
        String[] splitedArray=formula.split(" ");
        numOrNot(splitedArray);

    }
}
