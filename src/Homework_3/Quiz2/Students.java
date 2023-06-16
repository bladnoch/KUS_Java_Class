package Homework_3.Quiz2;

import java.util.Random;

public class Students {
    private boolean gender;
    private double weight;
    private double grade;
    private Random rd=new Random();

    Students(){
        this.gender=rd.nextBoolean();
        this.weight=1.0;
        this.grade=0.0;
    }
    Students(boolean gender, double weight, double grade){
        this.gender=gender;
        this.weight=weight;
        this.grade=grade;
    }

}
