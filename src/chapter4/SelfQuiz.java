package chapter4;

/*
    SelfQuiz.java
    self quiz
    3-22-2023
    Dounguk Kim
 */

import javax.swing.*;

public class SelfQuiz {

    final static Double PI=3.141592;

    public static void main(String[] args){

        int radius= Integer.parseInt(JOptionPane.showInputDialog(null, "radius here"));

        double out=radius*radius*PI;

        JOptionPane.showMessageDialog(null, "Radius: "+radius+"\n"+"area: "+out);
    }
}
