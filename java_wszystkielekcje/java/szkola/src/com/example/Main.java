package com.example;

public class Main {
    public static void main(String[] args) {
        Uczen uczen1 = new Uczen("Jaś","Nowak",1);
        Uczen uczen1a = new Uczen("Jaś","Nowak",1);
        Uczen uczen1b = new Uczen("Jan","Nowak",1);
        Uczen uczen2 = new Uczen("Małgosia","Nowak",2);
        /*System.out.println(uczen1.getImie());
        uczen1.setImie("Jan");
        System.out.println(uczen1.getImie());
        System.out.println(uczen1.toString()); //Ten toString jest wsm teraz niepotrzebny, on się wywołuje sam jak podamy samą nazwę (chyba)
        System.out.println(uczen1);

        Nauczyciel n1 = new Nauczyciel("Grażyna","Cebula","polski",47);
        System.out.println(n1);

        Klasa klasa2x = new Klasa("2x",n1);
        klasa2x.dodajUczniaDoKlasy(uczen1);
        klasa2x.dodajUczniaDoKlasy(uczen2);
        System.out.println(klasa2x);*/

        System.out.println(uczen1.equals(uczen1a));
        System.out.println(uczen1.equals(uczen1b));
        System.out.println(uczen1.equals(uczen2));

        Szkola wiezienie = Szkola.getSzkola();
        wiezienie.setWszystkieKlasy();
        wiezienie.przyjmijUczniaDoSzkoly("Jaś","Nowak");
        wiezienie.przyjmijUczniaDoSzkoly("Małgosia","Nowak");
        System.out.println(wiezienie.uczniowie);
        wiezienie.dodajUczniaDoKlasy(wiezienie.uczniowie.get(0),wiezienie.wszystkieKlasy.get(4));
        System.out.println(wiezienie.uczniowie);
        System.out.println(wiezienie.wszystkieKlasy);
    }
}