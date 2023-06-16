package Homework_3.Quiz2;

import Homework_3.Quiz1.CalculateButtonListener;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Q2{
    final static int APROX=10000;
    protected static Students[] std=new Students[APROX];
    protected static int stdNum=0;

    protected static JFrame frame;
    protected static JTextField genderField;
    protected static JTextField weightField;
    protected static JTextField gradeField;
    protected static JLabel resultLabel; //prints result on JFrame
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

        JButton enterButton = new JButton("Enter");
        frame.add(enterButton);
        enterButton.addActionListener(new AddButtonListener());


        frame.setVisible(true);
    }
    public static void main(String[] args){
        Q2 in=new Q2();




    }
}
