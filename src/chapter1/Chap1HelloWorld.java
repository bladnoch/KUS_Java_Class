package chapter1;

/*
    File name: Chap1HelloWorld.java
    This is program study Date, and SimpleDateFormat
    2023-03-13
    Dounguk Kim
 */


import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Chap1HelloWorld {
    public static void main(String[] args){

//        String firstName = JOptionPane.showInputDialog(null, "please enter the your first name");
//        String lastName = JOptionPane.showInputDialog(null, "please enter the your last name");
//
//        JOptionPane.showMessageDialog(null, "Hello World\n"+firstName.substring(1,4)+" "+lastName);
//        System.out.println("using .length()"+firstName.length());
//        System.out.println("use index of"+firstName.indexOf("1"));
//        System.out.println("add two elements "+firstName);

        Date today=new Date();
        SimpleDateFormat sdf1, sdf2, sdf3, sdf4, sdf5;

        sdf1=new SimpleDateFormat("MM/DD/YY");
        System.out.println(sdf1.format(today));

        sdf2=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf2.format(today));

        sdf3=new SimpleDateFormat("HH:mm:ss");
        System.out.println(sdf3.format(today));

        sdf4=new SimpleDateFormat("HH:mm:ss a");
        System.out.println(sdf4.format(today));

        sdf5=new SimpleDateFormat("HH:mm:ss a, E");
        System.out.println(sdf5.format(today));

    }
}