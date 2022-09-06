package com.example;

import java.util.ArrayList;
import java.util.List;

//1 - Wylosuj 100 liczb z zakresu od 1 do 1000
//2 - Wypisz liczby palindromiczne
//3 - Znadź liczbę, której suma cyfr jest największa

public class Main {
    public static void main(String[] args) {
        int losowe[]=new int[100];
        Integer losowa, losowaKopia;
        int max=0, cyfra, suma, najwieksza=0;
        List<Integer> palinki = new ArrayList<>();
        for(int i=0;i<100;i++)
        {
            losowa=(int) ((Math.random()*(1000-1))+1); //Losuję liczbę w przedziale od 1 do 1000
            losowe[i]=losowa;
            if(czyPalin(losowa.toString())) //Od razu sprawdzam czy może nie jest palindromem...
            { palinki.add(losowa);} //... a jeśli tak to dodaję ją do odpowiedniej listy
            suma=0; //Resetuję wartości przed sprawdzaniem sumy
            losowaKopia=losowa; //I kopię losowej, ponieważ sama zmienna ulegnie modyfikacji przy wyciąganiu jej cyfr
            while(losowa>0)
            {
                cyfra = losowa%10;
                suma+= cyfra;
                losowa/=10;
            }
            if(suma>max) //Jeżeli suma okazła się być większa, niż dotychczasowy max - zastąp największą sumę nowym wynikiem i zastąp największą liczbę nowym liderem.
                // Dzięki temu, że to wszystko dzieje się w jednej iteracji nie ma ryzyka, że suma i najwieksza się jakoś pomieszają, poplączą z innymi parami sum i największych, które pochodzą z innych liczb.
            {
                max=suma;
                najwieksza = losowaKopia;
            }
        }
        System.out.println("Liczby palindromiczne z losowego zbioru: ");
        System.out.println(palinki);
        System.out.printf("Losowa liczba z największą sumą cyfr to: "+najwieksza);
    }
    static boolean czyPalin(String kandydat) //Użyłem metody, którą opracowaliśmy wspólnie na lekcji.
    {
        for (int i=0;i<kandydat.length();i++)
        {
            if(kandydat.charAt(i)!=kandydat.charAt(kandydat.length()-1-i))
            { return false; }
        }
        return true;
    }
}
