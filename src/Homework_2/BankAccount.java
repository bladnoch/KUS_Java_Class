package Homework_2;
/**
 * BankAccount.java
 * To creat BankAccount class and make a part of banking system
 * @since 2023-4-12
 * @author Dounguk kim
 */
public class BankAccount {
    private String ownerName;
    private double balance;

    /**
     *
     * @param name
     */
    public BankAccount(String name){
        setOwnerName(name);
    }

    /**
     *
     * @param value
     */
    public void setOwnerName(String value){
        ownerName=value;
    }

    /**
     *
     * @return ownerName
     */
    public String getOwnerName(){return ownerName;}

    /**
     *
     * @param value
     */
    public void setInitialBalance (double value){
        balance=value;
    }

    /**
     *
     * @return balance
     */
    public double getBalance(){return balance;}

    /**
     *
     * @param value
     */
    public void addBalance(double value){
        balance+=value;
    }

    /**
     *
     * @param value
     */
    public void deductBalance(double value){
        balance-=value;
    }

}
