package chapter7;

public class Chap7Program2 {
    public static void main(String[] args){
        Bicycle bike;
        Account acctMinseok;

        String myName="Minseok Seo";

        bike = new Bicycle();
        bike.setOwnerName(myName);

        acctMinseok=new Account();
        acctMinseok.setOwnerName(myName);
        acctMinseok.setInitialBalance(250.00);

        acctMinseok.add(25.00);
        acctMinseok.deduct(50);

        System.out.println(bike.getOwnerName()+ " owns a bicycle and");
        System.out.println("has $ "+acctMinseok.getCurrnetBalance());
    }
}
