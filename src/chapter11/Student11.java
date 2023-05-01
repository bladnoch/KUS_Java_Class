package chapter11;

/**
 * Student.java
 * @author DoungukKim
 * @version v0.1
 * @since 5-1-2023
 */

public class Student11 extends Person{
    public void set(){
        setAge(29);
        name="DounukKim";
        height=171;
        setWeight(113);
    }
    public void display() {
        System.out.println("age : "+getAge());
        System.out.println("name : "+name);
        System.out.println("height : "+height);
        System.out.println("weight : "+getWeight());
    }
}
