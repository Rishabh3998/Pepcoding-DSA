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
}
