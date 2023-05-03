package chapter11.Program2;

/**
 *
 * Chapt11Program2.java
 * @author DounukKim
 * @version v0.1
 * @since 5-1-2023
 */
public class Point {
    private int x,y;

    public Point(){
        this.x=this.y=0;
    }

    /**
     * Constructor(x,y)
     * @param x: user defined value
     * @param y: user defined value
     */
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public void showPoint(){
        System.out.println("("+x+","+y+")");
    }


}
