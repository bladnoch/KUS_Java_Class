package chapter11;

/**
 *
 * Chapt11Program2.java
 * @author DounukKim
 * @version v0.1
 * @since 5-1-2023
 */

public class ColorPoint extends Point{
    private String color;

    /**
     * Constructor with x,y,color
     * @param x: user defined value
     * @param y: user defined value
     * @param color: user defined value
     */

    public ColorPoint(int x, int y, String color){
        super(x,y);
        this.color=color;
    }

    public void showColorPoint(){
        System.out.println(color);
        showPoint();
    }
}
