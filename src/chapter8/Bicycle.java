package chapter8;
/*
        Bicycle.java
        having multiple constructors
        4-5-2-23
        Dounguk Kim
 */
public class Bicycle {
    //Data member
    protected String ownerName;

    public Bicycle(){
        this("Unknown");
        String temp="Unknown";
    }
    public Bicycle(String ownerName){
        this.ownerName=ownerName;
    }

    public String getOwnerName(){
        return ownerName;
    }
    public void setOwnerName(String name){
        ownerName=name;
    }
}
