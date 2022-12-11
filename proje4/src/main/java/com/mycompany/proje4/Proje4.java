
package com.mycompany.proje4;
import java.util.Scanner;
public class Proje4 {

    public static void main(String[] args) {
    //Girilen Bir Sayının Faktöriyelini Alma    
        Scanner scan = new Scanner(System.in);
        int faktoriyel = 1;
        
        System.out.println("Bir Sayı Giriniz: ");
        int sayi = scan.nextInt();
        
        while(sayi>0) {
            faktoriyel *= sayi;
            sayi--;
        }
        System.out.println("Faktöriyel= "+ faktoriyel);
        
    }
}
