package chapter11.Chap11Program3Files;

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

    /**
     * Paint function
     * @param p
     */
    static void paint(Shape p){ //받는 객체를 부모로 해야 모든 자식값을 적용할 수 있다.
        p.draw();
    }
}
