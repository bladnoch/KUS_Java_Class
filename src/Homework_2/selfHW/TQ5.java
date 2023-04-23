package Homework_2.selfHW;

import java.util.InputMismatchException;
import java.util.Scanner;

class Human{
    private String gender;

    public void setGender(int gen){
        if (gen== 1){
            gender="Male";
        }
        else {
            gender="Female";
        }
    }
    public String getGender(){
        return gender;
    }
}

public class TQ5 {
    public static int askGender(Scanner sc){
        int gen=0;
        System.out.print(" what is your gender? \n1)Male  2)Female  ");
        while(true){
            try{
                gen=sc.nextInt();

            } catch (InputMismatchException e){
                sc.nextLine();
            }
            if(gen==1 || gen==2){
                break;
            }
            else{
                System.out.println("Wrong put 1 for male, or 2 for female");
                sc.nextLine();
            }
        }
        return gen;
    }
    public static int askHeight(Scanner sc){
        int height=0;
        System.out.println("what is your height?(cm)");
        while(true){
            try{
                height=sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine();
            }
            if (height!=0){
                break;
            }
            else {
                System.out.println("Wrong height");
                sc.nextLine();
            }
        }
        return height;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Human me=new Human();
        int height;

        me.setGender(askGender(sc));
        height=askHeight(sc);

        if (me.getGender().equals("Male")){
            if(height>=150){
                System.out.println((40+0.89*(height-150))+"kg is your ideal weight");
            }
            else
                System.out.println(40+"kg is your ideal weight");
        }
        else if(me.getGender().equals("Female")){
            if(height>=150){
                System.out.println((37.8+0.75*(height-150))+"kg is your ideal weight");
            }
            else
                System.out.println(37.8+"kg is your ideal weight");
        }


    }
}
