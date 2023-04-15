package Homework_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Q8.java
 * make translater that translate English to Korean
 * @since 2023-4-13
 * @author Dounguk kim
 */

class TwoInt{
    int a=0;
    public void getSum(int a,int b){
        this.a=a+b;
    }
}
class ThreeInt extends TwoInt{
    public void getSum(int a,int b, int c){
        this.a=a+b+c;
    }
}
class IntList extends ThreeInt{
    public void getSum(int[] a){
        for (int i=0;i<a.length;i++){
            this.a+=a[i];
        }
    }
}
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

        while(true){
            System.out.println("Put numbers(더이상 원하지 않을 경우 \'over\'을 입력해 주세요) :");
            over=sc.next();
            if(over.equals("over")){
                break;
            }
            try{
                try{
                    num.add(Integer.parseInt(over));
                } catch (NumberFormatException e){
                    num2.add(Double.parseDouble(over));
                    count--;
                    count2++;
                }
            } catch (NumberFormatException e){
                System.out.println("Not a digit..");
                count--;
                sc.nextLine();
            }
            count++;
            iInput=new int[count];
            dInput=new double[count2];
        }

        for (int i=0;i<iInput.length;i++){
            iInput[i]=num.get(i);
        }
        for (int i=0;i<dInput.length;i++){
            dInput[i]=num2.get(i);
        }

        goClass(s,count,iInput);
        s.getSum(dInput);

    }
}
