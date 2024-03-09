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

    public static void sumOfArrays () {
        Scanner sc = new Scanner(System.in);

        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for(int i = 0 ; i < size1 ; i++) {
            arr1[i] = sc.nextInt();
        }

        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for(int i = 0 ; i < size2 ; i++) {
            arr2[i] = sc.nextInt();
        }

        int p1 = arr1.length - 1;
        int p2 = arr2.length - 1;

        int maxSize = Math.max(size1, size2);
        int carry = 0;
        int[] result = new int[maxSize];

        int p3 = result.length - 1;

        while (p3 >= 0) {
            int d = carry;
            if(p1 >= 0) {
                d += arr1[p1];
            }
            if(p2 >= 0) {
                d += arr2[p2];
            }
            carry = d / 10;
            d = d % 10;

            result[p3] = d;

            p3--;
            p2--;
            p1--;
        }

        if(carry != 0) {
            System.out.println(carry);
        }

        for (int val : result) {
            System.out.println(val);
        }
    }

    public static void differenceOfArrays () {
        Scanner sc = new Scanner(System.in);

        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for(int i = 0 ; i < size1 ; i++) {
            arr1[i] = sc.nextInt();
        }

        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for(int i = 0 ; i < size2 ; i++) {
            arr2[i] = sc.nextInt();
        }

        int maxSize = Math.max(size1, size2);
        int[] result = new int[maxSize];
        int carry = 0;

        int p1 = arr1.length - 1;
        int p2 = arr2.length - 1;
        int p3 = result.length - 1;

        while (p3 >= 0) {
            int d = 0;
            int a1v = p1 >= 0 ? arr1[p1] : 0;

            if(arr2[p2] + carry >= a1v) {
                d = arr2[p2] + carry - a1v;
                carry = 0;
            } else {
                d = arr2[p2] + carry + 10 - a1v;
                carry = -1;
            }

            result[p3] = d;
            p1--;
            p2--;
            p3--;
        }

        int idx = 0;
        while (idx < result.length) {
            if(result[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }

        while (idx < result.length) {
            System.out.println(result[idx]);
            idx++;
        }
    }

    public static void reverseArray () {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0 ; i < size ; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;
        int j = size - 1;

        while(i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void arrayInverse () {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0 ; i < size ; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[size];
        for(int i = 0 ; i < arr.length ; i++) {
            result[arr[i]] = i;
        }

        for (int val : result){
            System.out.print(val + " ");
        }
    }
}
