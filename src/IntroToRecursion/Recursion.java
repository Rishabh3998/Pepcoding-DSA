package IntroToRecursion;

import java.util.ArrayList;
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

    public static void printArray (int[] arr, int index) {
        if (index == arr.length) {
           return;
        }
        System.out.println(arr[index]);
        printArray(arr, index + 1);
    }

    public static void printArrayInReverseOrder (int[] arr, int index) {
        if(index < 0) {
            return;
        }
        System.out.println(arr[index]);
        printArrayInReverseOrder(arr, index - 1);
    }

    public static int maxOfArray (int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int max = maxOfArray(arr, index + 1);
        if (arr[index] > max) {
            return arr[index];
        } else {
            return max;
        }
    }

    public static int firstIndex (int[] arr, int data, int index) {
        if(index == arr.length - 1) {
            if (arr[index] == data) {
                return index;
            } else {
                return -1;
            }
        }
        int fi = firstIndex(arr, data, index + 1);
        if(arr[index] == data) {
            return index;
        } else {
            return fi;
        }
    }

    public static int lastIndex (int[] arr, int data, int index) {
        if(index == arr.length - 1) {
            if (arr[index] == data) {
                return index;
            } else {
                return -1;
            }
        }
        int li = lastIndex(arr, data, index + 1);
        if (li == -1) {
            if(arr[index] == data) {
                return index;
            } else {
                return li;
            }
        }
        return li;
    }

    public static int[] allIndicesOfElement (int[] arr, int data, int index, int fsf) {
        if (index == arr.length) {
            return new int[fsf];
        }
        if (arr[index] == data) {
            int[] iArr = allIndicesOfElement(arr, data, index + 1, fsf + 1);
            iArr[fsf] = index;
            return iArr;
        } else {
            int[] iArr = allIndicesOfElement(arr, data, index + 1, fsf);
            return iArr;
        }
    }

    // We generally use recursion when we have to make a decision, whether to include an entity or not
    // Every entity has 2 choice yes or no
    // Example:
    // Subsequence: 2 ^ n (total number of subsequence of a string)
    // n represent the size/length of the given string

    // Input: "abc"
    // Output:
    // _ _ _
    // _ _ c
    // _ b _
    // _ b c
    // a _ _
    // a _ c
    // a b _
    // a b c

    // Substring: (n * (n + 1)) / 2 (We can calculate total number of substring using this method)
    // n represent the size/length of the given string

    // Input: "abc"
    // Output:
    // a
    // ab
    // abc
    // b
    // bc
    // c

    public static ArrayList<String> getSubsequence (String str) {
        // Base case:
        if(str.isEmpty()) {
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }
        // Step 1:
        // Get first character 'a'
        char ch = str.charAt(0);

        // Step 2:
        // Get string without this first character
        String ros = str.substring(1); // [1, end]

        // Step 3:
        // Get the subsequences of rest of the string
        ArrayList<String> rest = getSubsequence(ros);

        ArrayList<String> mRes = new ArrayList<>();
        for (String s : rest) {
            mRes.add("_" + s);
            mRes.add(ch + s);
        }

        return mRes;
    }
}
