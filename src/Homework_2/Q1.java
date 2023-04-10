package Homework_2;
/**
 * Q1.java
 * make classes by following requirments(main class)
 * @since 2023-4-11
 * @author Dounguk kim
 */
import java.util.HashSet;
import java.util.Random;

public class Q1 {
    public static void main(String[] args){
        Random rd=new Random();
        Student[] std=new Student[10000];
        HashSet<String> allName=new HashSet<>();
        HashSet<Integer> allID=new HashSet<>();
        boolean gender;

        while(allName.size()<1000){

        }

        while(allID.size()<1000){               //random ID
            int num=rd.nextInt(100000000);
            allID.add(num);
        }

        for (int i = 0;i<10000;i++){

            std[i]=new Student();
            std[i].studentName="sfsdg"+i;



            gender=rd.nextBoolean();            //random Sex
            if ((gender == true)) {
                std[i].setStudnetSex("male");
            } else {
                std[i].setStudnetSex("female");
            }

            std[i].setStudnetGPA(((double)(rd.nextInt(451)))/100); //random GPA


            System.out.println(std[i].studentName+"\n"+std[i].getStudentSex()+"\n"+std[i].getStudentGPA());


        }

    }

}

