package chapter6;
/*
    Chap6Program4.java
    something about args
    3-28-2023
    Dounguk Kim
 */

public class Chap6Program4 {
    public static void main(String[] args){
        int[] input=new int[args.length];
        int outcome=0;

        for(int i=0;i<input.length;i++){
            input[i]=Integer.parseInt(args[i]);
            outcome+=input[i];
        }

        System.out.println("sum of all input values: "+outcome);
    }
}
