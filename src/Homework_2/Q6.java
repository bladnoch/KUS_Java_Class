package Homework_2;
/**
 * Q6.java
 * To creat BankAccount class and make a part of banking system
 * @since 2023-4-12
 * @author Dounguk kim
 */

//1000개의 은행계좌를 생성하고, 계좌주는 주인_1, 주인_2..., 은행 잔고의 초가값은 0-50000 사이 랜덤하게 할당
//모든 은행계좌에 10000추가
//잔고가 가장 큰 계좌의 이름과 잔를 출력

public class Q6 {
    final static int POPULATION=1000;
    public static void main(String[] args){
        BankAccount richGuy=new BankAccount("부자");
        BankAccount[] owner =new BankAccount[POPULATION];

        for (int i = 0;i<POPULATION;i++){
            owner[i]=new BankAccount("주인_"+(i+1));
            owner[i].setInitialBalance((int)(Math.random()*50000));
            owner[i].addBalance(10000);

            if(richGuy.getBalance()<owner[i].getBalance()){
                richGuy=owner[i];
            }
        }
        System.out.println(richGuy.getOwnerName()+"\n$"+(int)richGuy.getBalance());

    }
}
