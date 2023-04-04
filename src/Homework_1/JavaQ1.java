package Homework_1;
import javax.swing.*;
/*
        JavaQ1.java
        get name, and std id number and add all digits
        4-4-2023
        Dounguk Kim
 */

public class JavaQ1 {
    public static void main(String[] args){
        String input= JOptionPane.showInputDialog(null, "name/student id number");
        String num=input.substring(input.indexOf("/")+1,input.length());
        input=input.substring(0,input.indexOf("/"));
        int add=0;

        for (int i=0;i<num.length();i++){
            add+=Integer.parseInt(num.substring(i,i+1));
        }

        System.out.println("hello "+input);
        System.out.println("sum of all id's nums are "+add);


    }
}
