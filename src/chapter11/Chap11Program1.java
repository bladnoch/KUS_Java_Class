package chapter11;

import Homework_2.Student;

/**
 * Chap11Program1 : to make Person - Student11 - Chap11Program1 relationship to study Inheritance(상속).
 *
 * @author DoungukKim
 * @version v0.1
 * @since 5-1-2023
 */


/*
        Person에 기본정보를 위한 변수들이 있다.
        Student11에 정보를 입력하기 위한 메소드와 프린트 하기위한 메소드가 있다.
 */
public class Chap11Program1 {

    public static void main(String[] args){
        Student11 s=new Student11();
        s.set();
        s.height=181; //protect일 경우 값을 바꾸는 방법
        s.display();
    }
}
