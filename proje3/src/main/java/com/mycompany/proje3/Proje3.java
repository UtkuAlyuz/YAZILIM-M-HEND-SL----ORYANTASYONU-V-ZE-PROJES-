
package com.mycompany.proje3;
import java.util.Scanner;

public class Proje3 {

    public static void main(String[] args) {
    // Girilen 2 sınav notuyla geçme/kalma durumunu gösteren program
    Scanner input=new Scanner(System.in);
    System.out.println("1. Sınav Notunu Giriniz");
    double sinav1= input.nextDouble();
    
    System.out.println("2. Sınav Notunu Giriniz");
    double sinav2= input.nextDouble();
    
    double ort=(sinav1+sinav2)/2;
    
    if(ort>=50){
    System.out.println("Geçtiniz");
    }
    else{
    System.out.println("Kaldınız");
    }
            
    }
}
