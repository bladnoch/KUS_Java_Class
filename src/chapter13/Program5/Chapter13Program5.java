package chapter13.Program5;

public class Chapter13Program5 {
    public static final int NUM_THREAD=8;
    public static final int REP_TIMES=2000000000;

    public Chapter13Program5() throws InterruptedException{
        long start =System.currentTimeMillis();
        SumThread.sum=0;

        SumThread[] threads=new SumThread[NUM_THREAD];

        for (int i=0;i<threads.length;i++){
            threads[i]=new SumThread(i*(REP_TIMES/NUM_THREAD),
                    (i+1)*(REP_TIMES/NUM_THREAD)-1);
            threads[i].start();
        }
        for(int i=0;i<threads.length;i++){
            threads[i].join();
        }
        System.out.println("Toral sum: "+SumThread.sum);
        long end=System.currentTimeMillis();

        System.out.println("Elapsed time: "+(end-start)/1000.0+"sec.");

    }
    public static void main(String[] args) throws InterruptedException{
        new Chapter13Program5();
    }

}
