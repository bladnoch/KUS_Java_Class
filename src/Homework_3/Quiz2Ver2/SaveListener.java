package Homework_3.Quiz2Ver2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import static Homework_3.Quiz2Ver2.Q2Ver2.frame;

public class saveListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        String fileName = "DK_Sample.data";

        try (FileOutputStream fos = new FileOutputStream(new File(fileName));
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(arrayList);
            JOptionPane.showMessageDialog(frame,
                    "ArrayList saved to " + fileName, "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frame,
                    "Error saving ArrayList to " + fileName, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
