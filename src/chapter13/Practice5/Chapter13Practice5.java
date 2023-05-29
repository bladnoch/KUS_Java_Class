package chapter13.Practice5;

import chapter13.Practice3.Chapter13Practice3;
import chapter13.Program5.SumThread;

public class Chapter13Practice5 {
    public static final int NUM_THREAD=4;
    public static final int REP_TIMES=2000000000;

    public Chapter13Practice5() throws InterruptedException{
        long start =System.currentTimeMillis();
        SumThread.sum=0;

        SumThread[] threads=new SumThread[NUM_THREAD];

    }

    public static void main(String[] args){
        new Chapter13Practice5();
    }
}
