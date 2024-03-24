package IntroToRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Recursion {
    static String[] keys = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
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

    public static ArrayList<String> getKeypadCombination (String str) {
        // Base case:
        if(str.isEmpty()) {
            ArrayList<String> baseArray = new ArrayList<String>();
            baseArray.add("");
            return baseArray;
        }
        // Step 1:
        // Take out the first character of the string passed as argument
        char ch = str.charAt(0);

        // Step 2:
        // Get the key set present for the passed string
        String keySet = keys[Character.getNumericValue(ch)];

        // Step 3:
        // To get the answer for the substring cut the substring out from the overall string
        String ros = str.substring(1);

        // Step 4:
        // Have faith in the logic and function that it will give the answer for the substring
        ArrayList<String> rosResult = getKeypadCombination(ros);

        // Step 5:
        // Create resultant list
        ArrayList<String> result = new ArrayList<>();

        // Step 6:
        // Loop through the key set
        for (int i = 0 ; i < keySet.length() ; i++) {
            // for each character of the key set
            char chr = keySet.charAt(i);
            for (String s : rosResult) {
                // concatenate the current answer of the substring with the current character of the key-set
                result.add(chr + s);
            }
        }
        return result;
    }

    public static ArrayList<String> getStairsPath (int n) {
        // Allowed jumps [1,2,3] from any stair
        if(n == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        if (n < 0) {
            return new ArrayList<>();
        }
        ArrayList<String> oneJump = getStairsPath(n-1);
        ArrayList<String> twoJump = getStairsPath(n-2);
        ArrayList<String> threeJump = getStairsPath(n-3);

        ArrayList<String> totalWays = new ArrayList<>();
        for (String first : oneJump) {
            totalWays.add("1" + first);
        }
        for (String second : twoJump) {
            totalWays.add("2" + second);
        }
        for (String third : threeJump) {
            totalWays.add("3" + third);
        }
        return totalWays;
    }

    public static ArrayList<String> getMazePaths (int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }

        ArrayList<String> allHorizontal = new ArrayList<String>();
        ArrayList<String> allVertical = new ArrayList<String>();

        if (sc < dc) {
             allHorizontal = getMazePaths(sr, sc + 1, dr, dc);
        }

        if (sr < dr) {
             allVertical = getMazePaths(sr + 1, sc, dr, dc);
        }

        ArrayList<String> result = new ArrayList<String>();
        for (String s : allHorizontal) {
            result.add("h" + s);
        }
        for (String s : allVertical) {
            result.add("v" + s);
        }

        return result;
    }

    public static ArrayList<String> getMazePathsWithJumps (int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> paths = new ArrayList<String>();

        // All horizontal moves/paths with jumps
        for (int h = 1 ; h <= dc - sc ; h++) {
            ArrayList<String> hPaths = getMazePathsWithJumps(sr, sc + h, dr, dc);
            for (String hPath : hPaths) {
                paths.add("h" + h + hPath);
            }
        }

        // All vertical moves/paths with jumps
        for (int v = 1 ; v <= dr - sr ; v++) {
            ArrayList<String> vPaths = getMazePathsWithJumps(sr + v, sc, dr, dc);
            for (String vPath : vPaths) {
                paths.add("v" + v + vPath);
            }
        }

        // All diagonal moves/paths with jumps
        for (int d = 1 ; d <= dr - sr && d <= dc - sc ; d++) {
            ArrayList<String> dPaths = getMazePathsWithJumps(sr + d, sc + d, dr, dc);
            for (String dPath : dPaths) {
                paths.add("d" + d + dPath);
            }
        }
        return paths;
    }
    public static void printSubsequence (String quesString, String ansString) {
        // When we try to find all the subsequences and at the end store them in ArrayList<String>
        // The total number of subsequences that can be formed can be calculated by 2 ^ n
        // 2 ^ n subsequences are there of a string
        // total number of pairs of these subsequences will be ( 2 ^ n ) / 2 pairs
        // each subsequence has n characters so total number of characters present in ArrayList
        // will be 2 ^ n - 1 * n characters

        // For 31 length string
        // 2 ^ 31 - 1 * 31 = ( 2 ^ 10 ) ^ 3 * 31 = 31 * 10 ^ 9 characters
        // 1 char = 1 byte => 31 * 10 ^ 9 bytes => 31GB (Result)

        // So due this large amount of space required to get subsequence we cannot store them before returning
        // But we can print them while creating a subsequence

        // Base case:
        if (quesString.isEmpty()) {
            System.out.println(ansString);
            return;
        }

        char ch = quesString.charAt(0);
        String roq = quesString.substring(1);

        printSubsequence(roq, ansString + ch);
        printSubsequence(roq, ansString + "_");
    }

    public static void printKeyPadCombination (String quesString, String ansString) {

        if (quesString.isEmpty()) {
            System.out.println(ansString);
            return;
        }

        char ch = quesString.charAt(0);
        String roq = quesString.substring(1);
        String keySets = keys[ch - '0'];

        for (int i = 0 ; i < keySets.length() ; i++) {
            char current = keySets.charAt(i);
            printKeyPadCombination(roq, ansString + current); // key-set will be added everytime
        }
    }

    public static void printStairPaths (int n , String path) {
        if(n == 0) {
            System.out.println(path);
            return;
        } else if (n < 0) {
            return;
        }
        for (int i = 1 ; i <= 3 ; i++) {
            printStairPaths(n - i, path + i);
        }
    }

    public static void printMazePaths (int sr, int sc, int dr, int dc, String path) {
        if (sr > dr || sc > dc) {
            return;
        }
        if (sr == dr && sc == dc) {
            System.out.println(path);
            return;
        }
        // all possible horizontal paths
        printMazePaths(sr + 1, sc, dr, dc, path + "h");
        // all possible vertical paths
        printMazePaths(sr, sc + 1, dr, dc, path + "v");
    }

    public static void printMazePathWithJumps (int sr, int sc, int dr, int dc, String path) {
        if(sr == dr && sc == dc) {
            System.out.print(path + " ");
            return;
        }

        // All horizontal moves/paths with jumps
        for (int h = 1 ; h <= dc - sc ; h++) {
            printMazePathWithJumps(sr, sc + h, dr, dc, path + "h" + h);
        }

        // All vertical moves/paths with jumps
        for (int v = 1 ; v <= dr - sr ; v++) {
            printMazePathWithJumps(sr + v, sc, dr, dc, path + "v" + v);
        }

        // All diagonal moves/paths with jumps
        for (int d = 1 ; d <= dr - sr && d <= dc - sc ; d++) {
            printMazePathWithJumps(sr + d, sc + d, dr, dc, path + "d" + d);
        }
    }

    public static void printPermutations (String ques, String ans) {
        // number of permutations =  n! (n => length of string)
        // Total number of permutations for string with 3 length =  3! = 3*2*1 = 6
        // Example:
        // Input: abc
        // Output:
        // abc, bac, cab, acb, bca, cba

        if(ques.isEmpty()){
            System.out.println(ans);
            return;
        }

        for (int i = 0 ; i < ques.length() ; i++) {
            char ch = ques.charAt(i);
            String roq = ques.replace(Character.toString(ch) , "");
            printPermutations(roq, ans + ch);
        }
    }
}
