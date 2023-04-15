package Homework_2;
/**
 * Studnet.java
 * using for Q1. To make classes by following requirment(not main class)
 * @since 2023-4-11
 * @author Dounguk kim
 */
public class Student {
    public String studentName;
    private int studentID;
    private String studentSex;
    private double studentGPA;

    /**
     * default setting
     * 기본 세팅
     */
    public Student(){
        studentID=0;
        studentName="Unknown";
        studentSex="Unknown";
        studentGPA=0.0;
    }

    /**
     *
     * @return studnetID
     */
    public int getStudentID(){
        return studentID;
    }

    /**
     *
     * @param sID
     */
    public void setStudnetID(int sID){
        this.studentID=sID;
    }

    /**
     *
     * @return studentSex
     */
    public String getStudentSex(){
        return studentSex;
    }

    /**
     *
     * @param sSex
     */
    public void setStudnetSex(String sSex){
        this.studentSex=sSex;
    }

    /**
     *
     * @return studentGPA
     */
    public double getStudentGPA(){
        return studentGPA;
    }

    /**
     *
     * @param sGPA
     */
    public void setStudnetGPA(double sGPA){
        this.studentGPA=sGPA;
    }



}
