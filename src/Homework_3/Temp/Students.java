package Homework_3.Temp;

import java.util.Random;

public class Students{
    private String department;
    private String studentID;
    private boolean isMale;
    private double height;
    private double weight;
    private static int count=1;
    private static Random rd=new Random();

    public Students() {
        this("undecided", "studentID",rd.nextBoolean() , 0.0, 0.0);
    }

    public Students(String studentID, boolean isMale, double height) {
        this("undecided", studentID, isMale, height, 0.0);
    }

    public Students(String department, String studentID, boolean isMale, double height, double weight) {
        this.department = department;
        this.studentID = String.format("Student_%05d", count++);
        this.isMale = isMale;
        setHeight(isMale);
        this.height = getHeight();
        this.weight = weight;
    }
    public String getDepartment() {
        return department;
    }

    public String getStudentID() {
        return studentID;
    }

    public boolean isMale() {
        return isMale;
    }
    public void setHeight(boolean isMale){
        double meanHeight = isMale ? 173.0 : 162.0;
        this.height = rd.nextGaussian()+ meanHeight;
    }
    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
