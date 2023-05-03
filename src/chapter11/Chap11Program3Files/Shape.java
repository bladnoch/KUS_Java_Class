package chapter11.Chap11Program3Files;

/**
 * Line, Rect, Circle extends Shape class
 * Shape.java
 * @author DounukKim
 * @version v0.1
 * @since 5-1-2023
 */
class Shape {
    public Shape next;

    /**
     * Constructor
     */
    public Shape() {
        next = null;
    }

    /**
     * Drwaing function
     */
    public void draw() {
        System.out.println("Shape");
    }
}





