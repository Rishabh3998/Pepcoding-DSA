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

    public static void pattern7 () {
        // Print the pattern:
        // Take n as an input
        // print n number of rows where number of * will print i == j

        //  *
        //    *
        //      *
        //        *
        //          *

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                if(i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern8 () {
        // Print the pattern:
        // Take n as an input
        // print n number of rows where number of * will print where i + j == n+1 or the logic used below

        //         *
        //       *
        //     *
        //   *
        // *

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = n - 1;
        for (int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < space ; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            space--;
            System.out.println();
        }
    }

    public static void pattern9 () {
        // Print the pattern:
        // Take n as an input
        // print n number of rows where number of * will print

        // *       *
        //   *   *
        //     *
        //   *   *
        // *       *

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                if(i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern10 () {
        // Print the pattern:
        // Take n as an input
        // print n number of rows where number of * will print

        //   *
        //  * *
        // *   *
        //  * *
        //   *

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int os = n / 2;
        int is = -1;
        for (int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < os ; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k = 0 ; k < is ; k++) {
                System.out.print(" ");
            }
            if(i > 0 && i < n-1) {
                System.out.print("*");
            }
            if(i < n / 2){
                os--;
                is += 2;
            } else {
                os++;
                is -= 2;
            }
            System.out.println();
        }
    }

    public static void pattern11 () {
        // Print the pattern:
        // Take n as an input
        // print n number of rows where number of * is = row number

        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int number = 1;
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j <= i ; j++) {
                System.out.print(number++ + " ");
            }
            System.out.println();
        }
    }

    public static void pattern12 () {
        // Print the pattern:
        // Take n as an input
        // print n number of rows every number belongs to the fibonacci series

        // 0
        // 1 1
        // 2 3 5
        // 8 13 21 34

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        for(int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j <= i ; j++) {
                System.out.print(a + " ");
                int result = a + b;
                a = b;
                b = result;

            }
            System.out.println();
        }
    }

    public static void pattern13 () {
        // Print the pattern:
        // Take n as an input
        // print n number of rows every number is icj (combination)

        // n = 6
        // 1
        // 1 1
        // 1 2 1
        // 1 3 3 1
        // 1 4 6 4 1
        // 1 5 10 10 5 1

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++) {
            int icj = 1;
            for (int j = 0 ; j <= i ; j++) {
                System.out.print(icj + " ");
                int icjp1 = icj * (i - j) / (j + 1);
                icj = icjp1;
            }
            System.out.println();
        }
    }

    public static void printTableOfN () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1 ; i <= 10 ; i++) {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }

}
