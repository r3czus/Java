package com.example;

public abstract class Zwierzeta {
    protected int waga;
    protected String imie, gatunek;

    public Zwierzeta(int waga, String imie, String gatunek) {
        this.waga = waga;
        this.imie = imie;
        this.gatunek = gatunek;
    }

    public int getWaga() {
        return waga;
    }

    public String getImie() {
        return imie;
    }

    public String getGatunek() {
        return gatunek;
    }

    @Override
    public String toString() {
        return "Zwierzeta{" +
                "waga=" + waga +
                ", imie='" + imie + '\'' +
                ", gatunek='" + gatunek + '\'' +
                '}';
    }
}
