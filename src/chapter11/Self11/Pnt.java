package chapter11.Self11;

public class Pnt {
    private int x,y;

    public Pnt(int x,int y){
        setX(x);
        setY(y);
    }

    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void showXY(){
        System.out.println("("+x+", "+y+")");
    }
}
