package chapter4;

import java.util.Scanner;
/*
    Chap4Program2.java
    using switch, and case
    3-22-2023
    Dounguk Kim

 */
public class Chap4Program2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        char grade;
        System.out.println("input the score(0-100 scale): ");

        int score=sc.nextInt();
//  int를 사용하면 10개의 변수만 생기기 때문에 단축이 가능하다
//        switch (score/10){
//
//            case 10:
//            case 9:
//                grade='A';
//                break;
//            case 8:
//                grade='B';
//                break;
//            case 7:
//                grade='C';
//                break;
//            case 6:
//                grade='D';
//                break;
//            default:
//                grade='F';
//        }
//
//        System.out.println(grade);

        if ((score/10)==9){
            grade='A';
        }
        else if ((score/10)==8){
            grade='B';
        }
        else if ((score/10)==7){
            grade='C';
        }
        else if((score/10)==6){
            grade='D';
        }
        else{
            grade='F';
        }
        System.out.println(grade);

    }
}