package Homework_3.Quiz2;

/**
 * ForThread.java
 * using thread to get mean GPA
 * @author Dounguk Kim
 * @since 6/16/2023
 * @version v0.0.1
 */
public class ForThread {

    //number of threads
    public static final int NUM_THREAD=8;
    public ForThread() throws InterruptedException{
        double factor = Math.pow(10, 1);

        //gpa
        double total;

        StdThread.sum=0;

        //creat thread
        StdThread[] threads=new StdThread[NUM_THREAD];

        //start count
        long start =System.currentTimeMillis();

        //separate works by number of threads
        for (int i=0;i<threads.length;i++){
            threads[i]=new StdThread(i*(Q2.stdNum/NUM_THREAD), (i+1)*(Q2.stdNum/NUM_THREAD)-1);
            threads[i].start();
        }

        //join all seperated parts.
        for(int i=0;i<threads.length;i++){
            threads[i].join();
        }

        total=StdThread.sum/Q2.stdNum;
        total=Math.round(total * factor) / factor;

        //print GPA
        System.out.println("Average GPA (Thread) : "+ total);

        // end count
        long end=System.currentTimeMillis();

        // total time to calc
        System.out.println("Elapsed time: "+(end-start)/1000.0+"sec.");

    }
    public static void main(String[] args) throws InterruptedException{
        new ForThread();
    }

}

