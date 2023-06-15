package Homework_3.Temp;

abstract class SimpleStatistics {
    public abstract double getMean(double[] variable);
    public abstract double getConditionalMean(String condition, double[] variable);
    public abstract double getMax(double[] variable);
    public abstract double getMin(double[] variable);
}
