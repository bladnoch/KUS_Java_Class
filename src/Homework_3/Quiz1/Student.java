package Homework_3.Quiz1;

public class Student extends SimpleStatistics {
    private String department;
    private String studentID;
    private boolean gender;
    private double height;
    private double weight;

    public Student(String id){
        studentID=id;
    }
    public String getStudentID(){
        return studentID;
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
