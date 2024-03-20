import Intro2DArrays.Arrays2D;
import IntroBinarySearch.BinarySearch;
import IntroNumberSystem.NumberSystem;
import IntroToArrayList.IntroArrayList;
import IntroToJava.Introduction;
import Basics.AdhocProblems;
import IntroToRecursion.Recursion;
import IntroToStrings.IntroStrings;
import IntroductionToFunctions.Functions;
import IntroToArrays.Arrays;
import Patterns.PatternsPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //        ----Introduction to Java----
        //        Introduction.printOutput();
        //        Introduction.printStarPattern();
        //        Introduction.printZPattern();
        //        Introduction.printDataTypesInJava();
        //        Introduction.printArithmeticOperations();
        //        Introduction.printAccordingToConditions();
        //        Introduction.gradingSystem();
        //        Introduction.looping();
        //        Introduction.printEnteredName();

        //        ----Basic Adhoc problems----
        //        AdhocProblems.isPrimeNumber();
        //        AdhocProblems.printAllPrimeTillN();
        //        AdhocProblems.printFirstNFibonacciNumbers();
        //        AdhocProblems.countDigitsInNumber();
        //        AdhocProblems.printDigitsInNumber();
        //        AdhocProblems.printLastDigit();
        //        AdhocProblems.reverseNumber();
        //        AdhocProblems.inverseOfNumber();
        //        AdhocProblems.rotateNumber();
        //        AdhocProblems.gcdAndLcm();
        //        AdhocProblems.printPrimeFactors();
        //        AdhocProblems.pythagoreanTriplet();

        //        ----Patterns practice----
        //        PatternsPractice.pattern1();
        //        PatternsPractice.pattern2();
        //        PatternsPractice.pattern3();
        //        PatternsPractice.pattern4();
        //        PatternsPractice.pattern5();
        //        PatternsPractice.pattern6();
        //        PatternsPractice.pattern7();
        //        PatternsPractice.pattern8();
        //        PatternsPractice.pattern9();
        //        PatternsPractice.pattern10();
        //        PatternsPractice.pattern11();
        //        PatternsPractice.pattern12();
        //        PatternsPractice.pattern13();
        //        PatternsPractice.printTableOfN();

        //        ----Functions practice----
        //        Scanner sc = new Scanner(System.in);
        //        int n = sc.nextInt();
        //        int r = sc.nextInt();
        //        int res = Functions.nPr(n, r);
        //        System.out.println(n + "P" + r + " = " + res);

        //        int frequency = Functions.digitFrequency();
        //        System.out.println(frequency);

        //        ----Number System----
        //        int converted = NumberSystem.decimalToAnyBase();
        //        System.out.println(converted);
        //        int converted = NumberSystem.anyBaseToDecimal();
        //        System.out.println(converted);f
        //        int converted = NumberSystem.anyBaseToBase();
        //        System.out.println(converted);
        //        int converted = NumberSystem.anyBaseAddition();
        //        System.out.println(converted);
        //        int converted = NumberSystem.anyBaseSubtraction();
        //        System.out.println(converted);
        //        int converted = NumberSystem.anyBaseMultiplication();
        //        System.out.println(converted);

        //        ----Introduction to Arrays----
        //        Arrays.arrayDeclaration();
        //        Arrays.arrayPrintingWithInjectingInput();
        //        Arrays.shallowCopy();
        //        Arrays.deepCopy();
        //        Arrays.spanOfArray();
        //        Arrays.findElement();
        //        Arrays.barChart();
        //        Arrays.sumOfArrays();
        //        Arrays.differenceOfArrays();
        //        Arrays.reverseArray();
        //        Arrays.arrayInverse();
        //        Arrays.rotateArray();
        //        Arrays.subArrays();
        //        Arrays.subSets();

        //        ----Introduction to Binary search----
        //        BinarySearch.implementation();
        //        BinarySearch.ceilAndFloor();
        //        BinarySearch.firstAndLastIndex();

        //        ----Intro to 2D Array----
        //        Arrays2D.display2DArray();
        //        Arrays2D.matrixMultiplication();
        //        Arrays2D.waveTraversal();

        //        ----Intro to Recursion----
        //        Scanner sc = new Scanner(System.in);
        //        int x = sc.nextInt();
        //        int n = sc.nextInt();

        //        int[] arr = new int[11];
        //        for (int i = 0 ; i < 11 ; i++) {
        //            arr[i] = sc.nextInt();
        //        }

        //        Recursion.printDecreasing(n);
        //        Recursion.printIncreasing(n);
        //        Recursion.printDecreasingIncreasing(n);
        //        int result = Recursion.findFactorial(n);
        //        int result = Recursion.findXRaiseToN(x, n);
        //        System.out.println(result);
        //        Recursion.printUpperAndLowerPartRecursion(n);
        //        Recursion.towerOfHanoi(n, 'A', 'B', 'C');
        //        Recursion.printArray(arr, 0);
        //        Recursion.printArrayInReverseOrder(arr, arr.length - 1);
        //        int result = Recursion.maxOfArray(arr, 0);
        //        int result = Recursion.firstIndex(arr, 10, 0);
        //        int result = Recursion.lastIndex(arr, 45, 0);
        //        int[] result = Recursion.allIndicesOfElement(arr, 10, 0, 0);
        //        ArrayList<String> result = Recursion.getSubsequence("abc");
        //        System.out.println(result);
        //        for (int val : result) {
        //            System.out.println(val);
        //        }
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> words = Recursion.getKeypadCombination(str);
        System.out.println(words);

        //        ----Intro to strings----
        //        IntroStrings.stringIntroduction();

        //        ----Intro to ArrayList----
        //        IntroArrayList.ArrayListIntroduction();
    }
}