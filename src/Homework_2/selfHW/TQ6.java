package Homework_2.selfHW;

import java.util.Random;

public class TQ6 {
    Random rd=new Random();
    final static int PEOPLE=1000;
    public static void main(String[] args){
        BoA[] owners=new BoA[PEOPLE];
        for (int i=0;i<PEOPLE;i++){
            owners[i]=new BoA();
        }
        BoA max=new BoA();

        for (int i=0;i<PEOPLE;i++){
            owners[i].setOwnerName("주인_"+(i+1));
            owners[i].setInitialBalance((int)(Math.random()*50000));
            owners[i].addBalance(10000);
            if (owners[i].getBalance()>max.getBalance()){
                max=owners[i];
            }
        }
        System.out.println(max.getOwnerName()+"\n"+max.getBalance());

    }
}
