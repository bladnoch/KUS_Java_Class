package Homework_3.Quiz2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class SaveButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event){
        try {
            // "dataFile.data" 파일에 배열 값을 저장합니다.
            FileOutputStream fileOut = new FileOutputStream("backup2021270682_doungukkim.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            // 배열을 파일에 작성합니다.
            objectOut.writeObject(std);

            // 리소스를 해제하고 파일에 변경 사항을 저장합니다.
            objectOut.close();
            fileOut.close();

            System.out.println("Data has been written to dataFile.data");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
