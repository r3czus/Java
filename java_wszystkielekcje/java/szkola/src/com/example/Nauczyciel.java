package com.example;

public sealed class Nauczyciel extends Osoba implements Dyzurny//Sealed ogranicza dziedziczenie/rozszerzanie; implements dołącza nam interface
permits Wychowawca{ //Pozwalamy Wychowawcy na dziedziczenie od klasy Nauczyciel.
    private String przedmiot;
    private int wiek;

    public Nauczyciel(String imie, String nazwisko, String przedmiot, int wiek) {
        super(imie, nazwisko);
        this.przedmiot = przedmiot;
        this.wiek = wiek;
    }
    public String getPrzedmiot() {
        return przedmiot;
    }
    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }
    public int getWiek() {
        return wiek;
    }
    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public void dyzuruj() {
        System.out.println("Dyżur");
    }
}