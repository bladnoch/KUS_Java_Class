package chapter2;

/*
    File name: Ch2Smaple1.java
    Generate two windows by JFrame
    2023-03-13
    Dounguk Kim
 */

import javax.swing.*;

public class Ch2Sample1 {
    public static void main(String[] args){

        //generate windows
        JFrame myWindow=new JFrame();
        JFrame myWindow2=new JFrame();

        //fist window
        myWindow.setSize(300,200);
        myWindow.setTitle("My First Java Program");
        myWindow.setVisible(true);

        //second window
        myWindow2.setSize(1000,600);
        myWindow2.setTitle("My Second Java Program");
        myWindow2.setVisible(true);
    }
}