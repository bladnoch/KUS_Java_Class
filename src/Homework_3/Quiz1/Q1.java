package Homework_3.Quiz1;

import java.util.Random;

public class Q1{
    final static int ALLSTD=10000;
    protected static Student std[]=new Student[ALLSTD];
    protected static Random random=new Random();
    public static void main(String[] args) {
        setStdID();
        setHeight();
        setWidth();
//        printAll();
    }

    public static void printAll(){
        for (int i=0;i<ALLSTD;i++){

        }
    }
    public static void setWidth(){
        double[] b= new double[ALLSTD];
        int all=0;

        for (int i=0;i<ALLSTD;i++){
            b[i]=random.nextGaussian()+68;
            System.out.println(std[i].getStudentID()+": "+b[i]);
        }
        for (int i=0;i<ALLSTD;i++){
            all+=b[i];
        }
        System.out.println("mean weight of all students are "+(all/ALLSTD));
    }
    public static void setHeight(){
        double[] b= new double[ALLSTD];
        int all=0;

        for (int i=0;i<ALLSTD;i++){
            b[i]=random.nextGaussian()+173;
            System.out.println(std[i].getStudentID()+": "+b[i]);
        }
        for (int i=0;i<ALLSTD;i++){
            all+=b[i];
        }
        System.out.println("mean height of all students are "+(all/ALLSTD));
    }
    public static void setStdID(){
        String zero="0";
        String temp="";

        for (int i=0;i<ALLSTD;i++){
            if(String.valueOf(i+1).length()<5){
                for(int j=0;j<5-String.valueOf(i+1).length();j++){
                    temp+=zero;
                }
            }
            temp="Student_"+temp+(i+1);
            std[i]=new Student(temp);
            temp="";
            System.out.println(std[i].getStudentID());
        }
    }
}
