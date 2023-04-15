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

    /**
     * make default values in array std
     * 배열 std에 기본정보 입력
     * @param std
     */
    public static void setDefaut(Student[] std){
        for (int i=0;i<STDNUM;i++){
            std[i]=new Student();
        }
    }

    public static void main(String[] args){
        Random rd=new Random();
        Student[] std=new Student[STDNUM]; //1000개짜리 배열 생성
        HashSet<String> allName=new HashSet<>(); //이름 저장
        HashSet<Integer> allID=new HashSet<>();     //id 저장
        boolean gender;
        int count=0;
        Student bestStd=new Student();

/**
 *  creat default values in array std
 *  배열 std에 기본정보 입력
 */
        setDefaut(std);
/**
 * loop 1000 times and put names in allName
 * 1000번 반복 랜덤 이름 생성 후 allName에 추가
 */
        while(allName.size()<STDNUM){                     //random name
            StringBuilder sb=new StringBuilder();
            int sLength=rd.nextInt(3,9);
            for (int i =0; i<sLength;i++){
                char chr=(char)(rd.nextInt(26)+'a');
                sb.append(chr);
            }
            allName.add(sb.toString());
        }
        for (String i: allName){                        //add capital letter for name
            char chr=(char)(rd.nextInt(26)+'A');
            std[count].studentName=chr+i;
            count++;
        }
/**
 * loop 1000 times to make student's ID under 100000000
 * 1000번 반복 100000000아래로 숫자 랜덤 생성 후 ID에 추가
 */
        setID(allID,rd);

        count=0;
        for (int i: allID){
            std[count].setStudnetID(i);
            count++;
        }
/**
 * set students' info, print all students, and print best student in last
 * 모든 학생들의 정보를 저장, 프린트하고 마지막엔 가장 성적이 좋은 학생을 프린트
 */
        int a=1; //몇번깨 학생인지 표시
        for (int i = 0;i<STDNUM;i++){
            System.out.println("std num "+a);
            a++;

            setGender(rd,std[i]);
            setGPA(rd,std[i]);
            printInfo(std[i]);
            bestStd=setBestStd(std[i],bestStd);
        }
        System.out.println("best student is "+bestStd.studentName+"\n"+bestStd.getStudentSex()+"\n"+bestStd.getStudentGPA()+"\n"+bestStd.getStudentID()+"\n");
    }

    /**
     * set individual student's gender.
     * 학생들의 성별을 정해준다.
     * @param rd
     * @param std
     */
    public static void setGender(Random rd,Student std){
        boolean gender=rd.nextBoolean();
        if ((gender == true)) {
            std.setStudnetSex("male");
        } else {
            std.setStudnetSex("female");
        }
    }

    /**
     * set GPA of students
     * 학생들 성적을 입력
     * @param rd
     * @param std
     */
    public static void setGPA(Random rd,Student std){
        std.setStudnetGPA(((double)(rd.nextInt(451)))/100); //random GPA
    }

    /**
     * loop 1000 times. Creat random value under 100000000
     * 1000번 반복 100000000아래로 숫자 랜덤 생성 후 ID에 추가
     * @param allID
     * @param rd
     */
    public static void setID(HashSet allID, Random rd){
        while(allID.size()<STDNUM){               //random ID
            int num=rd.nextInt(100000000);
            allID.add(num);
        }
    }

    /**
     * print students' info
     * 학생들 정보를 프린트
     * @param std
     */
    public static void printInfo(Student std){
        System.out.println(std.studentName+"\n"+std.getStudentSex()+"\n"+std.getStudentGPA()+"\n"+std.getStudentID()+"\n");
    }

    /**
     * set best student's info
     * 가장 성적이 좋은 학생의 정보 저장
     * @param std
     * @param best
     * @return best
     */
    public static Student setBestStd(Student std,Student best){
        if (std.getStudentGPA()>best.getStudentGPA()){
            best=std;
        }
        return best;
    }

}

