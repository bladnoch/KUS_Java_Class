package Homework_3.Quiz1V2;

import Homework_3.Quiz1.Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2V2 extends SimpleStatistics{
    protected final static int ALL=10000;
    protected static Std[] student=new Std[ALL];
    protected static double[] arrayHeight=new double[ALL];
    protected static double[] arrayWeight=new double[ALL];
    protected static int man=0;
    protected static int woman=0;
    private static Q2V2 in;


    private JFrame frame;
    private JTextField heightInput;
    private JTextField weightInput;
    private JTextArea resultTextArea;
    public Q2V2() {
        frame = new JFrame("Data Comparison");
        frame.setBounds(100, 100, 400, 260);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Height input
        JLabel heightLabel = new JLabel("Height (cm):");
        heightLabel.setBounds(20, 20, 100, 20);
        frame.getContentPane().add(heightLabel);

        heightInput = new JTextField();
        heightInput.setBounds(120, 20, 100, 20);
        frame.getContentPane().add(heightInput);

        // Weight input
        JLabel weightLabel = new JLabel("Weight (kg):");
        weightLabel.setBounds(220, 20, 100, 20);
        frame.getContentPane().add(weightLabel);

        weightInput = new JTextField();
        weightInput.setBounds(320, 20, 100, 20);
        frame.getContentPane().add(weightInput);

        // Button
        JButton compareButton = new JButton("Compare");
        compareButton.setBounds(120, 70, 200, 30);
        compareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double height = Double.parseDouble(heightInput.getText());
                double weight = Double.parseDouble(weightInput.getText());
                double avgHeight = in.getMean(arrayHeight); // Replace with actual calculated average height of 10,000 people
                double avgWeight = in.getMean(arrayWeight); // Replace with actual calculated average weight of 10,000 people

                double heightDiff = height - avgHeight;
                double weightDiff = weight - avgWeight;

                resultTextArea.setText("Height difference: " + heightDiff + " cm\nWeight difference: " + weightDiff + " kg");
            }
        });

        frame.getContentPane().add(compareButton);

        // Result text area
        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);
        resultTextArea.setBounds(50, 130, 300, 50);
        frame.getContentPane().add(resultTextArea);
        frame.setVisible(true);
    }


    public static void main(String[] args){
        Q2V2.in=new Q2V2();

        for (int i=0;i<student.length;i++){
            student[i]=new Std();
//            System.out.println(student[i].getStudentID()+" : "+student[i].getGender());
//            System.out.println("height : "+student[i].getHeight()+"  weight : "+student[i].getWeight());
        }
        condition();
        System.out.println("getMean : "+in.getMean(arrayHeight)+"  "+in.getMean(arrayWeight));
        System.out.println("getMin : "+in.getMin(arrayHeight)+"  "+in.getMin(arrayWeight));
        System.out.println("getMax : "+in.getMax(arrayHeight)+"  "+in.getMax(arrayHeight));
        System.out.println("getConditional : \nmale : "+in.getConditionalMean("male",arrayHeight)+"   "+in.getConditionalMean("male",arrayWeight));
        System.out.println("getConditional : \nfemale : "+in.getConditionalMean("female",arrayHeight)+"   "+in.getConditionalMean("female",arrayWeight));
    }

    /**
     * getMean() method
     * @param variable: one-dimentional numeric vector such as Height and weight
     * @return mean of variable
     */
    public double getMean(double[] variable) {
        double sum = 0;
        for (int i = 0; i < ALL; i++) {
            sum += variable[i];
        }
        return sum / ALL;
    }


    /**
     * getConditionalMean() method
     * @param condition: given condition(i.e sex: female and male respectively)
     * @param variable: one-dimentional numeric vector such as Height and weight
     * @return mean of variable depends on condition
     */
    public double getConditionalMean(String condition, double[] variable) {
        double temp=0;
        double temp2=0;
        int count=0;
        int count2=0;

        for(int i=0;i<ALL;i++){

            if(student[i].getGender().equals("male")){
                temp+=variable[i];
                count++;
            }
            else{
                temp2+=variable[i];
                count2++;
            }
        }
        temp/=count;
        temp2/=count;

        if(condition.equals("female")){
            temp=temp2;
        }
        return temp;
    }

    public static void condition(){
        for(int i=0;i<ALL;i++){
            arrayHeight[i]=student[i].getHeight();
            arrayWeight[i]=student[i].getWeight();
        }

    }

    /**
     * getMax() method
     * @param variable: one-dimentional numeric vector such as Height and weight
     * @return maximum value of input variable
     */
    public double getMax(double[] variable) {
        double maxVal = variable[0];
        int length = variable.length;

        for (int i = 1; i < length; i++) {
            if (variable[i] > maxVal) {
                maxVal = variable[i];
            }
        }

        return maxVal;
    }

    /**
     * getMin() method
     * @param variable: one-dimentional numeric vector such as Height and weight
     * @return minimum value of input variable
     */
    public double getMin(double[] variable) {
        double minVal = variable[0];
        int length = variable.length;

        for (int i = 1; i < length; i++) {
            if (variable[i] < minVal) {
                minVal = variable[i];
            }
        }

        return minVal;
    }
}
