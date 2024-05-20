package org.example;

// Klavyeden girilen N elemanlı A dizisini küçükten büyüğe doğru "Hızlı Sıralama (quick sort)"
// algoritmasıyla sıralayan program

import java.util.Scanner;

public class Main {

    public static void hizliSiralama(int[] a,int sol,int sag){

        int g;
        int i = sol;
        int j = sag;
        int pivot = a[(sol+sag)/2];

        while (i<=j){
            while (a[i]<pivot) i++;
            while (a[j]>pivot) j--;
            if (i<=j){
                g = a[i];
                a[i] = a[j];
                a[j] = g;
                i++;
                j--;
            }
        }

        if (sol<j) hizliSiralama(a, sol, j);
        if (i<sag) hizliSiralama(a,i,sag);
    }

    public static void main(String[] args) {

        int i,n;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDizinin Eleman Sayısı : ");
        n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println();

            for (i=0; i<n; i++){
                System.out.printf("Dizinin "+(i+1)+". Elemanı : ");
                a[i] = scanner.nextInt();
            }
        hizliSiralama(a,0,n-1);
        System.out.print("\nSıralı Dizi : \n------------\n");
        for (i=0; i<n; i++)
            System.out.printf("%d\t",a[i]);

    }
}