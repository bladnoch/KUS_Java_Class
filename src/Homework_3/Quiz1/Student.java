package Homework_3.Quiz1;

import static Homework_3.Quiz1.Q1.ALLSTD;

public class Student extends SimpleStatistics {
    private String department;
    private String studentID;
    private boolean gender;
    private double height;
    private double weight;


    public Student(){
        setStdID();
    }
    public String getStudentID(){
        return studentID;
    }
    @Override
    public double getMax(double[] variable) {

        return 0;
    }
    public void setStdID(){
        String zero="0";
        String temp="";

        for (int i=0;i<ALLSTD;i++){
            if(String.valueOf(i+1).length()<5){
                for(int j=0;j<5-String.valueOf(i+1).length();j++){
                    temp+=zero;
                }
            }
            temp="Student_"+temp+(i+1);
            studentID=temp;
            temp="";
            System.out.println(studentID);

        }
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
