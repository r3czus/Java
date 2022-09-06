package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String wpisane = klawiatura.nextLine();
        long wpisana = klawiatura.nextLong();

        System.out.println("czyPalin: "+czyPalin(wpisane));
        System.out.println("czyPalin2: "+czyPalin2(wpisane));
        System.out.println("Zaszyfrowane słowo "+wpisane+" z kluczem 3: "+szyfruj(wpisane,3));
        System.out.println("Zaszyfrowane słowo "+wpisane+" z kluczem 100: "+szyfruj(wpisane,100));
        long fibo[]=new long[100];
        fibo=fibonaczi();
        for(int i=0;i<100;i++)
        {
            System.out.print(fibo[i]+", ");
        }
        long result = binarne(fibo, wpisana);
        System.out.println("\nNajbliższe fibo do wpisanej liczby "+wpisana+": "+result);
        System.out.println("Najbliższy plaindrom do wpisanej liczby"+wpisana+" to: "+blisko((int)wpisana));

    }
    static boolean czyPalin(String slowo)
    {
        StringBuilder odwrot = new StringBuilder(slowo);
        odwrot.reverse();
        if(slowo.equals(odwrot.toString()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static boolean czyPalin2(String slowo)
    {
        for (int i=0;i<slowo.length();i++)
        {
            if(slowo.charAt(i)!=slowo.charAt(slowo.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }
    static String szyfruj(String slowo, int klucz)
    {
        String szyfr="";
        for(int i=0;i<slowo.length();i++)
        {
            int kod=(int)slowo.charAt(i);
            klucz%=26;
            kod+=klucz;
            if(kod>(int)'z')
            {
                kod-=26;
            }
            szyfr+=(char)kod;
        }
        return szyfr;
    }
    static long[] fibonaczi()
    {
        long liczby[]=new long[100];
        liczby[0]=0;
        liczby[1]=1;
        for(int i=2;i<100;i++)
        {
            liczby[i]=liczby[i-1]+liczby[i-2];
        }
        return liczby;
    }
    static long binarne(long[] tablica, long liczba)
    {
        int pocz=0, kon = tablica.length-1;
        int srodek=(pocz+kon)/2;
        while(pocz<kon-1)
        {
            if(tablica[srodek]>liczba)
            {
                kon=srodek;
            }
            else if(tablica[srodek]<liczba)
            {
                pocz=srodek;
            }
            else
            {
                return tablica[srodek];
            }
            srodek=(pocz+kon)/2;
        }
        if(liczba-tablica[pocz]>tablica[kon]-liczba)
        {
            return tablica[kon];
        }
        else
        {
            return tablica[pocz];
        }
    }
    public static int blisko(Integer kandydat){
        Integer kandydat2=kandydat;
        while(true){
            if(czyPalin(kandydat.toString())){
                return kandydat;
            }
            kandydat++;
            if(czyPalin(kandydat2.toString())){
                return kandydat2;
            }
            kandydat2--;
        }
    }
}