package Homework_3.Quiz2Ver2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import static Homework_3.Quiz2Ver2.Q2Ver2.*;
import static Homework_3.Quiz2Ver2.SubmitListener.onTextArea;

public class LoadListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        String fileName = "DK_Sample.data";


        try (FileInputStream fis = new FileInputStream(new File(fileName));
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Q2Ver2.arrayedStd = (String[]) ois.readObject();

            int count=0;

            for(int i=0;i<arrayedStd.length;i+=3){
                inputStd[count]=new StdQ2(arrayedStd[i],Double.parseDouble(arrayedStd[i+1]),Double.parseDouble(arrayedStd[i+2]));

                count++;
            }
            //textarea에 추가
            stdTextArea.setText("");
            stdTextArea.append("-gender-    -weight-     -GPA-\n");
            System.out.println("gender   weight    GPA");
            Q2Ver2.stdCount=count;
            for(int i=0;i<count;i++){
                stdTextArea.append("   "+inputStd[i].getGender()+"         "+inputStd[i].getWeight()+"             "+inputStd[i].getGPA()+"\n");
                System.out.println(inputStd[i].getGender()+"    "+inputStd[i].getWeight()+"     "+inputStd[i].getGPA());
            }

            String arrayElements = String.join(", ", Q2Ver2.arrayedStd);
            JOptionPane.showMessageDialog(frame,
                    "Array Loaded: [" + arrayElements + "]", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(frame,
                    "Error loading Array from " + fileName, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
