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

    public static void spanOfArray () {
        // span = maximum value in array - minimum value in array
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0 ; i < arr.length ; i++) {
            // Find max
            if(arr[i] > max) {
                max = arr[i];
            }
            // Find min
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        int span = max - min;
        System.out.println(span);
    }

    public static void findElement () {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        int element = sc.nextInt();
        int foundIndex = -1;
        for (int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == element) {
                foundIndex = i;
                break;
            }
        }

        System.out.println(foundIndex);
    }

    public static void barChart () {
        //        5 (array size)
        //        3 1 0 7 5  (array)
        //        Bar Pattern:

        //            *
        //            *
        //            * *
        //            * *
        //        *   * *
        //        *   * *
        //        * * * *

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        // Find max (Topmost level of bar)
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length ; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        // Print according to levels of bar
        for(int i = 0 ; i < max ; i++) {
            for (int j = 0 ; j < size ; j++) {
                if(i >= max - arr[j]){
                    // This condition is important:
                    // * will only be there if max - arr[j] <= i
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
