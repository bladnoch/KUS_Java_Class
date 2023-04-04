package Homework_1;

import javax.swing.*;

/*
        JavaQ3.java
        convert Won to Dollar currency is 1295.83
        4-4-2023
        Dounguk Kim
 */
public class JavaQ3 {
    final static double CURRENCY=1295.83;
    public static void main(String[] args){
        int input= Integer.parseInt(JOptionPane.showInputDialog(null,"put Won you have: "));
        int dollar=(int)(input/CURRENCY);

        JOptionPane.showMessageDialog(null,dollar);


    }
}
