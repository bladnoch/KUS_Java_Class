package Homework_3.Quiz1;

import java.util.Random;

public class Q1 extends SimpleStatistics{
    protected final static int ALLSTD=10000;
    protected static Student[] std =new Student[ALLSTD];
    protected static Random random=new Random();
    protected static double[] temp=new double[ALLSTD];
    public static void main(String[] args) {
        Q1 in=new Q1();
        for (int i=0;i<ALLSTD;i++){
            std[i]=new Student(i);
        }
        showAbst();
        System.out.println("min of height is "+ in.getMin(temp));

    }
    public static void showAbst(){
        for (int i=0;i<ALLSTD;i++){
            temp[i]=std[i].getHeight();
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
//            std[i]=new Student(temp);
            temp="";
            System.out.println(std[i].getStudentID());
        }
    }




    public double getMean(double[] variable) {
        return 0;
    }

    /**
     * @param condition
     * @param variable
     * @return
     */
    @Override
    public double getConditionalMean(String condition, double[] variable) {
        return 0;
    }

    /**
     * @param variable
     * @return
     */
    @Override
    public double getMax(double[] variable) {
        return 0;
    }

    /**
     * @param variable
     * @return
     */
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
}
