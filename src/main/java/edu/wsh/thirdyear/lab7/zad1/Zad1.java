package edu.wsh.thirdyear.lab7.zad1;

import javax.swing.*;

public class Zad1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Zadanie 1");
        JLabel label = new JLabel("Witaj w aplikacji!", JLabel.CENTER);
        frame.add(label);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
