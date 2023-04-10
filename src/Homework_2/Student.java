package Homework_2;
/**
 * Studnet.java
 * make classes by following requirments(not main class)
 * @since 2023-4-11
 * @author Dounguk kim
 */
public class Student {
    public String studentName;
    private int studentID;
    private String studentSex;
    private double studentGPA;

    public Student(){
        studentID=0;
        studentName="Unknown";
        studentSex="Unknown";
        studentGPA=0.0;
    }

    public int getStudentID(){
        return studentID;
    }
    public void setStudnetID(int sID){
        this.studentID=sID;
    }
    public String getStudentSex(){
        return studentSex;
    }
    public void setStudnetSex(String sSex){
        this.studentSex=sSex;
    }

    public double getStudentGPA(){
        return studentGPA;
    }
    public void setStudnetGPA(double sGPA){
        this.studentGPA=sGPA;
    }



}
