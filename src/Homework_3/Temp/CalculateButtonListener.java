package Homework_3.Temp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Homework_3.Temp.Q11.STDNUM;
import static Homework_3.Temp.Q11.resultLabel;

public class CalculateButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        try {
            double height = Double.parseDouble(Q11.heightField.getText());
            double weight = Double.parseDouble(Q11.weightField.getText());
            double averageH=0;
            double averageW=0;
            for(int i = 0; i< STDNUM; i++){
                averageH+=Q11.tempH[i];
                averageW+=Q11.tempW[i];
            }
            averageH/=STDNUM;
            averageW/=STDNUM;
            averageH=height-averageH;
            averageW=weight-averageW;
            resultLabel.setText( String.format(
                    "Difference: Height: %.2f cm, Weight: %.2f kg",
                    averageH, averageW));

    } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(Q11.frame, "Please enter valid numbers.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
}}