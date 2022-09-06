package com.example;

import java.util.ArrayList;

public class Zoo {
    private static Zoo zoo = new Zoo();
    private ArrayList<Zwierzeta> zwierzeta = new ArrayList<>();
    private Zoo() {
    }
    public static Zoo getZoo(){
        return zoo;
    }

    public int ilewZoo()
    {
        return zwierzeta.size();
    }
    public void dodajDoZoo(Zwierzeta zwierze)
    {
        zwierzeta.add(zwierze);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "zwierzeta=" + zwierzeta +
                '}';
    }

    public ArrayList<Zwierzeta> getZwierzeta() {
        return zwierzeta;
    }
}
