package chapter9;

/**
 * Chap9Program1.java
 * @since 2023-04-10
 * @author Dounguk Kim
 */

public class Chap9Program1 {
    static double balance;
    public static void main(String[] args){
        balance=100;

        deposit(20);
        System.out.println("Balance: "+balance);

        withraw(20);
        System.out.println("Balance: "+balance);


    }

    private static double deposit(double amount){
        double oldbalance=balance;
        balance+=amount;
        assert balance >oldbalance: //입금을 했는데 oldbalance보다 금액이 높아지지 않았다면 문제가 있다는 것 따라서 실행
                "Serious Error - balance did not incresed after calc";
        return balance;
    }


    private static double withraw(double amount){
        double oldbalance=balance;
        balance-=amount;
        assert balance <oldbalance:
                "Serious Error - balance did not decresed after calc";
        return balance;
    }
}

