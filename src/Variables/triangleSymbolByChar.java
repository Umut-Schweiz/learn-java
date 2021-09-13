package variables;
import java.util.Scanner;
public class TriangleSymbolByChar {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter a character");

        char k = scan.next().charAt(0);

        System.out.println(" " + " " + k + " " + " ");
        System.out.println(" "+ k + " " + k + " ");
        System.out.println(k + " " + k + " " + k);
        scan.close();
    }
}
