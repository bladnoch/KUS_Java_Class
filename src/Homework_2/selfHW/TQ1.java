package Homework_2.selfHW;

import java.util.ArrayList;
import java.util.Random;

class Std{
    public String studentName;
    private int studentID;

}

public class TQ1 {
    public static void setName(ArrayList name,Random random, Std[] std){
        while(name.size()<10000){
            StringBuilder sb=new StringBuilder();
            int nameLen=random.nextInt(3,9);
            for(int i=0;i<nameLen;i++){
                char chr=(char)(random.nextInt(26)+'a');
                sb.append(chr);
            }
            name.add(sb.toString());
        }
        for (int i=0;i<name.size();i++){
            String ch= String.valueOf((char)(random.nextInt(26)+'A'));
            std[i].studentName=((String)ch)+name.get(i);
        }
    }
    public static void setID(){

    }
    public static void main(String[] args){
        Std[] std=new Std[10000];
        Random random=new Random();
        ArrayList<String> name=new ArrayList<>();
        int count=0;

        for (int i=0; i< 10000;i++){
            std[i]=new Std();
            std[i].studentName="";
        }
        setName(name,random,std);
        setID();

        for(int i=0;i<10000;i++){
            System.out.println(std[i].studentName);
        }


    }
}
