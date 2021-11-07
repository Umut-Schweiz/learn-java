package codeSnippets.methodCreationAndDecleration;

import java.util.Scanner;

public class VowelOrNot {

    public static boolean isVowel(char ch) {

        switch (ch) {
            case 'a':
            case 'e':
            case 'u':
            case 'o':
            case 'i':
            case 'A':
            case 'E':
            case 'U':
            case 'O':
            case 'I':
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }

}

/**
 * Vowel or not
 * Implement a method that checks whether a given English letter is a vowel or not. The input may be in any case.
 *
 * In our case, the letter 'y' is not considered a vowel.
 *
 * Examples:
 *
 * isVowel('a') should be true
 * isVowel('A') should be true
 * isVowel('b') should be false
 */