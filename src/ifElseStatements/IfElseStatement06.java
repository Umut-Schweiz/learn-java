package ifElseStatements;

import java.util.Scanner;

public class IfElseStatement06 {
        //Special Code
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Bir harf giriniz");
            char harf = scan.next().charAt(0);
            if (harf >= 'a' && harf <= 'z') {
              System.out.println("Kucuk harf");
            } else if (harf >= 'A' && harf <= 'Z') {
              System.out.println("Buyuk harf");
             } else {
              System.out.println("Sana harf gir dedim!");
            }
            scan.close();

            /* Odullu Soru
		 kullanicidan bir yas aliniz
		 0 ve 0'dan kucuk ise "Boyle Bir Varlik Dunyada Yoktur" yazdirin.
		 0'dan buyuk 4'ten kucuk ise "Bebek"
		 4'ten buyul 15'ten kucuk ise "Cocuk"
		 15'ten buyuk 25'ten kucuk  ise "Genc" yazdirin
		 25'ten buyuk 40'tan kucuk ise  "Orta yasli" yazdirin
		 40'tan buyuk 55'ten kucuk ise  "Olgun"
		 55'ten buyuk 80'den kucuk ise  "Yasli"
		 80 ve sonrasi icin "bir Ayagi Cukurda" yazdirin
		 */
    }
}
