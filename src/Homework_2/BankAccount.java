package Homework_2;
/**
 * Q5.java
 * To creat BankAccount class and make a part of banking system
 * @since 2023-4-12
 * @author Dounguk kim
 */
public class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount(String name){
        setOwnerName(name);
    }

    public void setOwnerName(String value){
        ownerName=value;
    }
    public String getOwnerName(){return ownerName;}
    public void setInitialBalance (double value){
        balance=value;
    }
    public double getBalance(){return balance;}

    public void addBalance(double value){
        balance+=value;
    }
    public void deductBalance(double value){
        balance-=value;
    }

}
