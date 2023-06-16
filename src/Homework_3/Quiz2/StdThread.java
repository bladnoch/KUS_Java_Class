package Homework_3.Quiz2;

/**
 * StdThread.java
 * @author Dounguk Kim
 * @since 6/16/2023
 * @version v0.0.1
 */
public class StdThread extends Thread{

    // total gpa
    public static double sum;
    private int start;
    private int end;

    /**
     * StdThread constructor
     * @param start: start time
     * @param end: end time
     */
    public StdThread(int start, int end){
        this.start=start;
        this.end=end;
    }

    //calc seprated works
    public void run() {
        double temp=0;
        for (int i=start;i<=end;i++){
            temp+=Q2.std[i].getGrade();
        }
        sum+=temp;
    }


}
