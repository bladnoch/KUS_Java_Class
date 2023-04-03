package chapter7;

public class Bicycle {
    //Data member
    private String ownerName;
    private String brand;
    private int price;

    public String getBrand(){
        return brand;
    }
    public void setBrand(String name){
        brand=name;
    }
    public Bicycle(){
        ownerName="OEM";
        brand="3000";
        price=10000;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int p){
        price=p;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public void setOwnerName(String name){
        ownerName=name;
    }
}
