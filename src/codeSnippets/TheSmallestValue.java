package codeSnippets;

import java.util.Scanner;

public class TheSmallestValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        int fNum = 1;
        long sum = 1;
        while (sum <= num) {
            fNum++;
            sum *= fNum;
        }
        System.out.println(fNum);
    }

}

/**
 * The smallest value
 * A user inputs a long positive number m. You need to find out what is the smallest int number n such that n! > m.
 *
 * Just in case: wiki on factorials.
 *
 * Hint
 *
 *
 * Sample Input:
 * 6188989133
 *
 * Sample Output:
 * 13
 *
 *
 * Sample Input:
 * 6
 *
 * Sample Output:
 * 4
 */