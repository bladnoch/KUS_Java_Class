package Homework_3.Quiz2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static Homework_3.Quiz2.Q2.stdNum;

public class AddButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event){
        try{
            /**
             * save gender in gender variable
             * it has three options
             * male/female/no selection
             */
            String gender;
            if (Q2.maleRadioButton.isSelected()) {
                gender="male";
            } else if (Q2.femaleRadioButton.isSelected()) {
                gender="female";
            } else {
                gender="no selection";
            }
            double weight=Double.parseDouble(Q2.weightField.getText());

            /**
             * this code checks that input number is in between 0.0 to 4.5
             * if true save the value in grade variable
             */
            while (Double.parseDouble(Q2.gradeField.getText()) < 0.0 || Double.parseDouble(Q2.gradeField.getText()) > 4.5) {
                if (Double.parseDouble(Q2.gradeField.getText()) < 0.0 || Double.parseDouble(Q2.gradeField.getText()) > 4.5) {
                    Q2.gradeField.setText("");
                }
            }
            double grade=Double.parseDouble(Q2.gradeField.getText());

            //call Studends class to save items
            Q2.std[stdNum]=new Students(gender,weight,grade);

            //test code for check saved items
            System.out.println(Q2.std[stdNum].getGender());
            System.out.println(Q2.std[stdNum].getWeight());
            System.out.println(Q2.std[stdNum].getGrade());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(Q2.frame, "Please enter valid numbers.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            stdNum--;
        }
        stdNum++;
    }
}
