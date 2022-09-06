package com.company;

import java.util.*;

public class Gra {
    private static List<Integer> wylosowane = new ArrayList<>(); //Dzięki static to działa dla wszystkich obiektów, a nie jak reszta na nowo przy każdym obiekcie dla tego obiektu właśnie.
    private Set<Integer> wpisane = new HashSet<>();
    private List<Integer> trafione = new LinkedList<>();

    private static void wylosuj(){
        if(wylosowane.isEmpty())
        {
            for(int i=0;i<6;i++)
            {
                int liczba = (int)(Math.random()*10+1);
                while(wylosowane.contains(liczba))
                {
                    liczba = (int)(Math.random()*10+1);
                }
                wylosowane.add(liczba);
            }
        }
    }
    private void wpisz(){
        System.out.println("Podaj 6 liczb bez powtórzeń");
        Scanner klawiatura = new Scanner(System.in);
        while(wpisane.size()<6)
        {
            int liczba = klawiatura.nextInt();
            wpisane.add(liczba);
        }
    }
    private void sprawdz(){
        for(Integer element:wylosowane)
        {
            if(wpisane.contains(element))
            {
                trafione.add(element);
            }
        }
    }
    public void zagraj()
    {
        wylosuj();
        System.out.println(wylosowane);
        wpisz();
        sprawdz();
        System.out.println(trafione);
    }
}
