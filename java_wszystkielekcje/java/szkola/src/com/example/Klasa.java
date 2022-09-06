package com.example;

import java.util.ArrayList;

public class Klasa {
    private String nrKlasy;
    private ArrayList<Uczen> uczniowie = new ArrayList<>();
    private Nauczyciel wychowawca;

    public Klasa(String nrKlasy) {
        this.nrKlasy = nrKlasy;
    }
    public Klasa(String nrKlasy, ArrayList<Uczen> uczniowie) {
        this.nrKlasy = nrKlasy;
        this.uczniowie = uczniowie;
    }
    public Klasa(String nrKlasy, Nauczyciel wychowawca) {
        this.nrKlasy = nrKlasy;
        this.wychowawca = wychowawca; //Robimy rzutowanie i nauczyciel jest podany jako wychowawca, ale chyba nim nie jest z punktu widzenia klasy wychowawca czy jakoś tak.
    }
    public Klasa(String nrKlasy, ArrayList<Uczen> uczniowie, Wychowawca wychowawca) {
        this.nrKlasy = nrKlasy;
        this.uczniowie = uczniowie;
        this.wychowawca = wychowawca;
    }

    public void dodajUczniaDoKlasy(Uczen uczen)
    {
        if(!czyUczenJestWKlasie(uczen))
        {
            uczniowie.add(uczen);
        }
        else
        {
            System.out.println("Uczeń "+uczen+" jest już w klasie, pacanie.");
        }
    }
    public boolean czyUczenJestWKlasie(Uczen uczen)
    {
        return uczniowie.contains(uczen);
    }

    @Override
    public String toString() {
        String listaUczniow="";
        for(Uczen uczen:uczniowie)
        {
            listaUczniow+=" "+uczen.getNrUcznia()+". "+uczen.getImie()+" "+uczen.getNazwisko();
        }
        return "Klasa{" +
                "nrKlasy='" + nrKlasy + '\'' +
                ", uczniowie=" + listaUczniow +
                ", wychowawca=" + wychowawca +
                '}';
    }

    public String getNrKlasy() {
        return nrKlasy;
    }
}