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
        // Hence TLE (Time limit exceeded)
        // Computer can run 10 ^ 9 operations in 1 second
        // The below code is taking longer then that
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
        // We have given 2 numbers low and high we have to
        // print all the prime number exist between this range including low and high

        // Approach: Check for prime for every number between this range using the
        // isPrime optimised approach
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for(int i = low ; i <= high ; i++) {
            if(isPrimeWithInput(i)){
                System.out.println(i);
            }
        }
    }

    public static void printFirstNFibonacciNumbers () {
        // n is the given input
        // we have to print first n fibonacci numbers that can be generated

        // Theory:
        // F(0) = 0
        // F(1) = 1
        // F(2) = F(1) + F(0) = 1 + 0 = 1
        // F(3) = F(2) + F(1) = 1 + 1 = 2
        // F(4) = F(3) + F(2) = 2 + 1 = 3
        // .....
        // F(n) = F(n-1) + F(n-2)  (Generalised formula)

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int first = 0;
        int second = 1;
        for (int i = 0 ; i < n ; i++){
            System.out.println(first);
            int result = second + first;
            first = second;
            second = result;
        }

        // Here in the above code I am updating first and second local variables after every computation of result.
    }

    public static void countDigitsInNumber () {
        // We have a number we have to count number of digits present in that number
        // Example: 934562
        // The above number has 6 digits so output will be 6

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }

        System.out.println(count);
    }

    public static void printDigitsInNumber () {
        // We have a number we have to print individual digits present in that number
        // Example: 934562
        // The output of above number will be:
        // 9
        // 3
        // 4
        // 5
        // 6
        // 2

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Step 1 is to find count of the digits
        int count = 0;
        int temp = number;
        while (temp != 0){
            temp = temp / 10;
            count++;
        }

        // Step 2 is to divide the given number by divisor of first decimal place
        // then update the divisor by decimal places
        int div = (int)Math.pow(10, count - 1);
        while (div != 0) {
            // We used the condition div != 0 because if the input is 1000 then only 1 will be printed
            // because n will become 0 while loop terminates
            int quotient = number / div;
            System.out.println(quotient);
            number = number % div;
            div = div / 10;
        }
    }

    public static void printLastDigit () {
        // Here we have to print last digit of a given number in new line
        // Example: 9910
        // 0
        // 1
        // 9
        // 9
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while (number != 0){
            int lastDigit = number % 10;
            System.out.println(lastDigit);
            number = number / 10;
        }
    }

    public static void reverseNumber () {
        // Here we have to reverse the given number
        // Example: 9910
        // Output: 0199
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            // Adding 10 every time new number is generated
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }

        System.out.println(reverse);
    }

    public static void inverseOfNumber () {
        // We hava a number, we have to find its inverse
        // Assumption: if the range is 1 to 9 then the number will contain only digits between 1 and 9 included.
        // No duplicates will exist

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int place = 1;
        int inverse = 0;
        while (number != 0){
            int digit = number % 10;
            int id = place;
            int ip = digit;
            inverse = inverse + (id * (int)Math.pow(10, ip - 1));
            place++;
            number /= 10;
        }
        System.out.println(inverse);
    }
}
