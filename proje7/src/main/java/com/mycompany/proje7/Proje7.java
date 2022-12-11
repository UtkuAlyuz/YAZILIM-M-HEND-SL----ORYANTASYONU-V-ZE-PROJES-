
package com.mycompany.proje7;
import java.util.Scanner;
public class Proje7 {

    public static void main(String[] args) {
    //Dairenin alanını bulan program
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Dairenin yarıçapını giriniz: ");
        int yarıcap = scan.nextInt();
        
        System.out.println("Dairenin alanı = " + (3.141593 * yarıcap * yarıcap));
    }
}