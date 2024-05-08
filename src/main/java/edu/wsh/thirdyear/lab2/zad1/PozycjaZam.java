package edu.wsh.thirdyear.lab2.zad1;

import lombok.Data;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

@Data
public class PozycjaZam implements Serializable {
    private String nazwaTowaru;
    private int iloscSztuk;
    private double cena;

    public PozycjaZam(String nazwaTowaru, int iloscSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.iloscSztuk = iloscSztuk;
        this.cena = cena;
    }

    public double obliczWartosc() {
        return cena * iloscSztuk;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-10.2f %-4d %-10.2f", nazwaTowaru, cena, iloscSztuk, obliczWartosc());
    }

    @Override
    public void zapiszDoPliku(String nazwaPliku) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nazwaPliku))) {
            oos.writeObject(this);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
