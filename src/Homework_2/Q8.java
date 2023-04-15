package Homework_2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Q8.java
 * make translater that translate English to Korean
 * @since 2023-4-13
 * @author Dounguk kim
 */

public class Q8 {
    /**
     * save words in Map dic
     * Map dic에 단어들을 저장
     * @param dic
     */
    public static void setDictionary(Map dic){
        dic.put("culture","문화");
        dic.put("experience","경험");
        dic.put("education","교육");
        dic.put("effect","영향");
        dic.put("symbol","상징");
        dic.put("liberty","자유");
        dic.put("comfort","안락");
        dic.put("tradition","전통");
        dic.put("subject","학과");
        dic.put("source","출처");
        dic.put("is","는");
    }

    /**
     * start translate get input and print output
     * 번역을 시작합니다. 인풋을 받고 아웃풋을 출력해준다.
     * @param dic
     */
    public static void search(Map dic){
        Scanner sc=new Scanner(System.in);
        String[] word;

        System.out.println(dic.keySet());
        System.out.print("input: ");

        word=sc.nextLine().split(" "); //get input, and split sentence to words

        System.out.print("output: ");
        for (int i=0;i<word.length;i++){    //print translated words
            if(dic.containsKey(word[i])){
                System.out.print(dic.get(word[i])+" ");
            }
            else{
                System.out.print("(I don't know) ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Map dictionary=new TreeMap();
        setDictionary(dictionary);
        search(dictionary);
    }
}
