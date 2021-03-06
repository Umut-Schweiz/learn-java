package ifElseStatements;

import java.util.Scanner;

public class NestedIf01 {

    public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi alin
		 Sayi pozitif ise 10 dan buyuk mu diye kontrol edin.
		 10 dan buyuk ise "Woooow!", kucuk ise "Hmmmm!" yazdirin

		 Sayi 0 veya negatif ise -10 dan kucuk mu diye kontrol edin.
		 -10 dan kucuk ise "Felaket!", -10 dan buyuk ise "Ne yapalim" yazdirin
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int s = scan.nextInt();

        if(s>0) {                                   //curly braces lerin içinde
            if(s>10) {
                System.out.println("Woooow!");
            }else {
                System.out.println("Hmmmm!");
            }                                      // curly braces lerin içinde
        }else if(s<=0) {
            if(s<-10) {
                System.out.println("Felaket!");
            }else {
                System.out.println("Ne yapalim");
            }
        }

        scan.close();

    }
}
