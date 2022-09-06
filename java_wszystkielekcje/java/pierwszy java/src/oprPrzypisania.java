public class oprPrzypisania {
    //DODATKOWE KLASY/PLIKI MUSZĄ MIEĆ NAZWY Z DUŻEJ LITERY, A NIE TAK JAK TUTAJ!!!!!
    public static void main(String[] args) {
        Zmienna ob1 =new Zmienna();
        ob1.x=10;
        Zmienna ob2=ob1;
        ob1.x++;
        System.out.println(ob1.x);
        System.out.println(ob2.x);
        System.out.println(ob2);
        System.out.println(ob2);
        String slowo1="hehexd";
        String slowo2=slowo1;
        slowo1="xdjd";
        System.out.println(slowo1);
        System.out.println(slowo2);
        int liczba=0b01100;
        liczba=~liczba;
        System.out.println(liczba);
    }
}
