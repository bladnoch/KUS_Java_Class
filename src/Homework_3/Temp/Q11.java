package Homework_3.Temp;

import javax.swing.*;



public class Q11 extends SimpleStatistics {
    final static int STDNUM=10;
    private static int males=0;
    private static int females=0;
    private static Students[] temp=new Students[STDNUM];
    private static double[] tempH=new double[STDNUM];
    private static double[] tempW=new double[STDNUM];

    /**
     * constructor of JFrame
      */
//    private JFrame frame;
//    public Q11(){
//        frame=new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(300,300);
//        frame.setVisible(true);
//    }

    /**
     * setting up the variables for abstract methods
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


    public static void main(String[] args){

        Q11 in=new Q11();
        for(int i=0;i<10;i++){
            temp[i]=new Students();
            System.out.println(temp[i].getStudentID()+" : "+(temp[i].isMale()? "male":"female"));
            System.out.println("height: "+temp[i].getHeight()+"\nweight: "+temp[i].getWeight());

        }
        genCount(); //setting up all variables of the abstract method's parameter
        System.out.println("\nmean of height, and weight : "+in.getMean(tempH)+", "+in.getMean(tempW));
        System.out.println("max of height, and weight : "+in.getMax(tempH)+", "+in.getMax(tempW));

        /**
         * to running Jframe
         */
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                new Q11();
//            }
//        });
    }

    /**
     * @param variable
     * @return
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
        return 0;
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
