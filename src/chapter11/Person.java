package chapter11;
/**
 * Person.java
 * @author DoungukKim
 * @version v0.1
 * @since 5-1-2023
 */
public class Person {
    /**
     * Data members
     */
    private int weight;
    private int age;
    protected int height;
    public String name;

    /**
     * set functions
     * @param weight
     */
    public void setWeight(int weight){
        this.weight=weight;
    }
    public int getWeight(){
        return weight;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

}
