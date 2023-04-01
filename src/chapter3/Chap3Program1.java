package chapter3;
import javax.swing.*;
/*
    Chap3Program1.java
    self quiz
    3-20-2023
    Dounguk Kim
 */
public class Chap3Program1 {
    static final double PI=3.141592;

    public static void main(String[] args){
        double radius, area, circumference;
//          Input part(UI Part)
        String radiusStr= JOptionPane.showInputDialog(null,"enter radius");
        radius=Double.parseDouble(radiusStr);

//          Compute area and circumference
        area =PI*radius*radius;
        circumference=2.0*PI*radius;

//          Output part(output UI design)
        JOptionPane.showMessageDialog(null,"given radius"+radius+"\n"+"Area:"+ area+"\n"+"circumference"+circumference);

    }
}
