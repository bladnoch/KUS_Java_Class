package chapter7;
/*
        Chap7Program3.java
        creat dice class and get num between 1~6.
        4-5-2023
        Dounguk Kim
 */

public class Chap7Program3 {
    public static void main(String[] args){
        Dice number=new Dice();
        Dice number2=new Dice();


        System.out.println("before your roll #1 dice: "+number.getNum());
        System.out.println("before your roll #1 dice: "+number2.getNum());
        number.roll();

        System.out.println("After you roll #1: "+number.getNum());
        System.out.println("After you roll #2: "+number2.getNum()); //DID NOT ROLL DICE #2

    }
}
