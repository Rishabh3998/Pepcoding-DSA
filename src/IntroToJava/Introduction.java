package IntroToJava;
import java.util.Scanner;

public class Introduction {
    public static void printOutput () {
        // How to print output in java
        System.out.println("Print with a new line");
        System.out.print("Print without new line");
    }

    public static void printStartPattern () {
        System.out.println();
        System.out.println("Print a simpler star pattern"); // used for new line
        System.out.print("*\n**\n***\n****\n*****\n");
    }

    public static void printZPattern () {
        // Printing Z pattern
        System.out.println("Print a Z pattern"); // used for new line
        System.out.print("*****\n   *\n  *\n *\n*****\n");
    }

    public static void printDataTypesInJava () {
        // Integral data types
        byte age = 100;
        short age2 = 100;
        int age3 = 100;
        long age4 = 10000000000L; // L suffix is added in the literal to make it long data type by default it is int.

        // Decimal data types
        float price = 60.98f; // f suffix is added in the literal to make it float data type by default it is in double.
        double price2 = 60.98;

        // Character data type
        char character = 'A';

        // String class is used to employ string in code
        String string = "Rishabh";

        // Boolean data type
        boolean isTrue = true;

        System.out.println("byte: " + age);
        System.out.println("short: " + age2);
        System.out.println("int: " + age3);
        System.out.println("long: " + age4);
        System.out.println("float: " + price);
        System.out.println("decimal: " + price2);
        System.out.println("character: " + character);
        System.out.println("string: " + string);
        System.out.println("boolean: " + isTrue);

        // Variables are the containers that store a type of data according to the data type assigned to that variable.
    }

    public static void printArithmeticOperations () {
        int x = 10;
        int y = 20;

        // Sum
        int sum = x + y;

        // Product
        int product = x * y;

        // Divide
        int divide = y / x; // Will return quotient

        // Modulus
        int remainder = x % y; // Will return remainder after division

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Division: " + divide);
        System.out.println("Modulus: " + remainder);

        // The order of calculation runs according to the priority order of operation from left to right
        // Computer does not follow BODMAS

        // * / % (left side priority is > then right) + -

        int expression = x * y / x + y; // 40
        int expression2 = (x * y) / (x + y); // 6 uses BODMAS

        System.out.println("Expression: " + expression);
        System.out.println("Expression2: " + expression2);
    }

    public static void printAccordingToConditions () {
        int x = 10;
        int y = 11;

        // if else chain
        if(y % 2 == 0){
            // check for even or odd
            System.out.println("x is even");
        } else {
            System.out.println("x is odd");
        }

        int num1 = 10;
        int num2 = 20;

        // if else chain
        if(num1 == num2) {
            System.out.println("Equal");
        }
        else {
            if(num1 > num2) {
                System.out.println("num1 is greater");
            } else {
                System.out.println("num2 is greater");
            }
        }

        int num11 = 10;
        int num21 = 20;

        // if else-if else chain
        if(num11 == num21) {
            System.out.println("Equal");
        }
        else if(num11 > num21) {
            System.out.println("num11 is greater");

        }
        else {
            System.out.println("num21 is greater");
        }
    }

    public static void gradingSystem () {
        // Used Scanner class to take input from the user.
        Scanner sc = new Scanner(System.in);
        int studentMarks = sc.nextInt();

        if(studentMarks > 90) {
            System.out.println("Excellent");
        }
        else if (studentMarks > 80 && studentMarks <= 90) {
            System.out.println("Good");
        }
        else if (studentMarks > 70 && studentMarks <= 80) {
            System.out.println("Fair");
        }
        else if (studentMarks > 60 && studentMarks <= 70) {
            System.out.println("Meets expectations");
        }
        else {
            System.out.println("Below par");
        }
    }

    public static void looping () {
        // To perform some set of operations multiple times we use loops.
        // We have 3 basic types of loops

        // 1. For loop
        // 2. While loop
        // 3. Do-while loop

        // While loop
        // Print 1 to 9
        int i = 1;
        while (i <= 9){
            System.out.println(i);
            i++;
        }

        // For loop
        // Print 0 to 9
        for (int j = 0 ; j < 10 ; j++){
            System.out.println(j);
        }

        // Do-while loop
        // Here we can see that condition is not meeting still the k will print as 6 first time then loop will break
        // Do while runs minimum 1 time.
        int k = 6;
        do {
            System.out.println(k);
            k++;
        }while (k <= 5);

    }

    public static void printEnteredName () {
        // Suppose we need to take 2 inputs
        // 1. Number
        // 2. String

        // So if we use sc.nextInt();
        // It will not take the input correctly

        // To solve this problem we have to take the number as string
        // then convert it to Number

        Scanner num = new Scanner(System.in);
        int number = Integer.parseInt(num.nextLine());
        System.out.println(number);

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
