package Homework_3.Quiz1V2;

import java.util.Random;

public class Std {
    private String department;
    private String studentID;
    private String gender;
    private double height;
    private double weight;
    private static int studentCount = 0;
    private Random rand=new Random();


    public Std() {
        studentCount++;

        this.department = department;
        this.studentID = String.format("Student_%05d", studentCount);
        if (rand.nextDouble() < 0.5) {
            this.gender = "male";
        } else {
            this.gender = "female";
        }
        this.height = (gender.equals("male") ? rand.nextGaussian() + 173 : rand.nextGaussian()+ 162);
        this.weight = (gender.equals("male") ? rand.nextGaussian()+ 68 : rand.nextGaussian()+ 52);
    }

    // getters and setters
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
