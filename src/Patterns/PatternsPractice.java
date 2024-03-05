package Patterns;
import java.util.Scanner;

public class PatternsPractice {
    public static void pattern1 () {
        // Print the pattern:
        // Take n as an input
        // print n number of rows where number of * is = row number

        // *
        // **
        // ***
        // ****
        // *****

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2 () {
        // Print the pattern:
        // Take n as an input
        // print n number of rows where number of * is = nth column number - ith row

        // *****
        // ****
        // ***
        // **
        // *

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++) {
            for (int j = n - i ; j > 0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
