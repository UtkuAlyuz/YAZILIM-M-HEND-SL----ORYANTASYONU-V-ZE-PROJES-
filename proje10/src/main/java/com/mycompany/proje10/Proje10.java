

package com.mycompany.proje10;
import java.util.Scanner;
public class Proje10 {

    public static void main(String[] args) {
    //girilen sayıya kadar olan sayıların toplamını veren program    
        
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        
        for(int i = 1; i < sayi; i++)
        {
            toplam = toplam + i; // toplam += i;
        }
        System.out.println(sayi + " sayısına kadar olan sayıların toplamı = " + toplam);
    }
}    

