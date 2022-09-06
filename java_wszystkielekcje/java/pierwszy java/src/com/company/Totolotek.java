package com.company;

public class Totolotek {
    public static void main(String[] args) {
        System.out.println("Zostanie wylosowane 6 liczb, a ty podasz swoje 6");
        int wylosowane[]=new int[6];
        for(int i=0;i<6;i++)
        {
            wylosowane[i]=(int)(Math.random()*100+1);
        }
        for(int i=0;i<6;i++)
        {
            System.out.print(wylosowane[i]+" ");
        }

    }
}
