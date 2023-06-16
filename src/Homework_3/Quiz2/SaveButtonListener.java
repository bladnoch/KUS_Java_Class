package Homework_3.Quiz2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import static Homework_3.Quiz2.Q2.std;
import static Homework_3.Quiz2.Q2.stdNum;


public class SaveButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event){
        String[] info=new String[stdNum*3];

        int count=0;

        for(int i=0;i<stdNum*3;i+=3){
            info[i]=std[count].getGender();
            info[i+1]=String.valueOf( std[count].getWeight());
            info[i+2]=String.valueOf(std[count].getGrade());
            count++;
        }
        System.out.println("------");
        for(int i=0;i<info.length;i++){
            System.out.println(info[i]+" ");
        }

        try {
            // "dataFile.data" 파일에 배열 값을 저장합니다.
            FileOutputStream fileOut = new FileOutputStream("backup2021270682_doungukkim.data");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            // 배열을 파일에 작성합니다.
            objectOut.writeObject(info);

            // 리소스를 해제하고 파일에 변경 사항을 저장합니다.
            objectOut.close();
            fileOut.close();

            System.out.println("Data has been written to backup2021270682_doungukkim.data");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
