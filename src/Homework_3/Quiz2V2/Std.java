package Homework_3.Quiz2V2;

public class Std {
    private String department;
    private String studentID;
    private char gender;
    private int height;
    private double weight;

    // constructor
    public Std(String department, String studentID, char gender, int height, double weight) {
        this.department = department;
        this.studentID = studentID;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
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
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public int getHeight() {
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
