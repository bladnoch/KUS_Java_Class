package chapter11;
/**
 * Student.java
 * @author DoungukKim
 * @version v0.1
 * @since 5-1-2023
 */
public class Student11 extends Person{
    public void set(){
        age=39;
        name="psy";
        height=182;
        setWeight(99);
    }
    public void display() {
        System.out.println("age : "+age);
        System.out.println("name : "+name);
        System.out.println("height : "+height);
    }
}
