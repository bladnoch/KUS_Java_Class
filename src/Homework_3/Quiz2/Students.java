package Homework_3.Quiz2;

import java.util.Random;

public class Students {
    private String gender;
    private double weight;
    private double grade;
    private Random rd=new Random();

    Students(){
        this.gender=rd.nextBoolean()? "male":"female";
        this.weight=1.0;
        this.grade=0.0;
    }
    Students(String gender, double weight, double grade){
        this.gender=gender;
        this.weight=weight;
        this.grade=grade;
    }
    public String getGender() {
        return gender;
    }
    public double getWeight() {
        return weight;
    }
    public double getGrade() {
        return grade;
    }
}
