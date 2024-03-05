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

    public static void rotateNumber () {
        // We have a number, and we have to rotate it by the given number of rotation steps
        // Every step take the last number and put it in the first place

        // Example: 23457
        // steps: 2
        // Output: 57234

        Scanner sc = new Scanner(System.in);
        int number  = sc.nextInt();
        int steps = sc.nextInt();

        int temp = number;
        int countDigits = 0;
        while(temp != 0){
            temp = temp / 10;
            countDigits++;
        }

        // Here in the below step we are refactoring the input step if it is too large because
        // eventually when steps get equal to the number of digit we will get the same number
        // Therefore the multiple of number of digit will give the same number
        // The number of rotation step = input steps % number of digits
        steps = steps % countDigits;

        // If the input is negative we will refactor the step again because the logic is same just change of direction
        // is there. Eg: n = 12345, k = -2, o/p: 34512 which is similar to rotate the number by k = 3
        // -ve steps + number of digits
        if(steps < 0) {
            steps += countDigits;
        }

        int div = 1;
        int mul = 1;
        // The below step is creating divisor and multiplier
        // 12345, k = 2 => 2 will take the last 2 digit out, to take them out we need to take out the remainder
        // of n which will be done by divisor. Now to add that last 2 digit in front we need to multiply it by the
        // multiplier with same zeros having rest of the number input, i.e. countDigits - steps : 5 - 2 = 3
        for (int i = 0 ; i < countDigits ; i++) {
            if(i <= steps) {
                div = div * 10;
            } else {
                mul = mul * 10;
            }
        }

        int q = number / div;
        int r = number % div;

        int rotatingNumber = (r * mul) + q;
        System.out.println(rotatingNumber);
    }

    public static void gcdAndLcm () {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int on1 = num1;
        int on2 = num2;

        while (num1 % num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }

        int gcd = num2;
        int lcm = (on1 * on2) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }

    public static void printPrimeFactors () {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int factor = 2 ; factor * factor <= number ; factor++){
            while (number % factor == 0) {
                number = number / factor;
                System.out.print(factor + " ");
            }
        }

        // This is the specific case
        // Here to we are just checking if number != 1 and loop ends then this number is also a prime factor itself
        if(number != 1){
            System.out.print(number);
        }
    }

    public static void pythagoreanTriplet () {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Integer.max(a,b);
        if (c > max){
          max = c;
        }

        // here we are just checking if the formula is true or not
        // P^2 + b^2 = h^2
        if (max == a){
            boolean flag = (b*b + c*c) == a*a;
            System.out.println(flag);
        } else if (max == b) {
            boolean flag = (a*a + c*c) == b*b;
            System.out.println(flag);
        } else {
            boolean flag = (b*b + a*a) == c*c;
            System.out.println(flag);
        }

    }
}
