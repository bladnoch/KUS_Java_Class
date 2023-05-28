package chapter13.Practice4;

import chapter13.Practice3.Chapter13Practice3;

public class Chapter13Practice4 {
    public Chapter13Practice4(){
        long start=System.currentTimeMillis();
        long sum=0;

        for(int i=0;i<2000000000;i++){
            sum+=i;
        }
        System.out.println("total sum: "+sum);
        long end=System.currentTimeMillis();

        System.out.println("Elaspesed time "+(end-start)/1000.0+"sec.");
    }
    public static void main(String[] args){
        new Chapter13Practice4();
    }
}
