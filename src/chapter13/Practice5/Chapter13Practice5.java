package chapter13.Practice5;

//import chapter13.Program5.SThread;


import chapter13.Program5.Chapter13Program5;

public class Chapter13Practice5 {
    public static final int NUM_THREAD=4;
    public static final int REP_TIMES=2000000000;

    public Chapter13Practice5() throws InterruptedException{
        long start =System.currentTimeMillis();
        SThread.sum=0;

        SThread[] threads=new SThread[NUM_THREAD];

        for (int i=0;i<threads.length;i++){
            threads[i]=new SThread(i*(REP_TIMES/NUM_THREAD),(i+1)*(REP_TIMES/NUM_THREAD)-1);
            threads[i].start();
        }
        for (int i=0;i<threads.length;i++){
            threads[i].join();
        }
        System.out.println("Total sum: "+ SThread.sum);
        long end=System.currentTimeMillis();

        System.out.println("Elapsed times: "+(end-start)/1000.0+"sec");

    }

    public static void main(String[] args) throws InterruptedException{
        new Chapter13Practice5();
        new Chapter13Program5();
    }
}
