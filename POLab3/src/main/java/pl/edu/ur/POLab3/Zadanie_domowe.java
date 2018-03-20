/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Arrays;
import java.util.Scanner;
import javax.xml.transform.Source;

/**
 *
 * @author Jakub
 */
public class Zadanie_domowe {

    public static int potega(int x, int i) {
        if (i == 0) {
            return 1;
        }
        if (i % 2 != 0) {
            return x * potega(x, i - 1);
        } else {
            return (potega(x, i / 2)) * (potega(x, i / 2));
        }
    }

    public static int fib(int z) {

        if (z < 3) {
            return 1;
        } else {
            return fib(z - 1) + fib(z - 2);
        }
    }

    //1.4
    public static void main(String[] args) {
        System.out.println("11<<3=");
        System.out.println(11 << 3);
        System.out.println("77>>2=");
        System.out.println(77 >> 2);
        System.out.println("-17>>>3");
        System.out.println(-17 >>> 3);
        System.out.println();
        System.out.println();
        System.out.println();

        //1.7
        boolean a1, a2, a3;                                        //zad1.7
        a1 = true;
        a2 = false;
        a3 = a1 ^ a2;
        System.out.println("XOR: " + a3);
        System.out.println("NOT: " + !a1);
        System.out.println();
        System.out.println();
        //2.2
        String s1 = new String("Happy ");
        String s2 = new String("Birthday");

        System.out.println("s1.toCharArray()");
        System.out.println(s1.toCharArray());
        System.out.println("zamienia string na char");

        System.out.println("s1.getBytes()");
        System.out.println(s1.getBytes());
        System.out.println("koduje znaki z tego ciagu do tablicy bajtow");

        System.out.println("s1.equals(s2)");
        System.out.println(s1.equals(s2));
        System.out.println("sprawdza czy oba teksty sa takie same");

        System.out.println("s1.equalsIgnoreCase(s2)");
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("sprawdza czy oba teksty sa takie same ale nie zwraca uwagi na wielkosc liter");

        System.out.println("s1.compareTo(s2)");
        System.out.println(s1.compareTo(s2));
        System.out.println("porownuje 2 teksty leksykograficznie");

        System.out.println("s1.compareToIgnoreCase(s2)");
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println("porownuje 2 stringi leksykograficznie i nie zwraca uwagi na wielkosc liter");

        System.out.println("s2.indexOf('t')");
        System.out.println(s2.indexOf('t'));
        System.out.println("wyznacza miejsce znaku");

        System.out.println("s1.indexOf(s2)");
        System.out.println(s1.indexOf(s2));
        System.out.println("wyznacza indeks w jednym tekscie z drugiego");

        System.out.println("s1.lastIndexOf(s2)");
        System.out.println(s1.lastIndexOf(s2));
        System.out.println("wyznacza indeks w jednym tekscie z drugiego ale od konca");

        System.out.println("s1.substring(2)");
        System.out.println(s1.substring(2));
        System.out.println("tworzy podciag z innego tekstu");

        System.out.println("s1.substring(1, 3)");
        System.out.println(s1.substring(1, 3));
        System.out.println("tworzy podciag z innego tekstu w nawiasie jest przedzial");

        System.out.println("s1.replace('a', 'b')");
        System.out.println(s1.replace('a', 'b'));
        System.out.println("zamienia a na b");

        System.out.println("s1.trim()");
        System.out.println(s1.trim());
        System.out.println("eliminuje spacje wiodace i koncowe");

        System.out.println("s1.toLowerCase()");
        System.out.println(s1.toLowerCase());
        System.out.println("zamienia duze znaki na male");

        System.out.println("s1.toUpperCase()");
        System.out.println(s1.toUpperCase());
        System.out.println("zamienia male znaki na duze");

        System.out.println("s1.split(p, 2)");
        System.out.println(Arrays.toString(s1.split("p", 2)));
        System.out.println("dzieli  podany wyraz na wskazanla ilosc po napotkaniu podanego znaku");

        System.out.println("s1.split(a)");
        System.out.println(Arrays.toString(s1.split("a")));
        System.out.println("dzieli wyraz po napotkaniu podanego znaku");
        System.out.println();
        System.out.println();

        //zad3.3
        Scanner pobierz = new Scanner(System.in);

        System.out.println("potega rekurencyjnie");
        System.out.println("podaj liczbe");
        int x = pobierz.nextInt();
        System.out.println("podaj potege");
        int i = pobierz.nextInt();

        System.out.println("wynik= ");
        System.out.println(potega(x, i));

        System.out.println("potega iteracyjnie");
        int wynik = 1;
        System.out.println("podaj liczbe");
        int a = pobierz.nextInt();
        System.out.println("podaj potege");
        int b = pobierz.nextInt();
        while (b > 0) {
            wynik = wynik * a;
            b--;
        }
        System.out.println("wynik= " + wynik);
        System.out.println();
        System.out.println();

        //zad3.4
        System.out.println("ciag fibonacciego\npodaj liczbe");
        int c = pobierz.nextInt();
        System.out.println(fib(c));
    }
}
