package Homework_3.Quiz2Ver2;

import java.util.Random;

public class StdQ2 {
    private  String gender;
    private  double weight;
    private  double gpa;
    private Random rd=new Random();
    public StdQ2(String gender, double weight, double gpa){
        this.gender=gender;
        this.weight=weight;
        this.gpa=gpa;

        Q2Ver2.stdCount++;


    }

    public StdQ2(){
        this.gender=rd.nextBoolean()? "male":"female";
        this.weight=rd.nextDouble(40,140);
        this.gpa=rd.nextDouble(0,4.5);
    }

    public String getGender(){
        return gender;
    }
    public double getWeight(){
        return weight;
    }
    public double getGPA(){
        return gpa;
    }

    public void setGender(String gender){
        this.gender=gender;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public void setGPA(double gpa){
        this.gpa=gpa;
    }




}
