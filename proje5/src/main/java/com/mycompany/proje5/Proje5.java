
package com.mycompany.proje5;
import java.util.Scanner;
public class Proje5 {

    public static void main(String[] args) {
    //Girilen bir sayının asal olup olmaması    
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int sayac = 0;
        int i = 2;
        
        while(i < sayi) {
            if(sayi % i == 0) {
                sayac++;
            }
            i++;
        }
        if(sayac == 0) {
            System.out.println(sayi + " Asal bir sayıdır");
        }
        else {
            System.out.println(sayi + " Asal bir sayı değildir");
        }
    }
}
