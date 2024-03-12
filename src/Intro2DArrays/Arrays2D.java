package Intro2DArrays;

import java.util.Scanner;

public class Arrays2D {
    public static void display2DArray () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Display
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = 0 ; j < arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void matrixMultiplication () {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] arr1 = new int[r1][c1];
        for (int i = 0 ; i < arr1.length ; i++) {
            for (int j = 0 ; j < arr1[0].length ; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] arr2 = new int[r2][c2];
        for (int i = 0 ; i < arr2.length ; i++) {
            for (int j = 0 ; j < arr2[0].length ; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // To multiply the matrix this condition must be followed:
        // 1. c1 should = r2
        if(c1 != r2) {
            System.out.println("Invalid input");
            return;
        }

        // The product array dimension will be r1 x c2
        int[][] product = new int[r1][c2];

        // product[i][j] = arr1[row will be same][column will change] * arr2[row will change][column will be same]
        for (int i = 0 ; i < product.length ; i++) {
            for (int j = 0 ; j < product[i].length ; j++) {
                for (int k = 0 ; k < c1 ; k++) {
                    product[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        // Display
        for (int i = 0 ; i < product.length ; i++) {
            for (int j = 0 ; j < product[0].length ; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void waveTraversal () {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        for (int i = 0 ; i < r ; i++) {
            for (int j = 0 ; j < c ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Wave traversal
        // Columns are always increasing i.e. i
        // Rows are increasing when j is even and decreasing when j is odd
        for (int j = 0 ; j < arr[0].length ; j++) {
            if(j % 2 == 0) {
                for (int i = 0 ; i < arr.length  ; i++ ) {
                    System.out.println(arr[i][j] + " ");
                }
            } else {
                for (int i = arr.length - 1 ; i >= 0 ; i-- ) {
                    System.out.println(arr[i][j] + " ");
                }
            }
        }
    }
}
