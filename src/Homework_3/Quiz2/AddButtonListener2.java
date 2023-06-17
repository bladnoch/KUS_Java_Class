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
    public void actionPerformed(ActionEvent event) {
        textArea.setText("");

        //list of student info
        textArea.append("Gender      Weight      Grade\n");

        //print student info
        for(int i=0;i<stdNum;i++){
            textArea.append(std[i].getGender() +"         "+std[i].getWeight() +"          "+std[i].getGrade()+"\n");
        }
    }

    /**
     * ForThread, NoThread classes
     * test elapsed time depends on using thread or not
     * @throws InterruptedException
     */

}
