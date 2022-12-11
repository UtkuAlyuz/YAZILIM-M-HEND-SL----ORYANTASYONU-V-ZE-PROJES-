
package com.mycompany.proje1;
import java.util.Scanner;
public class Proje1 {

    public static void main(String[] args) {
    //VKİ Hesaplayıp Sonuçlandıran Program
        System.out.println("Vücut Kitle İndeksi Hesaplama Programı");
        System.out.println("**************************************");
        
        System.out.println("\n\n\n");
        
        
        Scanner input=new Scanner (System.in);
        
        System.out.println("Kütlenizi kilogram cinsinden giriniz");
        double kg = input.nextDouble();
        
        
        System.out.println("Boyunuzu metre cinsinden giriniz:");
        double boy = input.nextDouble();
        
        double vki=kg/(boy*boy);
        
        if(vki<18.5){
            System.out.println("VKİ: "+vki+" "+"ZAYIFSINIZ");
        }
        
        if(18.5<=vki && 24.9>vki){
            System.out.println("VKİ: "+vki+" "+"İDEAL KİLODASINIZ");
        }
        
        if(24.9<=vki && 29.9>vki){
            System.out.println("VKİ: "+vki+" "+"KİLOLUSUNUZ");
        }
        
        if(30<vki){
            System.out.println("VKİ: "+vki+" "+"OBEZSİNİZ");
        }
        
        
            
                   
       
            
        }           
        }
        
        
  
                
                
    

