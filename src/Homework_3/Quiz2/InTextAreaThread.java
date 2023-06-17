package Homework_3.Quiz2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static Homework_3.Quiz2.Q2.textArea;

public class InTextAreaThread {

    public static final int NUM_THREAD=1;
    protected static int count=0;


    /**
     * InTextAreaThread.java
     * @author Dounguk Kim
     * @since 6/17/2023
     * @version v0.0.1
     */
    public InTextAreaThread() throws InterruptedException{

        TAThread[] threads=new TAThread[NUM_THREAD];
        ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREAD);



        //list of items
        textArea.append("Gender      Weight      Grade\n");

        //separate works by number of threads
        for (int i=0;i<threads.length;i++){
            threads[i]=new TAThread(i*(Q2.stdNum/NUM_THREAD), (i+1)*(Q2.stdNum/NUM_THREAD)-1);
//            threads[i].sleep(100+i);
            threads[i].start();
        }



    }

}
