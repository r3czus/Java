package com.company;
//DODATKOWE KLASY/PLIKI MUSZĄ MIEĆ NAZWY Z DUŻEJ LITERY, A NIE TAK JAK TUTAJ!!!!!
import java.util.*;

public class lotto1 {
    public static void main(String[] args) {
        List<Integer> wylosowane = new ArrayList<>();
        for(int i=0;i<6;i++)
        {
            int liczba = (int)(Math.random()*10+1);
            while(wylosowane.contains(liczba)) //Zabezpieczenie przed powtórzeniami.
            {
                liczba = (int)(Math.random()*10+1);
            }
            wylosowane.add(liczba);
        }
        System.out.println(wylosowane);
        System.out.println("Podaj 6 liczb bez powtórzeń");
        Set<Integer> wpisane = new HashSet<>(); //To zbiór, który automatycznie nie przyjmuje powtórzeń.
        Scanner klawiatura = new Scanner(System.in);
        while(wpisane.size()<6)
        {
            int liczba = klawiatura.nextInt();
            wpisane.add(liczba);
        }
        System.out.println(wpisane);
        /*List<Integer> trafione = new ArrayList<>(); // Własnoręczne sprawdzanie trafionych
        for(int i=0;i<6;i++)
        {
            if(wpisane.contains(wylosowane.get(i)))
            {
                trafione.add(wylosowane.get(i));
            }
        }
        System.out.println(trafione);
        System.out.println("Trafiłeś "+trafione.size()+" liczb");*/
        List<Integer> trafione = new LinkedList<>();
        for(Integer element:wylosowane)
        {
            if(wpisane.contains(element))
            {
                trafione.add(element);
            }
        }
        System.out.println("Trafiłaś/eś:");
        System.out.println(trafione);
    }
}