package Homework_3.Quiz2Ver2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2Ver2 {
    protected static StdQ2[] inputStd=new StdQ2[1000000];
    protected static int stdCount=0;
    private JFrame frame;

    protected static JRadioButton maleRadio;
    protected static JRadioButton femaleRadio;
    protected static JTextField weightInput;
    protected static JTextField gpaInput;
    protected static  JTextArea stdTextArea;
    public Q2Ver2(){
        frame = new JFrame("Data Comparison");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        JPanel panel = new JPanel(new FlowLayout());
        frame.getContentPane().add(panel);

        maleRadio = new JRadioButton("male");
        femaleRadio = new JRadioButton("female");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(maleRadio);
        buttonGroup.add(femaleRadio);

        panel.add(maleRadio);
        panel.add(femaleRadio);



        panel.add(new JLabel("Weight:"));
        weightInput=new JTextField(10);
        panel.add(weightInput);

        panel.add(new JLabel("GPA:"));
        gpaInput=new JTextField(10);
        panel.add(gpaInput);

        panel.add(maleRadio);
        panel.add(femaleRadio);

        JButton compareBtn=new JButton("Submit");
        panel.add(compareBtn);
        compareBtn.addActionListener(new SubmitListener());

        stdTextArea = new JTextArea(30,48);
//        JScrollPane scrollPane = new JScrollPane(stdTextArea);
        panel.add(stdTextArea);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        Q2Ver2 in=new Q2Ver2();
    }
}
