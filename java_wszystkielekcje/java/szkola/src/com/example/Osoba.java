package com.example;
// TE NOWE KLASY/PLIKI MUSZĄ MIEĆ NAZWY Z WIELKIEJ LITERY!!!
public abstract class Osoba { //Teraz nie można zrobić klasy osoba, ale może ona służtyć do dziedziczenia itd.
    private String imie;
    private String nazwisko;

    public Osoba(String imie, String nazwisko) { //Korzystamy z 'generate' ukrytego pod PPM
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override //Dzięki override ZASŁANIAMY XD domyślego toString, który normalnie wypisuje adres czy coś.
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}