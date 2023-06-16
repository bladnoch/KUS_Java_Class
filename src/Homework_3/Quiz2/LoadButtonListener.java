package Homework_3.Quiz2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

import static Homework_3.Quiz2.Q2.std;
import static Homework_3.Quiz2.Q2.stdNum;


public class LoadButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event){
        // 파일을 로드할 변수 선언
        Object loadedData = null;
        int count=0;

        try {
            // "dataFile.data" 파일에서 데이터를 읽어옵니다.
            FileInputStream fileIn = new FileInputStream("backup2021270682_doungukkim.data");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            // 파일에서 데이터를 읽어와 변수에 저장합니다.
            loadedData = objectIn.readObject();

            // 파일 리소스를 해제합니다.
            objectIn.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


        // 읽어온 데이터를 출력합니다.
        if (loadedData != null) {
            System.out.println("Data has been read from backup2021270682_doungukkim.data");
            System.out.println("Loaded data: " + Arrays.toString((String[]) loadedData));
        } else {
            System.out.println("Failed to read data from backup2021270682_doungukkim.data");
        }
        String[] loadedArray = (String[]) loadedData;

        for(int i=0;i<((String[]) loadedData).length;i+=3){
            Q2.std[stdNum]=new Students(loadedArray[i],Double.parseDouble(loadedArray[i+1]),Double.parseDouble(loadedArray[i+2]));
            stdNum++;
        }


    }
}


