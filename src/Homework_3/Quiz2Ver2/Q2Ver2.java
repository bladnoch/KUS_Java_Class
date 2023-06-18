package Homework_3.Quiz2Ver2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2Ver2 {
    protected StdQ2[] inputStd=new StdQ2[1000000];
    private JFrame frame;

    private JRadioButton maleRadio;
    private JRadioButton femaleRadio;
    private JTextField weightInput;
    private JTextField gpaInput;
    public Q2Ver2(){
        frame = new JFrame("Data Comparison");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        JPanel panel = new JPanel(new FlowLayout());
        frame.getContentPane().add(panel);

        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(maleButton);
        buttonGroup.add(femaleButton);

        panel.add(maleButton);
        panel.add(femaleButton);

        panel.add(new JLabel("Label 2:"));
        panel.add(new JTextField(10));

        panel.add(new JLabel("Label 3:"));
        panel.add(new JTextField(10));

        panel.add(maleButton);
        panel.add(femaleButton);

        JButton compareBtn=new JButton("Submit");
        panel.add(compareBtn);
        compareBtn.addActionListener(new SubmitListener());

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        Q2Ver2 in=new Q2Ver2();
    }
}
