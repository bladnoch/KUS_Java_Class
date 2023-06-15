package Homework_3.Temp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        try {
            double height = Double.parseDouble(heightField.getText());
            double weight = Double.parseDouble(weightField.getText());
            double heightDifference = height - averageHeight;
            double weightDifference = weight - averageWeight;
    } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(Q11.frame, "Please enter valid numbers.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
}