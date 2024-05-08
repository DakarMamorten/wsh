package edu.wsh.thirdyear.lab2.zad1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Zamowienie implements Serializable {
    private List<PozycjaZam> pozycje;
    private int maksymalnyRozmiar;

    public Zamowienie() {
        this(10);
    }

    public Zamowienie(int maksymalnyRozmiar) {
        this.maksymalnyRozmiar = maksymalnyRozmiar;
        this.pozycje = new ArrayList<>();
    }

    public void dodajPozycje(PozycjaZam pozycja) {
        if(pozycje.size() < maksymalnyRozmiar) {
            boolean znaleziono = false;
            for(PozycjaZam p : pozycje) {
                if(p.toString().equals(pozycja.toString())) {
                    p.setIloscSztuk(p.getIloscSztuk() + pozycja.getIloscSztuk());
                    znaleziono = true;
                    break;
                }
            }
            if(!znaleziono) {
                pozycje.add(pozycja);
            }
        } else {
            System.out.println("Przekroczono maksymalną liczbę pozycji.");
        }
    }

    public void usunPozycje(int indeks) {
        if(indeks >= 0 && indeks < pozycje.size()) {
            pozycje.remove(indeks);
        } else {
            System.out.println("Podany indeks jest nieprawidłowy.");
        }
    }

    public void edytujPozycje(int indeks, String nazwaTowaru, double cena, int iloscSztuk) {
        if(indeks >= 0 && indeks < pozycje.size()) {
            PozycjaZam pozycja = pozycje.get(indeks);
            pozycja.setNazwaTowaru(nazwaTowaru);
            pozycja.setCena(cena);
            pozycja.setIloscSztuk(iloscSztuk);
        } else {
            System.out.println("Podany indeks jest nieprawidłowy.");
        }
    }

    public double obliczWartosc() {
        double wartosc = 0;
        for(PozycjaZam pozycja : pozycje) {
            wartosc += pozycja.obliczWartosc();
        }
        return wartosc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(PozycjaZam pozycja : pozycje) {
            sb.append(pozycja).append("\n");
        }
        sb.append("Łączna wartość zamówienia: ").append(obliczWartosc());
        return sb.toString();
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
