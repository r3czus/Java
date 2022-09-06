package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Elo żelo");
        double liczba=(int) (Math.random()*100+1); //losowanie wartości od 1 do 100
        System.out.println(liczba);
        Scanner klawiatura=new Scanner(System.in);
        int wpisana;
        /* for(int i=0;i<5;i++)
        {
            wpisana=klawiatura.nextInt();
            if(wpisana==liczba)
            {
                System.out.println("Trafiłeś/aś!");
                break;
            }
            else if(liczba<wpisana)
            {
                System.out.println("Za wysoko");
            }
            else if(liczba>wpisana)
            {
                System.out.println("Za nisko");
            }
        }*/
        int roznica, wynik;
        do
        {
            wpisana=klawiatura.nextInt();
            roznica = (int) (liczba > wpisana ? liczba-wpisana : wpisana-liczba);
            if(liczba<wpisana)
            {
                System.out.println("Za wysoko");
            }
            else if(liczba>wpisana)
            {
                System.out.println("Za nisko");
            }
            wynik=roznica/10;
            /*switch(wynik)
            {
                case 0:
                    System.out.println("Bardzo blisko");
                    break;
                case 1:
                    System.out.println("Bliżej");
                    break;
                case 2:
                    System.out.println("Coraz bliżej");
                    break;
                default:
                    System.out.println("Nie poddawaj się");
                    break;
            }*/
            /*System.out.println( switch (wynik){
                case 0 -> "Bardzo blisko";
                case 1 -> "Bliżej";
                case 2 -> "Coraz bliżej";
                default -> "Nie poddawaj się";
            });*/
            String komunikat;
            komunikat = switch (wynik){
                case 0:
                case 1:
                    //Tu mogą się znaleźć inne instrukcje.
                    yield "Blisko";
                case 2:
                    yield "Daleko";
                default:
                    yield "Bardzo daleko";
            };
            System.out.println(komunikat);
        }while(liczba!=wpisana);
        System.out.println("Trafiłeś/aś!");

    }
}