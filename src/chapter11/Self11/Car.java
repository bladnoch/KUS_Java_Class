package chapter11.Self11;

public class Car {
    private int wheel;
    private String type;
    private int price;
    private String color;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getPrice() {
        return price;
    }
    public int getWheel() {
        return wheel;
    }
    public String getColor() {
        return color;
    }
    public String getType(){
        return type;
    }
}
