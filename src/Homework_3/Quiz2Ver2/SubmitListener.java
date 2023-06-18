package Homework_3.Quiz2Ver2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Homework_3.Quiz2Ver2.Q2Ver2.*;

public class SubmitListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        double weight=Double.parseDouble(Q2Ver2.weightInput.getText());
        double gpa=Double.parseDouble(Q2Ver2.gpaInput.getText());
        String gender;
        if (maleRadio.isSelected()) {
            gender="male  ";
        } else if (femaleRadio.isSelected()) {
            gender="female";
        } else {
            gender="unknown";
        }


        Q2Ver2.inputStd[Q2Ver2.stdCount]=new StdQ2(gender,weight,gpa);
        stdTextArea.setText("");
        stdTextArea.append("-gender-    -weight-     -GPA-\n");
        System.out.println("gender   weight    GPA");
        for(int i=0;i<Q2Ver2.stdCount;i++){
            stdTextArea.append("   "+inputStd[i].getGender()+"         "+inputStd[i].getWeight()+"             "+inputStd[i].getGPA()+"\n");
            System.out.println(inputStd[i].getGender()+"    "+inputStd[i].getWeight()+"     "+inputStd[i].getGPA());
        }

    }
}
