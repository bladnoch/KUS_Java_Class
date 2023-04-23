package Homework_2.selfHW;

public class BoA {


    private String owenerName;
    private double balance;

    public BoA(){
        owenerName="";
        balance=0;
    }
    public void setOwnerName(String name){
        owenerName=name;

    }
    public String getOwnerName(){
        return owenerName;
    }
    public void setInitialBalance(double initial){
        balance=initial;
    }

    public Double getBalance() {
        return balance;
    }
    public void addBalance(double add){
        balance+=add;
    }
    public void deductBalance(double deduct){

    }
}
