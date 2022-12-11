

package com.mycompany.proje2;
import java.util.Scanner;
public class Proje2 {

    public static void main(String[] args) {
    //Girilen Sayının 5'e ve 8'e bölünüp bölünememesine göre sınıflandırma
        Scanner input=new Scanner(System.in);
        
        System.out.println("Sayıyı Giriniz");
        int sayi=input.nextInt();
        
        if(sayi%5==0){
            
            if(sayi%8==0){
                System.out.println(sayi + " sayısı 5 ve 8'in ortak katıdır");
            }
            else{
                System.out.println(sayi + " sayısı 5'in katıdır");
            }
            
            
        }    
        else{
            if(sayi%8==0){
            System.out.println(sayi + " sayısı 8'in katıdır");
        }
        else{
                System.out.println(sayi + " sayısı 5'in veya 8'in katı değildir");
        }   
            }    
     
    }

}
