package com.example;

import java.util.ArrayList;
import java.util.HashSet;

public class Szkola { //Szkola to singleton
    private static Szkola szkola = new Szkola();
    private Szkola() {
    }
    public static Szkola getSzkola(){
        return szkola;
    }
    public static int liczbaUczniow=0;
    public ArrayList<Uczen> uczniowie = new ArrayList<>();
    public ArrayList<Klasa> wszystkieKlasy=new ArrayList<>();
    public void setWszystkieKlasy()
    {
        this.wszystkieKlasy.add(new Klasa("1a"));
        this.wszystkieKlasy.add(new Klasa("1p"));
        this.wszystkieKlasy.add(new Klasa("2a"));
        this.wszystkieKlasy.add(new Klasa("2p"));
        this.wszystkieKlasy.add(new Klasa("3a"));
        this.wszystkieKlasy.add(new Klasa("3p"));
    }
    public void przyjmijUczniaDoSzkoly(String imie, String nazwisko)
    {
        liczbaUczniow++;
        int nr=liczbaUczniow;
        Uczen uczen = new Uczen(imie,nazwisko,nr);
        uczniowie.add(uczen);
    }
    public void dodajUczniaDoKlasy(Uczen uczen, Klasa klasa)
    {
        for(Klasa taKlasa:wszystkieKlasy)
        {
            if(taKlasa.czyUczenJestWKlasie(uczen))
            {
                System.out.println("Uczeń jest już w klasie"+taKlasa.getNrKlasy());
                return;
            }
        }
        klasa.dodajUczniaDoKlasy(uczen);
    }

    //int zm1; To jest normalna zmienna...
    //Integer zm2; ... a to cały obiekt!
}