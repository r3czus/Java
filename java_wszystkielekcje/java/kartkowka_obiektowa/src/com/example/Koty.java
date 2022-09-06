package com.example;

public class Koty extends Zwierzeta implements MiniZoo{
    private boolean czyRasowy;
    public Koty(int waga, String imie, String gatunek, boolean czyRasowy) {
        super(waga, imie, gatunek);
        this.czyRasowy = czyRasowy;
    }

    @Override
    public void badzMilutki() {
        if(waga<10)
        {
            System.out.println("Jestem maly i milutki");
        }
    }

    @Override
    public String toString() {
        return "Koty{" +
                "czyRasowy=" + czyRasowy +
                ", waga=" + waga +
                ", imie='" + imie + '\'' +
                ", gatunek='" + gatunek + '\'' +
                '}';
    }
}
