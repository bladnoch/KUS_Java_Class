package Homework_3.Quiz1;

/**
 * SimpleStatistics.java
 * abstract class
 * @author DoungukKim
 * @since 6/4/2023
 * @version v0.0.1
 */
abstract class SimpleStatistics {

    /**
     * getMean() method
     * @param variable: one-dimentional numeric vector such as Height and weight
     * @return mean of variable
     */
    public abstract double getMean(double[] variable);

    /**
     * getConditionalMean() method
     * @param condition: given condition(i.e sex: female and male respectively)
     * @param variable: one-dimentional numeric vector such as Height and weight
     * @return mean of variable depends on condition
     */
    public abstract double getConditionalMean(String condition, double[] variable);

    /**
     * getMax() method
     * @param variable: one-dimentional numeric vector such as Height and weight
     * @return maximum value of input variable
     */
    public abstract double getMax(double[] variable);

    /**
     * getMin() method
     * @param variable: one-dimentional numeric vector such as Height and weight
     * @return minimum value of input variable
     */
    public abstract double getMin(double[] variable);
}
