package Homework_3.Quiz2Ver2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Homework_3.Quiz2Ver2.Q2Ver2.*;

public class SubmitListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        boolean shouldOVer=false;
        double weight=0;
        double gpa=0;

        try {
            weight = Double.parseDouble(Q2Ver2.weightInput.getText());
            gpa = Double.parseDouble(Q2Ver2.gpaInput.getText());

            if (gpa >= 0 && gpa <= 4.5 && weight >= 40 && weight <= 140) {
                weight=Double.parseDouble(Q2Ver2.weightInput.getText());
                gpa=Double.parseDouble(Q2Ver2.gpaInput.getText());
            } else {
                JOptionPane.showMessageDialog(frame, "두 입력란 모두 유효한 범위에서 값을 입력해야 합니다.", "잘못된 값", JOptionPane.ERROR_MESSAGE);
                shouldOVer=true;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "유효한 숫자를 두 입력란에 모두 입력해야 합니다.", "잘못된 값", JOptionPane.ERROR_MESSAGE);
            shouldOVer=true;
        }


        if(!shouldOVer){
            String gender;
            if (maleRadio.isSelected()) {
                gender="male  ";
            } else if (femaleRadio.isSelected()) {
                gender="female";
            } else {
                gender="unknown";
            }

            onTextArea(gender,weight,gpa);
//
//            Q2Ver2.inputStd[Q2Ver2.stdCount]=new StdQ2(gender,weight,gpa);
//            stdTextArea.setText("");
//            stdTextArea.append("-gender-    -weight-     -GPA-\n");
//            System.out.println("gender   weight    GPA");
//            for(int i=0;i<Q2Ver2.stdCount;i++){
//                stdTextArea.append("   "+inputStd[i].getGender()+"         "+inputStd[i].getWeight()+"             "+inputStd[i].getGPA()+"\n");
//                System.out.println(inputStd[i].getGender()+"    "+inputStd[i].getWeight()+"     "+inputStd[i].getGPA());
//            }
        }


    }
    public static void onTextArea(String gender, Double weight, Double gpa){
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
