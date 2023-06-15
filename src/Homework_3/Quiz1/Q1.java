package Homework_3.Quiz1;

import javax.swing.*;
import java.awt.*;

/**
 * Q1.java
 * @author DoungukKim
 * @since 6/4/2023
 * @version v0.0.1
 */
public class Q1 extends SimpleStatistics {
    final static int STDNUM=10000; //student number
    private static int males=0; //later it counts males
    private static int females=0; //later it counts females
    private static Student[] temp=new Student[STDNUM]; //list of students
    protected static double[] tempH=new double[STDNUM]; //list of heights
    protected static double[] tempW=new double[STDNUM]; //list of weights

    /**
     * constructor and variables of JFrame
     */
    protected static JFrame frame;
    protected static JTextField heightField; //input height
    protected static JTextField weightField; //input weight
    protected static JLabel resultLabel; //prints result on JFrame

    /**
     * Q1() constructor
     * JFrame that uses CalculateButtonListener.java
     */
    public Q1(){
        frame = new JFrame("Height and Weight Difference Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        //text field of height
        frame.add(new JLabel("Your Height (cm):"));
        heightField = new JTextField(5);
        frame.add(heightField);

        //text field of weight
        frame.add(new JLabel("Your Weight (kg):"));
        weightField = new JTextField(5);
        frame.add(weightField);

        //button that calculates inputs of height, and weight
        JButton calculateButton = new JButton("Calculate");
        frame.add(calculateButton);
        calculateButton.addActionListener(new CalculateButtonListener());

        //label that prints out the result of height, and weight difference.
        resultLabel = new JLabel("Difference: ");
        frame.add(resultLabel);

        frame.setVisible(true);
    }




    public static void main(String[] args){
        //creat STDNUM number of students
        for(int i=0;i<STDNUM;i++){
            temp[i]=new Student();
            //comments below are for testing students' information
//            System.out.println(temp[i].getStudentID()+" : "+(temp[i].isMale()? "male":"female"));
//            System.out.println("height: "+temp[i].getHeight()+"\nweight: "+temp[i].getWeight()+"\n");
        }
        genCount(); //setting up all variables of the abstract method's parameter
        Q1 in=new Q1();

        //five print lines are test comments of print out all abstract method's results
        System.out.println("\nmean of height, and weight : "+in.getMean(tempH)+", "+in.getMean(tempW));
        System.out.println("max of height, and weight : "+in.getMax(tempH)+", "+in.getMax(tempW));
        System.out.println("min of height, and weight : "+in.getMin(tempH)+", "+in.getMin(tempW));
        System.out.println("\nmean of male height and weight : "+in.getConditionalMean("male",tempH)+", "+in.getConditionalMean("male",tempW));
        System.out.println("mean of female height and weight : "+in.getConditionalMean("female",tempH)+", "+in.getConditionalMean("female",tempW));

    }

    /**
     * setting up the variables for abstract methods
     * count num of male, female
     * make list of height, weight
     */
    public static void genCount(){
        for(int i=0;i<STDNUM;i++){
            if (temp[i].isMale()) {
                males++; //count male
            } else {
                females++; //count female
            }
            tempH[i]=temp[i].getHeight(); //list of height
            tempW[i]=temp[i].getWeight(); //list of weight
        }
        //test comment of checking number of males and females
//        System.out.println("num of male : "+males+"\nnum of female : "+females);
    }

    /**
     * getMean() method
     * @param variable: one-dimentional numeric vector such as Height and weight
     * @return mean of variable
     */
    @Override
    public double getMean(double[] variable) {
        double forReturn=0;
        for (int i=0;i<STDNUM;i++){
            forReturn+=variable[i];
        }
        return forReturn/STDNUM;
    }

    /**
     * getConditionalMean() method
     * @param condition: given condition(i.e sex: female and male respectively)
     * @param variable: one-dimentional numeric vector such as Height and weight
     * @return mean of variable depends on condition
     */
    @Override
    public double getConditionalMean(String condition, double[] variable) {
        double addAll=0;
        for (int i=0;i<STDNUM;i++){
            if(condition.equals("male") && temp[i].isMale()){
                addAll+=variable[i];
            }
            else if(condition.equals("female")&& !temp[i].isMale()){
                addAll+=variable[i];

            }
        }
        addAll=condition.equals("male")?addAll/males:addAll/females;
        return addAll;
    }


    /**
     * getMax() method
     * @param variable: one-dimentional numeric vector such as Height and weight
     * @return maximum value of input variable
     */
    @Override
    public double getMax(double[] variable) {
        double forReturn=variable[0];
        for (int i=0;i<STDNUM;i++){
            forReturn= Math.max(variable[i], forReturn);
        }
        return forReturn;
    }

    /**
     * getMin() method
     * @param variable: one-dimentional numeric vector such as Height and weight
     * @return minimum value of input variable
     */
    @Override
    public double getMin(double[] variable) {
        double forReturn=variable[0];
        for (int i=0;i<STDNUM;i++){
            forReturn= Math.min(variable[i], forReturn);
        }
        return forReturn;    }
}
