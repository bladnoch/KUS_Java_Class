package Homework_3.Quiz1;

public class Q1 extends SimpleStatistics{
    final static int ALLSTD=10000;
    private static Student std[]=new Student[ALLSTD];
    public static void main(String[] args){
        setStdID();
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
            temp=temp+(i+1);
            std[i]=new Student(temp);
            temp="";

            System.out.println(std[i].getStudentID());
        }
    }

    @Override
    public double getMax(double[] variable) {
        return 0;
    }

    @Override
    public double getConditionalMean(String condition, double[] variable) {
        return 0;
    }

    @Override
    public double getMean(double[] variable) {
        return 0;
    }

    @Override
    public double getMin(double[] variable) {
        return 0;
    }
}
