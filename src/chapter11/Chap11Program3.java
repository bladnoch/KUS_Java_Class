package chapter11;

/**
 * Line, Rect, Circle extends Shape class
 * Chapt11Program3.java
 * @author DounukKim
 * @version v0.1
 * @since 5-1-2023
 */
public class Chap11Program3 {
    public static void main(String[] args){
        Line line = new Line();
        paint(line);
        paint(new Shape());
        paint(new Line());
        paint(new Rect());
        paint(new Circle());

    }
    static void paint(Shape p){
        p.draw();
    }
}
