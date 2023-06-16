package Homework_3.Quiz2;

import Homework_3.Quiz1.Q1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Homework_3.Quiz2.Q2.std;
import static Homework_3.Quiz2.Q2.stdNum;

public class AddButtonListener implements ActionListener {

    public void actionPerformed(ActionEvent event){
        try{
            String gender=Q2.genderField.getText();
            double weight=Double.parseDouble(Q2.weightField.getText());
            double grade=Double.parseDouble(Q2.gradeField.getText());

            Q2.std[stdNum]=new Students(gender,weight,grade);
            System.out.println(Q2.std[stdNum].getGender());
            System.out.println(Q2.std[stdNum].getWeight());
            System.out.println(Q2.std[stdNum].getGrade());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(Q2.frame, "Please enter valid numbers.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }

    }
}
