package Homework_3.Quiz2;

import java.util.Random;

/**
 * Students.java
 * @author Dounguk Kim
 * @since 6/16/2023
 * @version v0.0.1
 */
public class Students {
    private String gender;
    private double weight;
    private double grade;
    private Random rd=new Random();

    /**
     * Students constructor
     * no param constructor randomly fills student info
     */
    Students(){
        this.gender=rd.nextBoolean()? "male":"female";
        this.weight=rd.nextDouble(40,100);
        this.grade=rd.nextDouble(0.0,4.5);
        Q2.stdNum++;
    }

    /**
     * Students constructor
     * @param gender: save gender of male, and female by radio button
     * @param weight: save input weight
     * @param grade: save input grade
     */
    Students(String gender, double weight, double grade){
        this.gender=gender;
        this.weight=weight;
        this.grade=grade;
    }

    /**
     * getGender() method
     * @return String type of male, or female
     */
    public String getGender() {
        return gender;
    }

    /**
     * getWeight() method
     * @return double type of weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * getGrade() method
     * @return double type of grade between 0.0~4.5
     */
    public double getGrade() {
        return grade;
    }
}
