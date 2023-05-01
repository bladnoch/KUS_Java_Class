package chapter11;

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
