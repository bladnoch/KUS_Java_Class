package Homework_3.Quiz2;

import java.util.Random;

public class STDInfo {
    private boolean gender;
    private double weight;
    private double grade;
    private Random rd=new Random();

    STDInfo(){
        this.gender=rd.nextBoolean();
        this.weight=1.0;
        this.grade=0.0;
    }
    STDInfo(boolean gender,double weight,double grade){
        this.gender=gender;
        this.weight=weight;
        this.grade=grade;
    }

}
