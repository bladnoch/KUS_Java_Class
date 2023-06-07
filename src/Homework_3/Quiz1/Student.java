package Homework_3.Quiz1;

public class Student extends Q1{
    private String department;
    private String studentID;
    private boolean gender;
    private double height;
    private double weight;

    public Student(String id){
        studentID="Student_"+id;
    }
    public String getStudentID(){
        return studentID;
    }

}
