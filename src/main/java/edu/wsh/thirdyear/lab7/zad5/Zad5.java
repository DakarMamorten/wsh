package edu.wsh.thirdyear.lab7.zad5;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Zad5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Zadanie 5");
        JTextArea textArea = new JTextArea(20, 40);
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Plik");
        JMenuItem openItem = new JMenuItem("Otwórz");
        JMenuItem saveItem = new JMenuItem("Zapisz");

        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int option = fileChooser.showOpenDialog(frame);
                if (option == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                        textArea.read(br, null);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(frame, "Błąd odczytu pliku");
                    }
                }
            }
        });

        saveItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int option = fileChooser.showSaveDialog(frame);
                if (option == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                        textArea.write(bw);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(frame, "Błąd zapisu pliku");
                    }
                }
            }
        });

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        frame.add(new JScrollPane(textArea));
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

