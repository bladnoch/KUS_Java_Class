package Homework_3.Quiz1;

import Homework_3.Quiz1.Q1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Homework_3.Quiz1.Q1.STDNUM;
import static Homework_3.Quiz1.Q1.resultLabel;

public class CalculateButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        try {
            double height = Double.parseDouble(Q1.heightField.getText());
            double weight = Double.parseDouble(Q1.weightField.getText());
            double averageH=0;
            double averageW=0;
            for(int i = 0; i< STDNUM; i++){
                averageH+= Q1.tempH[i];
                averageW+= Q1.tempW[i];
            }
            averageH/=STDNUM;
            averageW/=STDNUM;
            averageH=height-averageH;
            averageW=weight-averageW;
            resultLabel.setText( String.format(
                    "Difference: Height: %.2f cm, Weight: %.2f kg",
                    averageH, averageW));

    } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(Q1.frame, "Please enter valid numbers.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
}}