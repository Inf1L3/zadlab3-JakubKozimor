/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;

/**
 *
 * @author Asia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static int silnia(int wartosc) {
        if (wartosc == 1) {
            return 1;
        } else {
            return wartosc * silnia(wartosc - 1);
        }
    }

    public static void main(String[] args) {
/*
        int a = 5;
        int b = 3;
        int c = a + b++;
        int d = (a++) + b;
        System.out.println(c);
        System.out.println(d);
        
        int a = 6;
        int b = 4;
        int c = a & b;
        int d = a | b;
        System.out.println(c);
        System.out.println(d);
        a = 1;
        b = 0;
        if (a == 1 && b == 1) {
            System.out.println("Tak");
        } else {
            System.out.println("Nie");

        }
        if (a == 1 || b == 1) {
            System.out.println("Tak");
        } else {
            System.out.println("Nie");
        }
         */
        Scanner pobierz = new Scanner(System.in);
        int liczba = pobierz.nextInt();
        System.out.println("Silnia= " + silnia(liczba));
        int liczba1 = pobierz.nextInt();
        int sil = 1;
        for (int i = liczba1; i > 0; i--) {
            sil = sil * i;
        }
        System.out.println("Silnia= " + sil);
    }

}
