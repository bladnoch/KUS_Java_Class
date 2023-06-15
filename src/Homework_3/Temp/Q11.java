package Homework_3.Temp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class Q11 extends SimpleStatistics {
    final static int STDNUM=10000; //student number
    private static int males=0;
    private static int females=0;
    private static Students[] temp=new Students[STDNUM];
    protected static double[] tempH=new double[STDNUM];
    protected static double[] tempW=new double[STDNUM];

    /**
     * constructor and variables of JFrame
      */
    protected static JFrame frame;
    protected static JTextField heightField;
    protected static JTextField weightField;
    protected static JLabel resultLabel;
    public Q11(){
        frame = new JFrame("Height and Weight Difference Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        frame.add(new JLabel("Your Height (cm):"));
        heightField = new JTextField(5);
        frame.add(heightField);

        frame.add(new JLabel("Your Weight (kg):"));
        weightField = new JTextField(5);
        frame.add(weightField);

        JButton calculateButton = new JButton("Calculate");
        frame.add(calculateButton);
        calculateButton.addActionListener(new CalculateButtonListener());

        resultLabel = new JLabel("Difference: ");
        frame.add(resultLabel);

        frame.setVisible(true);
    }




    public static void main(String[] args){

        /**
         * running Jframe
         */

        for(int i=0;i<STDNUM;i++){
            temp[i]=new Students();
            System.out.println(temp[i].getStudentID()+" : "+(temp[i].isMale()? "male":"female"));
            System.out.println("height: "+temp[i].getHeight()+"\nweight: "+temp[i].getWeight()+"\n");
        }
        genCount(); //setting up all variables of the abstract method's parameter
        Q11 in=new Q11();
        //print out all abstract method's results
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
                males++;
            } else {
                females++;
            }
            tempH[i]=temp[i].getHeight();
            tempW[i]=temp[i].getWeight();
        }
        System.out.println("num of male : "+males+"\nnum of female : "+females);
    }

    /**
     * @param variable
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
     * @param condition
     * @param variable
     * @return
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
     * @param variable
     * @return
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
     * @param variable
     * @return
     */
    @Override
    public double getMin(double[] variable) {
        double forReturn=variable[0];
        for (int i=0;i<STDNUM;i++){
            forReturn= Math.min(variable[i], forReturn);
        }
        return forReturn;    }
}
