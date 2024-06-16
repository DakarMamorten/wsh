package edu.wsh.thirdyear.lab7.zad3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zad3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Zadanie 3");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Pokaż tekst");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                JOptionPane.showMessageDialog(frame, text);
            }
        });

        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(button);

        frame.add(panel);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
