package Homework_3.Quiz2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Homework_3.Quiz2.Q2.*;

/**
 * AddButtonListener2.java print student info on GUI
 * @author Dounguk Kim
 * @since 6/16/2023
 * @version v0.0.1
 */
public class AddButtonListener2 implements ActionListener {
    public void actionPerformed(ActionEvent event){
        textArea.setText("");

        //list of student info
        textArea.append("Gender      Weight      Grade\n");

        //prints students' info on textArea, and gives average GPA
        double factor = Math.pow(10, 1);
        double gpa=0;

        for(int i=0;i<stdNum;i++){
            textArea.append(std[i].getGender() +"         "+std[i].getWeight() +"          "+std[i].getGrade()+"\n");
            gpa+=std[i].getGrade();
        }
        gpa/=stdNum;
        gpa= Math.round(gpa * factor) / factor;

        // print average gpa on GUI
        Q2.resultLabel.setText(": "+gpa);

        //print ave GPA on prompt
        System.out.println("Average GPA : "+gpa);
    }
}
