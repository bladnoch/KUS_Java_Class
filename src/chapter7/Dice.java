package chapter7;
/*
        Dice.java
        get/set info back from Chap7Program3.java
        4-5-2023
        Dounguk Kim
 */

public class Dice {
    private static final int MAX_NUM=6;
    private static final int MIN_NUM=1;
    private static final int NO_NUM=0;
    private int num;

    public Dice(){
        num=NO_NUM;
    }

    public void roll(){
        num=(int)(Math.floor(Math.random()*(MAX_NUM-MIN_NUM+1)+MIN_NUM));
    }

    public int getNum(){
        return num;
    }
}
