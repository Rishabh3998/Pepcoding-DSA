package IntroToArrays;

import java.util.Scanner;

public class Arrays {
    public static void arrayDeclaration () {
        int [] arr ; // Declaration
        arr = new int[5]; // Assignment

        int [] arr2 = new int[5]; // Declaration + Assignment

        arr[0] = 10;
        arr2[0] = 20;

        System.out.println(arr[0] + " " + arr2[0]);
    }

    public static void arrayPrintingWithInjectingInput () {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0 ; i < arr.length ; i++) {
            int input = sc.nextInt();
            arr[i] = input;
        }

        for (int i = 0 ; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void shallowCopy () {
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;

        int[] two = one; // This line will copy the address of one into two
        two[1] = 200; // This change will be done in both array variables because both are pointing to same array in heap.

        for (int i = 0 ; i < one.length ; i++) {
            System.out.print(one[i] + " ");
        }

        System.out.println();

        for (int i = 0 ; i < two.length ; i++) {
            System.out.print(two[i] + " ");
        }
    }

    public static void deepCopy () {
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;

        int[] two = new int[3]; // This line will create a new array in two array variable
        // two[0] and two[2] will contain 0 as default value
        two[1] = 200; // This change will be done in both array variables because both are pointing to same array in heap.

        for (int i = 0 ; i < one.length ; i++) {
            System.out.print(one[i] + " ");
        }

        System.out.println();

        for (int i = 0 ; i < two.length ; i++) {
            System.out.print(two[i] + " ");
        }
    }

    public static void swap (int[] arr, int i, int j) {
        // In C++ we need to add & to pass arguments as passed by reference else it will take them by value.
        // But in Java this is not required.
        // Because arguments are by-default passed by reference
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
