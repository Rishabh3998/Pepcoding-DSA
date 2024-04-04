package IntroStacks;

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
        st.pop();
        System.out.println(st);
    }
}
