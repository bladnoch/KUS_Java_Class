package chapter7;
/*
        Chap7Program1.java
        creat class
        4-3-2023
        Dounguk Kim
 */
public class Chap7Program1 {
    public static void main(String[] args){

        Bicycle bike1,bike2;
        String owner1,owner2;

        bike1=new Bicycle();
        bike1.setOwnerName("Minseok Seo");

        bike2=new Bicycle();
        bike2.setOwnerName("IU");

        owner1=bike1.getOwnerName();
        owner2=bike2.getOwnerName();

        System.out.println(owner1+" owns a bicycle.");
        System.out.println(owner2+" also owns a bicycle.");
    }
}
