package chapter8;
/*
        Week8Program1.java
        Creat multiple constructors
        4-5-2023
        Dounguk Kim
 */

public class Week8Program1 {
    public static void main(String[] args){
        Bicycle bike;

        String myName="Dounguk Kim";

        bike = new Bicycle();
        bike.setOwnerName(myName);


        System.out.println(bike.getOwnerName()+ " owns a bicycle");

    }
}
