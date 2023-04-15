package Homework_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Q9.java
 * get random amount of numbers, and add override by input situation
 * @since 2023-4-13
 * @author Dounguk kim
 */

/**
 * get two ints and print sum of all numbers
 * 정수 2개를 받는다 그리고 더한 값을 출력한다.
 */
class TwoInt{
    int a=0;
    public void getSum(int a,int b){
        this.a=a+b;
    }
}

/**
 * get three ints and print sum of all numbers
 * 정수 3개를 받는다. 그리고 더한 값을 출력한다.
 */
class ThreeInt extends TwoInt{
    public void getSum(int a,int b, int c){
        this.a=a+b+c;
    }
}

/**
 * get int array and print sum of all numbers
 * 정수 배열을 받는다. 그리고 더한 값을 출력한다.
 */
class IntList extends ThreeInt{
    public void getSum(int[] a){
        for (int i=0;i<a.length;i++){
            this.a+=a[i];
        }
    }
}

/**
 * get double array and print sum of all numbers
 * 실수 배열을 받는다. 그리고 더한 값을 출력한다.
 */
class DoubleList extends IntList{
    public void getSum(double[] db){
        double sum=this.a;
        for (int i=0;i<db.length;i++){
           sum+=db[i];
        }
        System.out.println("Sum of all input numbers is: "+sum);
    }
}

public class Q9 {
    /**
     * call right class by each input situation
     * 받은 인풋에 맞는 클래스를 호출한다.
     * @param s
     * @param count
     * @param iInput
     */
    public static void goClass(DoubleList s,int count, int[] iInput){
        if (count==2){
            s.getSum(iInput[0],iInput[1]);
        }
        else if(count==3){
            s.getSum(iInput[0],iInput[1],iInput[2]);
        }
        else if(count>3){
            s.getSum(iInput);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        DoubleList s=new DoubleList();

        List<Integer>num=new ArrayList<>();
        List<Double>num2=new ArrayList<>();
        int[] iInput = new int[0];
        double[] dInput =new double[0];
        int count=0;
        int count2=0;
        String over;

        while(true){            //get numbers until user does not want
            System.out.println("Put numbers(더이상 원하지 않을 경우 \'over\'을 입력해 주세요) :");
            over=sc.next();     //get input
            if(over.equals("over")){    //if user typed over break loop
                break;
            }
            try{    //if input is not int check that is double or not
                try{
                    num.add(Integer.parseInt(over));
                } catch (NumberFormatException e){
                    num2.add(Double.parseDouble(over));
                    count--;
                    count2++;
                }
            } catch (NumberFormatException e){  //if input was not a int or double print warning and start over
                System.out.println("Not a digit..");
                count--;
                sc.nextLine();
            }
            count++;
            iInput=new int[count];
            dInput=new double[count2];
        }

        for (int i=0;i<iInput.length;i++){  //shift int Map's values to array
            iInput[i]=num.get(i);
        }
        for (int i=0;i<dInput.length;i++){  //shift double Map's values to array
            dInput[i]=num2.get(i);
        }

        goClass(s,count,iInput);
        s.getSum(dInput);

    }
}
