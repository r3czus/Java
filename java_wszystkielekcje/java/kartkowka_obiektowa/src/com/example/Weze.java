package com.example;

public class Weze extends Zwierzeta{
    private boolean czySliski;

    public Weze(int waga, String imie, String gatunek, boolean czySliski) {
        super(waga, imie, gatunek);
        this.czySliski = czySliski;
    }

    @Override
    public String toString() {
        return "Weze{" +
                "czySliski=" + czySliski +
                ", waga=" + waga +
                ", imie='" + imie + '\'' +
                ", gatunek='" + gatunek + '\'' +
                '}';
    }
}
