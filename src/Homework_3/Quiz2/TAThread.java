package Homework_3.Quiz2;

import static Homework_3.Quiz2.Q2.std;
import static Homework_3.Quiz2.Q2.textArea;

/**
 * TAThread.java
 * @author Dounguk Kim
 * @since 6/17/2023
 * @version v0.0.1
 */
public class TAThread extends Thread {

    private int start;
    private int end;
    private static String temp="";

    /**
     * StdThread constructor
     * @param start: start time
     * @param end: end time
     */
    public TAThread(int start, int end){
        this.start=start;
        this.end=end;
    }

    //calc seprated works
    public void run() {
        for (int i=start;i<=end;i++){
            temp="\n"+std[i].getGender() +"         "+std[i].getWeight() +"          "+std[i].getGrade();
            textArea.append(temp);
        }
    }
}
