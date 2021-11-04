package codeSnippets;

import java.util.Scanner;

public class FloorSpaceOfTheRoom {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String typeOfShape = scanner.nextLine();

            switch (typeOfShape) {
                case "triangle":
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    double c = scanner.nextDouble();
                    double p = (a + b + c) / 2;
                    double answer1 = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                    System.out.println(answer1);
                    break;

                case "rectangle":
                    double d = scanner.nextDouble();
                    double e = scanner.nextDouble();
                    double answer2 = d * e;
                    System.out.println(answer2);
                    break;

                case "circle":
                    double f = scanner.nextDouble();
                    double answer3 = f * f * 3.14;
                    System.out.println(answer3);
                    break;
                default:
            }
        }
}

/**+
 * Floor-space of the room
 * Residents of the country of Malevia often experiment with the plan of their rooms. Rooms can be triangular, rectangular, and round.
 *
 * Write a program that calculates the floorage of the rooms.
 *
 * Input data format
 *
 * The type of the room shape and the relevant parameters.
 *
 * Output data format
 *
 * The area of the resulting room.
 *
 * Note that the value of 3.14 is used instead of the number π in Malevia.
 *
 * Hint
 *
 * Input format used by the Malevians:
 *
 * triangle
 * a
 * b
 * c
 * where a, b and c — lengths of the triangle sides.
 *
 * rectangle
 * a
 * b
 * where a and b — lengths of the rectangle sides.
 *
 * circle
 * r
 * where r — circle radius.
 *
 * Note, the input values (a, b, c, r) are doubles and your answer should be, too.
 *
 *
 * Sample Input:
 * rectangle
 * 4
 * 10
 */