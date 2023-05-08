package chapter12;

import javax.swing.*;

/**
    basic elements of JFrame
    @version v0.0.1
    @since 2023-05-8
    @author Dounguk Kim
   */

public class Chap12Program1 extends JFrame {
    public Chap12Program1(){
       this.setTitle("Welcome to GUI environmnet!");
       this.setSize(300,300);
       this.setVisible(true);
    }

    public static void main(String[] args){
           Chap12Program1 frame=new Chap12Program1();

    }
}
