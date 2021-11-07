package codeSnippets.methodCreationAndDecleration;

import java.util.Scanner;

public class SignOfNumber {
    public static int sign(int number) {

        if (number == 0) {
            return number;
        } else if (number > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}

/**
 * The sign of a number
 * Write a method with the name sign that takes an int number and checks whether the number is negative, positive or zero. The method should return -1, +1 or 0 respectively.
 *
 *
 * Sample Input:
 * 11
 *
 * Sample Output:
 * 1
 *
 *
 * Sample Input:
 * 0
 *
 * Sample Output:
 * 0
 *
 *
 * Sample Input:
 * -3
 *
 * Sample Output:
 * -1
 */