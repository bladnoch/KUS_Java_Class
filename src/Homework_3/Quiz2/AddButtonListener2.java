package Homework_3.Quiz2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import static Homework_3.Quiz2.Q2.*;

public class AddButtonListener2 implements ActionListener {
    public void actionPerformed(ActionEvent event){
        textArea.setText("");
        textArea.append("Gender      Weight      Grade\n");
        for(int i=0;i<stdNum;i++){
            textArea.append(std[i].getGender() +"         "+std[i].getWeight() +"          "+std[i].getGrade()+"\n");

        }

    }
}
