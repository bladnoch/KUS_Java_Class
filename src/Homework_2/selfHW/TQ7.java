package Homework_2.selfHW;

import java.util.Random;
import java.util.Scanner;

/**
 * TQ7.java
 * make rock scissors and paper game
 * @since 4/23/2023
 * @author Dounguk Kim
 */
public class TQ7 {
    public static void calc(int playerNum,int computer){
        if (playerNum==computer){
            System.out.println("draw");
        } else if (playerNum==0 && computer==1) {
            System.out.println("you lose");
        } else if(playerNum==0 && computer==2){
            System.out.println("you win");
        }
        else if (playerNum>computer){
            System.out.println("you win");
        }
        else {
            System.out.println("you lose");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();

        String[] str = {"scissors", "rock", "paper"};
        int n = (int)(Math.random()*3);
        String player;
        int playerNum;
//        try{
            player=sc.next();
//        } catch(){
//            break;
//        }

        System.out.println("Computer: "+str[n]);

        if (player.equals(str[0]) || player.equals(str[1]) || player.equals(str[2])){
            if (player.equals(str[0])){ //플레이어 sciss
                calc(0,n);
            } else if (player.equals(str[1])) { //rock
                calc(1,n);
            }else { //paper
                calc(2,n);
            }
        }





    }
}
