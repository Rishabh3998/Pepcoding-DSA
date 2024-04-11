package IntroStacks;

import java.util.Scanner;
import java.util.Stack;

public class Stacks {
    // Stack Data structure follows a discipline LIFO (last in first out)
    // Here we have some utility function
    // Push => add an element in the stack
    // Pop => Remove an element from a stack
    // Peek => View/Get an element from a stack
    // These utilities will execute on the top element or top level of the stack.

    // Internal Stack

    public static void myStack () {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println("size " + st.size());
        st.pop();
        System.out.println(st);
    }

    public static void duplicateBrackets () {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for (int i = 0 ; i < str.length() ; i++) {
            char c = str.charAt(i);
            if (c == ')') {
                if (st.peek() == '(') {
                    System.out.println("true");
                    return;
                } else {
                    while (st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            } else {
               st.push(c);
            }
        }
        System.out.println("false");
    }

    public static void balancedBrackets () {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();
        for (int i = 0 ; i < str.length() ; i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
               st.push(c);
            } else if (c == ')') {
                if (st.isEmpty()) {
                    System.out.println("false");
                    return;
                } else if (st.peek() != '(' ) {
                    System.out.println("false");
                    return;
                } else {
                    st.pop();
                }
            }  else if (c == '}') {
                if (st.isEmpty()) {
                    System.out.println("false");
                    return;
                } else if (st.peek() != '{' ) {
                    System.out.println("false");
                    return;
                } else {
                    st.pop();
                }
            }  else if (c == ']') {
                if (st.isEmpty()) {
                    System.out.println("false");
                    return;
                } else if (st.peek() != '[' ) {
                    System.out.println("false");
                    return;
                } else {
                    st.pop();
                }
            } else {

            }
        }

        if (st.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static int[] nextGreaterElement () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // size of array
        int[] arr = new int[n];

        int[] res = new int[n];

        Stack<Integer> st = new Stack<>();
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        st.push(arr[arr.length - 1]);
        res[arr.length - 1] = -1;

        for (int i = arr.length - 2 ; i >= 0 ; i--) {
            while (!st.isEmpty() && arr[i] >= st.peek()) {
                st.pop();
            }

            if(st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }

        return res;
    }
}
