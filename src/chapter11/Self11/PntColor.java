package chapter11.Self11;

public class PntColor extends Pnt{
    private String color;

    public PntColor(int x, int y, String color){
        super(x,y);
        this.color=color;
    }

    public void showPointColor(){
        System.out.println(color);
        showXY();
    }
}
