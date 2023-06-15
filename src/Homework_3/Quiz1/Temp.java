package Homework_3.Quiz1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temp {
    private JFrame frame;
    private JTextField textField;
    private JButton button;

    public Temp() {
        frame = new JFrame("Single Frame Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(new JLabel("Enter your name:"));
        textField = new JTextField(10);
        inputPanel.add(textField);

        button = new JButton("Submit");
        inputPanel.add(button);
        button.addActionListener(new ButtonListener());

        JPanel resultPanel = new JPanel();
        resultPanel.add(new JLabel("Hello, "));

        JTextField resultField = new JTextField(10);
        resultField.setEditable(false);
        resultPanel.add(resultField);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(resultPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = textField.getText();
            if (!name.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
            } else {
                JOptionPane.showMessageDialog(frame, "Please enter your name.", "Empty name", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Temp();
            }
        });
    }
}
