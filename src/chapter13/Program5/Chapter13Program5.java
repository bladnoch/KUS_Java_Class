package chapter13.Program5;

/**
 * thread 숫자에 따라 elapsed time이 어떻게 바뀌는지 확인
 * @since 5-24-2023
 * @version v0.0.1
 * @author doungukkim
 */
public class Chapter13Program5 {
    public static final int NUM_THREAD=16;
    public static final int REP_TIMES=2000000000;

    /**
     * 8개의 thread를 사용해서 프로그램을 더 짧게 만든다.
     * @throws InterruptedException
     */
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
            threads[i].join(); //병렬 컴퓨팅한 것들을 합친다.
        }
        System.out.println("Toral sum: "+SumThread.sum);
        long end=System.currentTimeMillis();

        System.out.println("Elapsed time: "+(end-start)/1000.0+"sec.");

    }
    public static void main(String[] args) throws InterruptedException{
        new Chapter13Program5();
    }

}
