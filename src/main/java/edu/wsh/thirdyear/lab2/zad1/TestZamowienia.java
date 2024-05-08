package edu.wsh.thirdyear.lab2.zad1;

public class TestZamowienia {
    public static void main(String[] args) {
        Zamowienie zamowienie = new Zamowienie(20);

        zamowienie.dodajPozycje(new PozycjaZam("Książka", 2, 29.99));
        zamowienie.dodajPozycje(new PozycjaZam("Długopis", 5, 3.50));
        zamowienie.dodajPozycje(new PozycjaZam("Notes", 1, 15.99));
        zamowienie.dodajPozycje(new PozycjaZam("Książka", 1, 29.99));

        System.out.println("Zamówienie:");
        System.out.println(zamowienie);

        zamowienie.zapiszDoPliku("zamowienie.txt");

        Zamowienie wczytaneZamowienie = Serializable.wczytajZPliku("zamowienie.txt");
        if (wczytaneZamowienie != null) {
            System.out.println("Wczytane zamówienie:");
            System.out.println(wczytaneZamowienie);
        } else {
            System.out.println("Błąd podczas wczytywania zamówienia z pliku.");
        }
    }
}
