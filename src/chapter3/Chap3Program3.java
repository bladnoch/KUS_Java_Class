package chapter3;

import java.util.Scanner;

public class Chap3Program3 {

    final static int UNIT_CHANGER=60;

    public static void main(String[] args){

//          input UI
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input the second unit as integer value: ");

//          Main Calc.
        int time=scanner.nextInt();
        int seconds=time%UNIT_CHANGER;
        int minute=(time/UNIT_CHANGER)%UNIT_CHANGER;
        int hour=(time/UNIT_CHANGER)/UNIT_CHANGER;

//          output UI
        System.out.println(time+" seconds is");
        System.out.print(hour+" hrs ");
        System.out.print(minute+" min ");
        System.out.print(seconds+" sec");
    }
}
