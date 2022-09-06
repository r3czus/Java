package com.example;

public class Niedzwiedzie extends Zwierzeta implements MiniZoo{
    private int odSnuZimowego;

    public Niedzwiedzie(int waga, String imie, String gatunek, int odSnuZimowego) {
        super(waga, imie, gatunek);
        this.odSnuZimowego = odSnuZimowego;
    }

    @Override
    public void badzMilutki() {
        if(waga>90)
        {
            System.out.println("Jestem puszysty i milutki");
        }
    }

    @Override
    public String toString() {
        return "Niedzwiedzie{" +
                "odSnuZimowego=" + odSnuZimowego +
                ", waga=" + waga +
                ", imie='" + imie + '\'' +
                ", gatunek='" + gatunek + '\'' +
                '}';
    }
}
