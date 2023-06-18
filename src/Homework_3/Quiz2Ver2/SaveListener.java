package Homework_3.Quiz2Ver2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import static Homework_3.Quiz2Ver2.Q2Ver2.*;

public class SaveListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        String fileName = "DK_Sample.data";
        arrayedStd=new String[stdCount*3];
        int count=0;

        for(int i=0;i<arrayedStd.length;i+=3){
            arrayedStd[i]=inputStd[count].getGender();
            arrayedStd[i+1]=String.valueOf(inputStd[count].getWeight()) ;
            arrayedStd[i+2]=String.valueOf(inputStd[count].getGPA()) ;
            count+=1;
        }


        try (FileOutputStream fos = new FileOutputStream(new File(fileName));
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(arrayedStd);
            JOptionPane.showMessageDialog(frame,
                    "ArrayList saved to " + fileName, "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frame,
                    "Error saving ArrayList to " + fileName, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
