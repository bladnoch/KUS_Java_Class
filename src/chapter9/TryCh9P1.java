package chapter9;

import java.util.Scanner;

public class TryCh9P1 {
    public static int balance;

    private static int deposit(int money){
        balance+=money;
        return balance;
    }

    private static int withraw(int money){
        balance-=money;
        assert balance<0:
                "low balance";
        return balance;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Write your balance");

        balance=sc.nextInt();



        while (true){
            System.out.println("1)deposit / 2) withraw");
            int what=sc.nextInt();

            if(what==1){
                System.out.println("How much?");
                what=sc.nextInt();
                deposit(what);
                System.out.println(balance);
            } else if (what==2) {
                System.out.println("How much?");
                what=sc.nextInt();
                withraw(what);
                System.out.println(balance);
            }
            else{
                System.out.println("type in propore commend");
            }
        }


    }
}
