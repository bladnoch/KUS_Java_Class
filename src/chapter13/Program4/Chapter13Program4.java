package chapter13.Program4;

import chapter13.Program3.Chapter13Program3;

/**
 * 프로그램 시작 끝까지의 시간을 확인하는 프로그램
 * @since 5-24-2023
 * @version v0.0.1
 * @author Dounguk Kim
 */

public class Chapter13Program4 {
    public Chapter13Program4(){
        long start=System.currentTimeMillis();
        long sum=0;

        for(int i=0;i<2000000000;i++){
            sum+=i;
        }
        System.out.println("Totol sum: "+ sum);
        long end=System.currentTimeMillis();

        System.out.println("Elaspsed time: "+(end-start)/1000.0+"sec.");


    }
    public static void main(String[] args){
        new Chapter13Program4();
    }
}
