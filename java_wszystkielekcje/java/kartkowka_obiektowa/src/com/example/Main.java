package com.example;

public class Main {
    public static void main(String[] args) {
        Zoo ogrod = Zoo.getZoo();
        Zwierzeta kotek = new Koty(5,"Kiciu","kot domowy",false);
        Zwierzeta misiek = new Niedzwiedzie(100,"Wojtek","Grizzly",6);
        Zwierzeta wonsz = new Weze(5,"Rzeczny","Niebezpieczny",true);
        ogrod.dodajDoZoo(kotek);
        ogrod.dodajDoZoo(misiek);
        ogrod.dodajDoZoo(wonsz);

        System.out.println(ogrod);
        System.out.println(ogrod.ilewZoo());
    }
}