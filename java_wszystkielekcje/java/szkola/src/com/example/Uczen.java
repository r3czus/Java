package com.example;

public class Uczen extends Osoba implements Dyzurny{
    private int nrUcznia;

    public Uczen(String imie, String nazwisko, int nrUcznia) {
        super(imie, nazwisko); //Wywołanie konstruktora z klasy nadrzędnej, MUSI się znajdywać na początku konstruktora podrzędnego
        this.nrUcznia = nrUcznia;
    }
    public int getNrUcznia() {
        return nrUcznia;
    }
    public void setNrUcznia(int nrUcznia) {
        this.nrUcznia = nrUcznia;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "nrUcznia=" + nrUcznia +", "+getImie()+", "+getNazwisko()+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Uczen)) return false;

        Uczen uczen = (Uczen) o;
        if(nrUcznia == uczen.nrUcznia)
            if(getImie() == uczen.getImie())
                if(getNazwisko() == uczen.getNazwisko())
                    return true;
                return false;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Uczen)) return false;

        Uczen uczen = (Uczen) o;

        return nrUcznia == uczen.nrUcznia;
    }*/

    @Override
    public int hashCode() {
        return nrUcznia;
    }

    @Override
    public void dyzuruj() {
        System.out.println("Jestem dyżurnym");
    }
}