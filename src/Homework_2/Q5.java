package Homework_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Q4.java
 * giving ieal weight of male, and female depends on their height
 * @since 2023-4-12
 * @author Dounguk kim
 */
public class Q5 {
    final static double WFEMALE=37.8;
    final static double WMALE=40;

    /**
     * get input for set gender
     * 성별을 정할 인풋을 받는다.
     * @return gen
     */
    public static int setGender(){
        Scanner sc=new Scanner(System.in);
        int gen=0;
        System.out.println("What is your gender? \n1)Male   2)Female");
        while(gen==0){
            try{
                gen=sc.nextInt();
            } catch (InputMismatchException e){
                sc.nextLine();
            }
            if(gen!=1 && gen!=2){
                gen=0;
                System.out.println("Please put number\n1)Male   2)Female");
            }
        }
        return gen;
    }

    /**
     * after get gender by setGender start calculation methods by gender
     * setGender에서 값을 받은 후 각 성별에 맞는 메소드가 실행된다.
     * @param gen
     * @param height
     */
    public static void condition(int gen, int height){
        if (gen==1){
            idealMale(height);
        }
        else{
            idealFemale(height);
        }
    }

    /**
     * calculate male's ideal weight
     * 남자의 적정 체중을 계산한다.
     * @param h
     */
    public static void idealMale(int h){
        if(h<150){
            System.out.println("Your ideal weight is "+WMALE+"kg");
        }
        else {
            System.out.println("Your ideal weight is "+(WMALE+0.89*(h-150))+"kg");
        }
    }

    /**
     * calculate female's ideal weight
     * 여자의 적정 체중을 계산한다.
     * @param h
     */
    public static void idealFemale(int h){
        if(h<150){
            System.out.println("Your ideal weight is "+WFEMALE+"kg");
        }
        else {
            System.out.println("Your ideal weight is "+(WFEMALE+0.89*(h-150))+"kg");
        }

    }

    /**
     * set height and return height. It has exception check
     * 높이를 받고 받은 높이를 리턴. 예외처리가 있다
     * @return
     */
    public static int setHeight(){
        Scanner sc=new Scanner(System.in);
        int height=0;
        System.out.println("How tall are you?(cm)");
        while(height==0){
            try{
                height=sc.nextInt();
            } catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("How tall are you?(cm)");
            }
        }
        return height;
    }
    public static void main(String[] args){
        int gen=setGender();
        int height=setHeight();
        condition(gen,height);


    }
}
