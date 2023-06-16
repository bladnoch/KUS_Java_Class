package Homework_3.Quiz2;


import javax.swing.*;
import java.awt.*;

public class Q2{
    final static int APROX=100000;
    protected static Students[] std=new Students[APROX];
    protected static int stdNum=0;

    protected static JFrame frame;
    protected static JRadioButton maleRadioButton = new JRadioButton("Male");
    protected static JRadioButton femaleRadioButton = new JRadioButton("Female");
    protected static JTextField weightField;
    protected static JTextField gradeField;
    protected static JLabel resultLabel; //prints result on JFrame
    public Q2(){
        frame = new JFrame("add new student");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridLayout(4,1));



        ButtonGroup genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(maleRadioButton);
        genderButtonGroup.add(femaleRadioButton);

        frame.add(maleRadioButton);
        frame.add(femaleRadioButton);

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
