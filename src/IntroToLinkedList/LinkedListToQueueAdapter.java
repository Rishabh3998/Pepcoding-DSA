package IntroToLinkedList;

public class LinkedListToQueueAdapter {
    public static class LLToQueueAdapter {
        IntroLinkedList.LinkedList list;

        public LLToQueueAdapter () {
            list = new IntroLinkedList.LinkedList();
        }

        public int size () {
            return list.size();
        }

        public void add (int val) {
            list.addLast(val);
        }

        public int remove () {
            if (size() == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = list.getFirst();
            list.removeFirst();
            return result;
        }

        public int peek () {
            if(size() == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return list.getFirst();
        }
    }
}
