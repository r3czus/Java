package com.company;

public class Main {

    public static void main(String[] args) {
	    /*int wylosowane[] = new int[6];
        for(int i=0;i<6;i++)
        {
            wylosowane[i] = (int)(Math.random()*10+1);
        }
        System.out.println(wylosowane);
        for(int element:wylosowane) //To jest tutejszy foreach
        {
            System.out.print(element + " ");
        }*/
        Gra gra1 = new Gra();
        gra1.zagraj();
        Gra gra2 = new Gra();
        gra2.zagraj();
    }
}