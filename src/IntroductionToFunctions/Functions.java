package IntroductionToFunctions;

import java.util.Scanner;

public class Functions {
    // Functions helps to maintain the code by using DRY principle.
    public static int factorial (int number) {
        int res = 1;
        for(int i = 1 ; i <= number ; i++) {
            res *= i;
        }
        return res;
    }

    public static int nPr (int n, int r) {
        // Formula of nPr: n! / (n-r)!

        int nfact = factorial(n);
        int nmrfact = factorial(n-r);
        return nfact / nmrfact;
    }

    public static int digitFrequency () {
        // Find the frequency of a digit present in the given number
        // Eg: number: 994543234, digit: 4
        // O/P: 3

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digit = sc.nextInt();

        int count = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            if(lastDigit == digit){
                count++;
            }
            number /= 10;
        }

        return count;
    }
}
