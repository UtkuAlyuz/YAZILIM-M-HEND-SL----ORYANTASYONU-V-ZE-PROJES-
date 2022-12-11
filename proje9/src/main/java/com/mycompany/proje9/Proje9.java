
package com.mycompany.proje9;
import java.util.Scanner;
public class Proje9 {

    public static void main(String[] args) {
    //Girilen Sayıya Kadar Olan Sayıların Karelerini Bulma
        
        Scanner scan = new Scanner(System.in);
        int kare;
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        
        for(int i = 1; i <= sayi; i++)
        {
            kare = i * i;
            System.out.println(i + " sayısının karesi = " + kare);
        }
    }
}

