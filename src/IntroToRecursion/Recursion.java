package IntroToRecursion;

import java.util.Scanner;

public class Recursion {
    public static void printDecreasing (int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }

    public static void printIncreasing (int n) {
        if(n == 0) {
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }

    public static void printDecreasingIncreasing (int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printDecreasingIncreasing(n - 1);
        System.out.println(n);
    }

    public static int findFactorial (int n) {
        if(n == 0) {
            return 1;
        }
        return n * findFactorial(n-1);
    }

    public static int findXRaiseToN (int x, int n) {
        if(n == 0) {
            return 1;
        }

        // Approach 1:
        // x ^ n = x * x ^ n - 1
        // int result = x * findXRaiseToN(x, n-1);

        // Approach 2:
        // x ^ n = x ^ n / 2 * x ^ n / 2
        int result = findXRaiseToN(x, n / 2) * findXRaiseToN(x, n / 2);
        if(n % 2 == 0) {
            return result;
        } else {
            return x * result;
        }
    }

    public static void printUpperAndLowerPartRecursion (int n) {
        if(n == 0) {
            return;
        }
        System.out.println("Pre" + n);
        printUpperAndLowerPartRecursion(n - 1);
        System.out.println("In" + n);
        printUpperAndLowerPartRecursion(n - 1);
        System.out.println("Post" + n);
    }

    public static void towerOfHanoi (int n, char t1, char t2, char t3) {
        if(n == 0) {
            return;
        }
        towerOfHanoi(n-1, t1, t3, t2);
        System.out.println(n + "[" + t1 + "->" + t2 + "]");
        towerOfHanoi(n-1, t3, t2, t1);
    }
}
