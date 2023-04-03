package chapter7;

public class Bicycle {
    //Data member
    private String ownerName;
    public void Bicycle(){
        ownerName="Unknown";
    }
    public String getOwnerName(){
        return ownerName;
    }
    public void setOwnerName(String name){
        ownerName=name;
    }
}
