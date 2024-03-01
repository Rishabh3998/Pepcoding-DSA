package Basics;
import java.util.Scanner;

public class AdhocProblems {
    public static void isPrimeNumber () {
        // Check whether a given number is prime or not.
        // Get t test cases
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        // HINT: 10^9 operations can run in 1 sec

        // Approach 1: We are checking divisibility of entered number for every possible divisor here
        // Time complexity: O(testCases * number) = O(n^2)
        // Hence TLE
        //        for (int i = 0 ; i < testCases ; i++){
        //            int number = sc.nextInt();
        //
        //            boolean isPrime = true;
        //            for (int j = 2 ; j < number ; j++){
        //                if (number % j == 0){
        //                    isPrime = false;
        //                    break;
        //                }
        //            }
        //            if(isPrime) {
        //                System.out.println("prime");
        //            } else {
        //                System.out.println("not prime");
        //            }
        //        }

        // Approach 2: Check if the factor exist between 2 to sqrt(number)
        // Factors of 24:
        // 1 x 24
        // 2 x 12
        // 3 x 8
        // 4 x 6
        // 6 x 4
        // 8 x 3
        // 12 x 2
        // 24 x 1

        // We can observe here that after (total number of factors) / 2 factors repeats itself.
        // We don't need to check the second half of factors we can only check till sqrt(number)

        for (int i = 0 ; i < testCases ; i++){
            int number = sc.nextInt();

            boolean isPrime = true;
            for (int j = 2 ; j <= Math.sqrt(number) ; j++){
                if (number % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }

    public static boolean isPrimeWithInput(int number) {
        boolean isPrime = true;
        for (int j = 2 ; j <= Math.sqrt(number) ; j++){
            if (number % j == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void printAllPrimeTillN () {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for(int i = low ; i <= high ; i++) {
            if(isPrimeWithInput(i)){
                System.out.println(i);
            }
        }
    }
}
