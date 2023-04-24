package Homework_2.selfHW;

import java.util.Scanner;

/**
 *  TQ32.java
 *  get, and print operation, and formula
 * @since 4-24-2023
 * @author Dounguk Kim
 */
public class TQ32{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        String pF=sc.nextLine();
        String[] formula= pF.split(" ");
        System.out.println("entered formula: "+pF);

        int[] num=new int[formula.length/2+1];
        String[] equation=new String[formula.length/2];

        int numCount=0;
        int equationCount=0;

        for (int i=0;i<formula.length;i++){
            if(i%2==0){
                num[numCount]=Integer.parseInt(formula[i]);
                numCount++;
            }
            else{
                equation[equationCount]=formula[i];
                equationCount++;
            }
        }
        operation(num,equation);
    }
    public static void operation(int[] nums, String[] eq){
        int temp=nums[0];
        int count=0;
        for (int i=0;i<eq.length;i++){
            System.out.print("operation"+(i+1)+": "+temp+" "+eq[i]+" "+nums[count+1] +" = ");
            if (eq[i].equals("+")){
                System.out.println(temp+nums[count+1]);
                temp+=nums[count+1];
                count++;
            } else if (eq[i].equals("-")) {
                System.out.println(temp-nums[count+1]);
                temp-=nums[count+1];
                count++;
            } else if (eq[i].equals("*")) {
                System.out.println(temp*nums[count+1]);
                temp*=nums[count+1];
                count++;
            }else {
                System.out.println(temp/nums[count+1]);
                temp/=nums[count+1];
                count++;
            }
        }
        System.out.println("the result of the entered formula is "+(count+1));
        System.out.println("The actual result of the compiler operation in Java is "+(count));
    }
}
