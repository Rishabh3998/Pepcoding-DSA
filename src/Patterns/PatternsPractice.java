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

    public static void pattern3 () {
        // Print the pattern:
        // Take n as an input
        // print n number of rows where number of * is = nth column number - ith row

        //     *
        //    **
        //   ***
        //  ****
        // *****

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j <= n ; j++) {
                if(j < n - i ) {
                    System.out.print(" ");
                }
                if(j >= n - i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Approach 2:

        int space = n-1;
        int star = 1;

        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < space ; j++) {
                System.out.print(" ");
            }

            for (int k = 0 ; k < star ; k++) {
                System.out.print("*");
            }

            space--;
            star++;
            System.out.println();
        }
    }

    public static void pattern4 () {
        // Print the pattern:
        // Take n as an input
        // print n number of rows where number of * is = nth column number - ith row

        // *****
        //  ****
        //   ***
        //    **
        //     *

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int star = n;
        int space = 0;
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < space ; j++) {
                System.out.print(" ");
            }

            for(int k = 0 ; k < star ; k++) {
                System.out.print("*");
            }

            space++;
            star--;
            System.out.println();
        }
    }

    public static void pattern5 () {
        // Print the pattern:
        // Take n as an input
        // print n number of rows where number of * is = nth column number - ith row

        //   *
        //  ***
        // *****
        //  ***
        //   *

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = (n-1) / 2;
        int star = 1;
        for (int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < space ; j++) {
                System.out.print(" ");
            }

            for(int k = 0 ; k < star ; k++) {
                System.out.print("*");
            }
            if(i < (n-1) / 2) {
                space--;
                star += 2;
            } else {
                star -= 2;
                space++;
            }
            System.out.println();
        }
    }

    public static void pattern6 () {
        // Print the pattern:
        // Take n as an input
        // print n number of rows where number of * is = nth column number - ith row

        // *** ***
        // **   **
        // *     *
        // **   **
        // *** ***

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int star = n/2 + 1;
        int space = 1;
        for (int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < star ; j++) {
                System.out.print("*");
            }

            for(int k = 0 ; k < space ; k++) {
                System.out.print(" ");
            }

            for(int l = star - 1 ; l >= 0 ; l--) {
                System.out.print("*");
            }

            if(i < (n-1) / 2) {
                space += 2;
                star--;
            } else {
                star++;
                space -= 2;
            }
            System.out.println();
        }
    }
}
