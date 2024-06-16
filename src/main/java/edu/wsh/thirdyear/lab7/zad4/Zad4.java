package edu.wsh.thirdyear.lab7.zad4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zad4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Zadanie 4");
        JTextArea textArea = new JTextArea(10, 30);
        JTextField searchField = new JTextField(20);
        JButton searchButton = new JButton("Szukaj");

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                String search = searchField.getText();
                int count = 0;
                int index = 0;
                while ((index = text.indexOf(search, index)) != -1) {
                    count++;
                    index += search.length();
                }
                JOptionPane.showMessageDialog(frame, "Liczba wystąpień: " + count);
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JScrollPane(textArea));
        panel.add(searchField);
        panel.add(searchButton);

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
