package codeSnippets.doWhile;

import java.util.Scanner;

public class IntegerBarrier {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tsum = 0;

        while (true) {
            int n = scn.nextInt();
            tsum = tsum + n;
            if (n == 0) {
                System.out.print(tsum);
                break;
            }else if (tsum >= 1000) {
                System.out.print(tsum - 1000);
                break;
            }
        }
    }
}

/**
 * The integer barrier
 * Write a program that reads a sequence of integer numbers in a loop and adds up all numbers.
 *
 * If a new number is equal to 0, the program must stop the loop and output the accumulated sum.
 *
 * When the sum is equal to or exceeds 1000 (the barrier), the program should also stop and output the value equal to sum minus 1000 (sum – 1000).
 *
 * Note: the input can contain extra numbers. Just ignore them.
 *
 *
 * Sample Input:
 * 800
 * 101
 * 102
 * 300
 * 0
 *
 * Sample Output:
 * 3
 *
 *
 * Sample Input:
 * 103
 * 105
 * 109
 * 0
 * 1000
 */
