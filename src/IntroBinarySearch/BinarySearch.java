package IntroBinarySearch;
import java.util.Scanner;

public class BinarySearch {
    // Binary search is a search algorithm
    // which search an element in O(logN) time

    // Indication of binary search
    // 1. Elements in array should be sorted
    // 2. Problem is related to find some element.

    // In linear search we traverse in whole array irrespective of the element present inside the data or not.
    // We have to do N comparisons in the array n = no. of element
    // This takes O(N) time. If element is not present we still traverse the whole array.
    // Binary search is an optimized approach where we only find the element in its effective range.
    // We have to do N/2 comparisons in the array.
    // we short the span of searching in every iteration by half.
    // We try to find the element in the range [low, ..., element, ...., high]

    // Time complexity: O(logN)

    public static void implementation () {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0 ; i < size ; i++) {
            arr[i] = sc.nextInt();
        }

        int element = sc.nextInt();

        int low = 0, high = size - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == element) {
                System.out.print(mid);
                return;
            }
            else if(arr[mid] < element) {
                low = mid + 1;
            } else if (arr[mid] > element) {
                high = mid - 1;
            }
        }

        System.out.print(-1);
    }

    public static void ceilAndFloor () {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0 ; i < size ; i++) {
            arr[i] = sc.nextInt();
        }

        int element = sc.nextInt();

        int low = 0, high = size - 1;
        int ceil = 0, floor = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == element) {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
            else if(arr[mid] < element) {
                low = mid + 1;
                floor = arr[mid];
            } else if (arr[mid] > element) {
                high = mid - 1;
                ceil = arr[mid];
            }
        }

        System.out.print("Floor value: " + floor + ", " + "Ceil value: " + ceil);
    }

    public static void firstAndLastIndex () {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0 ; i < size ; i++) {
            arr[i] = sc.nextInt();
        }

        int element = sc.nextInt();
        int low = 0, high = size - 1;
        int li = 0;

        while (low <= high) {
            int mid = (low + high ) / 2;
            if (arr[mid] == element) {
                li = mid;
                low = mid + 1;
            } else if (arr[mid] <  element) {
                low = mid + 1;
            } else if (arr[mid] > element) {
                high = mid - 1;
            }
        }

        low = 0;
        high = size - 1;
        int fi = 0;

        while (low <= high) {
            int mid = (low + high ) / 2;
            if (arr[mid] == element) {
                fi = mid;
                high = mid - 1;
            } else if (arr[mid] <  element) {
                low = mid + 1;
            } else if (arr[mid] > element) {
                high = mid - 1;
            }
        }

        System.out.println("First index: " + arr[fi] + " " + fi);
        System.out.println("Last index: " + arr[li] + " " + li);
    }
}
