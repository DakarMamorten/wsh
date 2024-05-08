package edu.wsh.thirdyear.lab2.zad1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public interface Serializable {
    void zapiszDoPliku(String nazwaPliku);
    static Zamowienie wczytajZPliku(String nazwaPliku) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nazwaPliku))) {
            return (Zamowienie) ois.readObject();
        } catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
