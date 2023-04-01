package chapter4;
/*
    Chap4Program1

 */

public class Chap4Program1 {
    public static void main(String[] args){
        int firstNum=10;
        int secondNum=5;

        System.out.println("Differentce between two values: "+((firstNum>secondNum)?(firstNum-secondNum):(secondNum-firstNum)));

        if (firstNum>secondNum){
            System.out.println("Differentce between two values: "+(firstNum-secondNum));
        }
        else{
            System.out.println("Differentce between two values: "+(secondNum-firstNum));
        }


    }
}
