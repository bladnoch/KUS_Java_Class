
package Homework_3.Quiz1;


import static Homework_3.Quiz1.Q1.*;




public class Student extends Q1 {
    private String department;
    private String studentID;
    private boolean gender;
    private double height;
    private double weight;


    public Student(int i){
        setStudentID(i);
        setGender();
        setHeight(gender);
        setWeight(gender);
    }
    public Student(int i,boolean gender){
        setStudentID(i);
        this.gender=gender;
    }
    public Student(int i,boolean gender, double height, double weight){
        setStudentID(i);
        this.gender=gender;
        this.height=height;
        this.weight=weight;
    }


    public void setHeight(boolean gender){
        if(gender==true){
            height= random.nextGaussian()+173;
        }
        else {
            height= random.nextGaussian()+162;
        }
        System.out.println(height);
    }
    public double getHeight(){
        return height;
    }
    public void setWeight(boolean gender){
        if(gender==true){
            weight= random.nextGaussian()+68;
        }
        else {
            weight= random.nextGaussian()+52;
        }
        System.out.println(weight);
    }
    public double getWeight(){
        return weight;
    }
    @Override
    public double getMax(double[] variable) {
        return 0;
    }
    public void setGender(){
        gender= random.nextBoolean();
        System.out.println(gender);
    }

    public boolean getGender() {
        return gender;
    }

    public void setStudentID(int j){
        String zero="0";
        String temp="";

        if(String.valueOf(j+1).length()<5){
            for(int i=0;i<5-String.valueOf(j+1).length();i++){
                temp+=zero;
            }
        }
        temp="Student_"+temp+(j+1);
        studentID=temp;
        temp="";
        System.out.println(studentID);

    }
    public String getStudentID(){
        return studentID;
    }
    @Override
    public double getConditionalMean(String condition, double[] variable) {
        return 0;
    }
    @Override
    public double getMean(double[] variable) {
        return 0;
    }
    @Override
    public double getMin(double[] variable) {
        return 0;
    }

}
