package Homework_3.Quiz2;

import static Homework_3.Quiz2.Q2.std;
/**
 * NoThread.java
 * @author Dounguk Kim
 * @since 6/16/2023
 * @version v0.0.1
 */
public class NoThread {
    public NoThread(){
        double factor = Math.pow(10, 1);
        double gpa=0;

        //start count
        long start=System.currentTimeMillis();

        //calc mean gpa
        for(int i=0;i<Q2.stdNum;i++){
            gpa+=std[i].getGrade();
        }
        gpa/=Q2.stdNum;
        gpa= Math.round(gpa * factor) / factor;

        //end count
        long end=System.currentTimeMillis();

        //print mean gpa on GUI
        Q2.resultLabel.setText(": "+gpa);

        //print ave GPA on prompt
        System.out.println("Average GPA(no thread) : "+gpa);
        System.out.println("Elaspsed time: "+(end-start)/1000.0+"sec.");
    }

}
