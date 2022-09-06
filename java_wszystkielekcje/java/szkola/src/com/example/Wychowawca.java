package com.example;

public final class Wychowawca extends Nauczyciel{ //Final blokuje możliwość dziedziczenia z tej klasy
    public Wychowawca(String imie, String nazwisko, String przedmiot, int wiek) {
        super(imie, nazwisko, przedmiot, wiek);
    }
}