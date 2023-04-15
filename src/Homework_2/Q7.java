package Homework_2;

import java.util.Scanner;
import static java.lang.Math.random;

/**
 * Q6.java
 * Play rock, scissors, and paper game with computer
 * @since 2023-4-12
 * @author Dounguk kim
 */
public class Q7 {
    /**
     * get input and calculate that who won
     * 입력을 받고 누가 이겼는지 계산한 후 출력
     * @param value
     */
    public static void winner(String[] value){
        Scanner sc=new Scanner(System.in);
        String me;
        int comp=(int)(random()*3);

        comp=(int)(random()*3);
        System.out.print("GAME START\n(rock, scissors, paper)\nPlayer: ");
        me=sc.next();
        if(me.equals(value[0]) ){ //player: rock
            if(comp==0){
                System.out.println("computer: paper\n You win!");
            } else if (comp==1) {
                System.out.println("computer: scissors\n Draw!");
            }
            else{
                System.out.println("computer: rock\n You lose!");
            }
        }
        else if(me.equals(value[1]) ){ //player: scissors
            if(comp==0){
                System.out.println("computer: rock\n Draw!");
            } else if (comp==1) {
                System.out.println("computer: paper\n You lose!");
            }
            else{
                System.out.println("computer: scissors\n You win!");
            }
        }
        else if(me.equals(value[2]) ){ //player: paper
            if(comp==0){
                System.out.println("computer: scissors\n You lose!");
            } else if (comp==1) {
                System.out.println("computer: rock\n You win!");
            }
            else{
                System.out.println("computer: paper\n Draw!");
            }
        }
        else{
            System.out.println("GAME OVER.."); //not rock, paper, scissors
        }
        System.out.println("");

    }
    public static void main(String[] args){
        String str[] = {"scissors", "rock", "paper"};
        int n = (int)(random()*3); // it will generates 1~3 value randomly.
        winner(str);


    }
}
