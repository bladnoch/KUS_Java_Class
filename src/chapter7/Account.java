package chapter7;

public class Account {
    private String ownerName;
    private double balance;

    public Account(){
        ownerName="Unassigned";
        balance=0.0;
    }
    public void add(double amt){
        balance+=amt;
    }
    public void deduct(double amt){
        balance-=amt;
    }
    public double getCurrnetBalance(){
        return balance;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public void setInitialBalance(double bal){
        balance=bal;
    }
    public void setOwnerName(String name){
        ownerName=name;
    }

}
