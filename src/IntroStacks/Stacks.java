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
}
