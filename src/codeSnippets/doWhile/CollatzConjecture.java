package codeSnippets.doWhile;

import java.util.Scanner;

public class CollatzConjecture {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        do {

            if (value == 1) {

            } else if (value % 2 == 0) {
                System.out.println(value);
                value = value / 2;
            } else if (value % 2 != 0) {
                System.out.println(value);
                value = value * 3 + 1;
            }

        } while (value != 1);

        System.out.println(value);

    }

}

/**
 * Collatz conjecture
 * Given natural number n. Generate a sequence of integers, described in the Collatz conjecture:
 *
 * If n is an even number, divide it in half; if it is odd, multiply it by 3 and add 1. Repeat this operation until we get the number 1 as a result.
 *
 * For example, if the number n = 17, then the sequence looks as the following:
 *
 * 17 52 26 13 40 20 10 5 16 8 4 2 1
 * Such a sequence will stop at number 1 for any initial natural number n.
 *
 * Output format:
 * Sequence of integers in a single line, separated by spaces.
 */