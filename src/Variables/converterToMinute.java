package variables;
import java.util.Scanner;

public class ConverterToMinute {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("enter how many hours");

        long hour = scan.nextLong();
        System.out.println("Second= "+hour*60*60);

        scan.close();

    }

}
