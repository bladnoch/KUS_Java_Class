package Homework_3.Quiz1;

public class Q1 {
    final static int ALLSTD=10000;
    public static void main(String[] args){
        Student std[]=new Student[ALLSTD];

        for (int i=0;i<ALLSTD;i++){
            if(String.valueOf(i+1).length()<6){
                String temp;
            }
            std[i]=new Student(i+1);
        }
    }
}
