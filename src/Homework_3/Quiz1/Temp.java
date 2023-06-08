package Homework_3.Quiz1;

import java.util.Random;

public class Temp {
    final static int STDS=10;
    public static void main(String[] args){
        Random ran=new Random();
        double[] b= new double[STDS];
        int all=0;

        for (int i=0;i<STDS;i++){
            b[i]=ran.nextGaussian()+173;
            System.out.println("Student #"+(i+1)+": "+b[i]);
        }
        for (int i=0;i<STDS;i++){
            all+=b[i];
        }
        System.out.println("mean of all students are "+(all/STDS));
    }
}
