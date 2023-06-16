package Homework_3.Quiz2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import static Homework_3.Quiz2.Q2.std;
import static Homework_3.Quiz2.Q2.stdNum;

public class gpaButtonListener implements ActionListener {
    double temp=0;
    public void actionPerformed(ActionEvent event){

        //calulate average GPA of all students
        double factor = Math.pow(10, 1);

        for (int i=0;i<stdNum;i++){
            temp+=std[i].getGrade();
        }
        temp/=stdNum;
        temp= Math.round(temp * factor) / factor;

        // print average gpa on GUI
        Q2.resultLabel.setText(" : "+temp);
        System.out.println("Average GPA : "+temp);
    }
}
