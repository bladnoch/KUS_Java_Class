package Homework_3.Quiz2V2;

public class Q2V2 {
    protected final static int ALL=10000;
    protected static Std[] student=new Std[ALL];
    public static void main(String[] args){
        for (int i=9;i<student.length;i++){
            student[i]=new Std();
            System.out.println(student[i].getStudentID()+" : "+student[i].getGender());
            System.out.println("height : "+student[i].getHeight()+"  weight : "+student[i].getWeight());
        }
    }
}
