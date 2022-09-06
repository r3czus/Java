package com.company;
//DODATKOWE KLASY/PLIKI MUSZĄ MIEĆ NAZWY Z DUŻEJ LITERY, A NIE TAK JAK TUTAJ!!!!!
import java.util.*;

public class lotto2 {
    public static List<Integer>wylosuj(){
        List<Integer> wylosowane = new ArrayList<>();
        for(int i=0;i<6;i++)
        {
            int liczba = (int)(Math.random()*10+1);
            while(wylosowane.contains(liczba))
            {
                liczba = (int)(Math.random()*10+1);
            }
            wylosowane.add(liczba);
        }
        return wylosowane;
    }
    private static Set<Integer> wpisz(){
        System.out.println("Podaj 6 liczb bez powtórzeń");
        Set<Integer> wpisane = new HashSet<>();
        Scanner klawiatura = new Scanner(System.in);
        while(wpisane.size()<6)
        {
            int liczba = klawiatura.nextInt();
            wpisane.add(liczba);
        }
        return wpisane;
    }
    private static List<Integer> sprawdz(List<Integer>wylosowane,Set<Integer>wpisane){
        List<Integer> trafione = new LinkedList<>();
        for(Integer element:wylosowane)
        {
            if(wpisane.contains(element))
            {
                trafione.add(element);
            }
        }
        return trafione;
    }
    public static void main(String[] args) {
        List<Integer> wylosowane = new ArrayList<>();
        wylosowane = wylosuj();
        System.out.println(wylosowane);
        Set<Integer> wpisane = new HashSet<>();
        wpisane = wpisz();
        System.out.println(wpisane);
        List<Integer> trafione = new LinkedList<>();
        trafione = sprawdz(wylosowane,wpisane);
        System.out.println("Trafiłaś/eś:");
        System.out.println(trafione);
    }
}