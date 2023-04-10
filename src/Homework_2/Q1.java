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
    final static int STDNUM=10000;
    public static void main(String[] args){
        Random rd=new Random();
        Student[] std=new Student[STDNUM];
        HashSet<String> allName=new HashSet<>();
        HashSet<Integer> allID=new HashSet<>();
        boolean gender;
        int count=0;
        Student bestStd=new Student();

        for (int i=0;i<STDNUM;i++){
            std[i]=new Student();
        }

        while(allName.size()<STDNUM){                     //random name
            StringBuilder sb=new StringBuilder();
            int sLength=rd.nextInt(5,11);
            for (int i =0; i<sLength;i++){
                char chr=(char)(rd.nextInt(26)+'a');
                sb.append(chr);
            }
            allName.add(sb.toString());
        }

        for (String i: allName){
            char chr=(char)(rd.nextInt(26)+'A');
            std[count].studentName=chr+i;
            count++;
        }

        while(allID.size()<STDNUM){               //random ID
            int num=rd.nextInt(100000000);
            allID.add(num);
        }

        count=0;
        for (int i: allID){
            std[count].setStudnetID(i);
            count++;
        }
        int a=1;
        for (int i = 0;i<STDNUM;i++){
            System.out.println("std num "+a);
            a++;

            gender=rd.nextBoolean();            //random Sex


            if ((gender == true)) {
                std[i].setStudnetSex("male");
            } else {
                std[i].setStudnetSex("female");
            }

            std[i].setStudnetGPA(((double)(rd.nextInt(451)))/100); //random GPA

            System.out.println(std[i].studentName+"\n"+std[i].getStudentSex()+"\n"+std[i].getStudentGPA()+"\n"+std[i].getStudentID()+"\n");

            if (std[i].getStudentGPA()>bestStd.getStudentGPA()){
                bestStd=std[i];
            }
        }
        System.out.println("best student is "+bestStd.studentName+"\n"+bestStd.getStudentSex()+"\n"+bestStd.getStudentGPA()+"\n"+bestStd.getStudentID()+"\n");


    }

}

