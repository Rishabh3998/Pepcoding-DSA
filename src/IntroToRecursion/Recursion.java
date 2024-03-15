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
        return x * findXRaiseToN(x, n-1);
    }
}
