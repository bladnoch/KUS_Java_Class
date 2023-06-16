package Homework_3.Quiz2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import static Homework_3.Quiz2.Q2.stdNum;

/**
 * LoadButtonListener.java
 * @author Dounguk Kim
 * @since 6/16/2023
 * @version v0.0.1
 */
public class LoadButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event){
        // new variable for get saved values
        Object loadedData = null;

        try {
            // load datas from "backup2021270682_doungukkim.data"
            FileInputStream fileIn = new FileInputStream("backup2021270682_doungukkim.data");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            // read data and save in loadedData variable
            loadedData = objectIn.readObject();

            objectIn.close();
            fileIn.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // print loaded data on prompt.
        if (loadedData != null) {
            System.out.println("Data has been read from backup2021270682_doungukkim.data");

            // test code for check loaded values in prompt
//            System.out.println("Loaded data: " + Arrays.toString((String[]) loadedData));
        } else {
            System.out.println("Failed to read data from backup2021270682_doungukkim.data");
        }
        // save loadedData's values in loadedArray
        String[] loadedArray = (String[]) loadedData;

        // save loadedArray's values in std
        for(int i=0;i<((String[]) loadedData).length;i+=3){
            Q2.std[stdNum]=new Students(loadedArray[i],Double.parseDouble(loadedArray[i+1]),Double.parseDouble(loadedArray[i+2]));
            stdNum++;
        }
    }
}


