package Homework_3.Quiz2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import static Homework_3.Quiz2.Q2.std;
import static Homework_3.Quiz2.Q2.stdNum;

/**
 * SaveButtonListener.java
 * @author Dounguk Kim
 * @since 6/16/2023
 * @version v0.0.1
 */
public class SaveButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event){
        /**
         * creat String list for save student information
         * save std values on info[]
         */
        String[] info=new String[stdNum*3];
        int count=0; //variable for count std list

        for(int i=0;i<stdNum*3;i+=3){
            info[i]=std[count].getGender();
            info[i+1]=String.valueOf( std[count].getWeight());
            info[i+2]=String.valueOf(std[count].getGrade());
            count++;
        }
        // test code for check values of info[]
//        System.out.println("------");
//        for(int i=0;i<info.length;i++){
//            System.out.println(info[i]+" ");
//        }

        try {
            // save values of array in "backup2021270682_doungukkim.data"
            FileOutputStream fileOut = new FileOutputStream("backup2021270682_doungukkim.data");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            // save value in the file
            objectOut.writeObject(info);

            // save the changes of file
            objectOut.close();
            fileOut.close();

            System.out.println("Data has been written to backup2021270682_doungukkim.data");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
