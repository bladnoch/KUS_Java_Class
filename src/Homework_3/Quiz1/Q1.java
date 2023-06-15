package Homework_3.Quiz1;

import java.util.ArrayList;
import java.util.Random;

/**
 * Q1.java
 * @author DoungukKim
 * @since 6/4/2023
 * @version v0.0.1
 */


public class Q1 extends SimpleStatistics{
    protected final static int ALLSTD=10000;
    protected static Student[] std =new Student[ALLSTD];
    protected static Random random=new Random();
    protected static double[] tempH=new double[ALLSTD];
    protected static double[] tempW=new double[ALLSTD];
    protected static int genM=0;
    protected static int genF=0;
    public static void main(String[] args) {
        Q1 in=new Q1();

        for (int i=0;i<ALLSTD;i++){
            std[i]=new Student(i);
        }

        showAbst();
        System.out.println("\nmin height: "+ in.getMin(tempH));
        System.out.println("Max height: "+ in.getMax(tempH));
        System.out.println("mean height: "+in.getMean(tempH));

        System.out.println("\nmin weight: "+ in.getMin(tempW));
        System.out.println("Max weight: "+ in.getMax(tempW));
        System.out.println("mean weight: "+in.getMean(tempW));
        cond();
        System.out.println("\nmean male height: "+in.getConditionalMean("male",tempH));
        System.out.println("mean male weight: "+in.getConditionalMean("male",tempW));
        System.out.println("\nmean female height: "+in.getConditionalMean("female",tempH));
        System.out.println("mean female weight: "+in.getConditionalMean("female",tempW));

    }
    public static void showAbst(){
        for (int i=0;i<ALLSTD;i++){
            tempH[i]=std[i].getHeight();
            tempW[i]=std[i].getWeight();
        }
    }
    public static void cond(){
        for(int i=0;i<ALLSTD;i++){
            if(std[i].getGender()){
                genM+=1;
            }
            else {
                genF+=1;
            }
        }
    }


    public double getMean(double[] variable) {
        double v=0;
        for (int i=0;i<ALLSTD;i++){
                v+=variable[i];
        }
        v/=ALLSTD;
        return v;
    }
    @Override
    public double getConditionalMean(String condition, double[] variable) {
        double temp=0;
        for(int i=0;i<ALLSTD;i++){
            if(condition.equals("male") && std[i].getGender() ==true){
                temp+=variable[i];
            }
            else if(condition.equals("female") && std[i].getGender()==false){
                temp+=variable[i];
            }
        }
        if(condition.equals("male")){
            temp/=genM;
        }else temp/=genF;

        return temp;
    }
    @Override
    public double getMax(double[] variable) {
        double v=variable[0];
        for (int i=0;i<ALLSTD;i++){
            if(variable[i]>v){
                v=variable[i];
            }
        }
        return v;
    }
    @Override
    public double getMin(double[] variable) {
        double temp=variable[0];
        for (int i=0;i<ALLSTD;i++){
            if(variable[i]<temp){
                temp=variable[i];
            }
        }
        return temp;
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
//            std[i]=new Student(temp);
            temp="";
            System.out.println(std[i].getStudentID());
        }
    }
}
