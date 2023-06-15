package Homework_3.Quiz2;

import javax.swing.*;
import java.awt.*;

public class Q2{
    final static int APROX=10000;


    protected JFrame frame;
    protected JTextField genderField;
    protected JTextField weightField;
    protected JTextField gradeField;
    public Q2(){
        frame = new JFrame("add new student");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridLayout(4,1));

        frame.add(new JLabel("Gender (male/female):"));
        genderField = new JTextField(12);
        frame.add(genderField);

        frame.add(new JLabel("Weight (kg):"));
        weightField = new JTextField(12);
        frame.add(weightField);

        frame.add(new JLabel("Grade (0~4.5):"));
        gradeField = new JTextField(12);
        frame.add(gradeField);

        frame.setVisible(true);
    }
    public static void main(String[] args){
        Q2 in=new Q2();
//        Q1 temp=new Q1();

    }
}
