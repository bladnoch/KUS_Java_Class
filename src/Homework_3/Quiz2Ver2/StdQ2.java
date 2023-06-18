package Homework_3.Quiz2Ver2;

public class StdQ2 {
    private  String gender;
    private  double weight;
    private  double gpa;
    public StdQ2(String gender, double weight, double gpa){
        this.gender=gender;
        this.weight=weight;
        this.gpa=gpa;
    }

    public StdQ2(){
//        this.gender
//        this.weight
//        this.gpa
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
