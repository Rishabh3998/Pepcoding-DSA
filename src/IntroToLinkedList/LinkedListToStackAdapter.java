package IntroToLinkedList;

public class LinkedListToStackAdapter {
    public static class LLToStackAdapter {
        IntroLinkedList.LinkedList list;

        public LLToStackAdapter () {
            list = new IntroLinkedList.LinkedList();
        }

        public int size () {
            return list.size();
        }

        public void push (int val) {
            list.addFirst(val);
        }

        public int pop () {
            if (size() == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            int result = list.getFirst();
            list.removeFirst();
            return result;
        }

        public int top () {
            if(size() == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            return list.getFirst();
        }
    }
}
