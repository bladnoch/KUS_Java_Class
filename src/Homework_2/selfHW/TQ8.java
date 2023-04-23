package Homework_2.selfHW;

import java.util.*;

public class TQ8 {
    public static void setDic(Map dic){
        dic.put("A","가");
        dic.put("B","나");
        dic.put("C","다");
        dic.put("D","라");
        dic.put("E","마");
        dic.put("F","바");
        dic.put("G","사");
        dic.put("H","아");
        dic.put("I","자");
        dic.put("J","차");

    }
    public static void translate(Map dic){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] array=input.split(" ");

//        System.out.println(array[1]);
        System.out.print("output: ");
        for (int i=0;i<dic.size();i++){
            if (dic.containsKey(array[i])){
                System.out.print(dic.get(array[i])+" ");
            }
            else{
                System.out.print("don't know ");
            }
        }

    }
    public static void main(String[] args){
        Map dic=new TreeMap();
        setDic(dic);
        Scanner sc=new Scanner(System.in);


        System.out.print("input: ");
        translate(dic);


    }




}
