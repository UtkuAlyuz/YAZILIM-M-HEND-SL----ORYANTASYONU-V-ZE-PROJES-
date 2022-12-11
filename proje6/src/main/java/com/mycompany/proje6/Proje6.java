

package com.mycompany.proje6;
import java.util.Scanner;
public class Proje6 {

    public static void main(String[] args) {
    //Girilen 3 ondalık sayının çarpımı
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Birinci sayıyı girin: ");
    float s1 = scan.nextFloat();
 
    System.out.print("İkinci sayı girin: ");
    float s2 = scan.nextFloat();
    
    System.out.print("Üçüncü sayı girin: ");
    float s3 = scan.nextFloat();
 
    float carpim = s1 * s2 * s3;
 
    System.out.println("Çarpım Sonucu: " + carpim);
  
    }
}