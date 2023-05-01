package chapter11.Self11;

public class CustomCar extends Car {

    public void setAll(){
        setColor("British Green");
        setType("Hatchback");
        setPrice(60000);
        setWheel(19);
        setName("Mazda");
    }
    public void printAll(){

        System.out.println("Brand is : "+ getName());
        System.out.println("color is : "+ getColor());
        System.out.println("Car type is : "+ getType());
        System.out.println("Price is : $"+ getPrice());
        System.out.println("Wheel size : "+ getWheel()+" inches");
    }
}
