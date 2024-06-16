package edu.wsh.thirdyear.lab7.zad2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Zad2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Zadanie 2");
        JLabel label = new JLabel("Witaj w aplikacji!", JLabel.CENTER);
        frame.add(label);
        frame.setSize(400, 200);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }
}
