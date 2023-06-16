package Homework_3.Quiz3;

import Homework_3.Quiz2.Q2;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Q3 extends Q2 {
    public static void main(String[] args){
        try {
            // "dataFile.data" 파일에 배열 값을 저장합니다.
            FileOutputStream fileOut = new FileOutputStream("backup2021270682_doungukkim.data");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            // 배열을 파일에 작성합니다.
            objectOut.writeObject(dataArray);

            // 리소스를 해제하고 파일에 변경 사항을 저장합니다.
            objectOut.close();
            fileOut.close();

            System.out.println("Data has been written to dataFile.data");
        } catch (IOException e) {
            e.printStackTrace();
        }





    }
}

