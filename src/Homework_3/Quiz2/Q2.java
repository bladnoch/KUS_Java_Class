package Homework_3.Quiz2;


import javax.swing.*;
import java.awt.*;

/**
 * Q2.java get student info to GUI
 * @author Dounguk Kim
 * @since 6/16/2023
 * @version v0.0.1
 */
public class Q2{
    final static int APROX=100000; //Maximum of student number
    protected static Students[] std=new Students[APROX]; //list of students
    protected static int stdNum=0; //count number of saved students

    /**
     * jframe variables and constructor
     */
    protected static JFrame frame;

    /**
     * GUI checks gender by radio button of male and female
     */
    protected static JRadioButton maleRadioButton = new JRadioButton("Male");
    protected static JRadioButton femaleRadioButton = new JRadioButton("Female");
    protected static JTextField weightField;
    protected static JTextField gradeField;
    protected static JTextArea textArea;
    protected static JScrollPane scrollPane;

    /**
     * Q2 constructor
     * this contains two radio buttons, three text fields, two buttons, a textarea and scrollpane
     */
    public Q2(){
        frame = new JFrame("add new student");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 900);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

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

        /**
         * enterButton
         * save student information
         * this button is calling AddButtonListener()
         */
        JButton enterButton = new JButton("Enter");
        frame.add(enterButton);
        enterButton.addActionListener(new AddButtonListener());

        /**
         * studentButton
         * print student information
         * this button is calling AddButtonListener2()
         */
        JButton studentButton = new JButton("Print Student List");
        frame.add(studentButton);
        studentButton.addActionListener(new AddButtonListener2());

        /**
         * textArea
         * prints student info
         */
        textArea = new JTextArea();
        textArea.setEditable(false);

        scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(580, 700));
        frame.add(scrollPane, BorderLayout.CENTER);

        JButton saveButton = new JButton("Save");
        frame.add(saveButton);
        saveButton.addActionListener(new SaveButtonListener());

        JButton loadButton = new JButton("Load");
        frame.add(loadButton);
        loadButton.addActionListener(new LoadButtonListener());


        frame.setVisible(true);
    }
    public static void main(String[] args){
        Q2 in=new Q2();
    }
}
