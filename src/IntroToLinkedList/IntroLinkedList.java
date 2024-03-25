package IntroToLinkedList;

public class IntroLinkedList {
    // Let's compare linked list with array
    // and then see what are the key differences which produces some pros and cons

    // suppose we need to create an array

    // int[] arr = new int[10]
    // here we create an array of size 10 where each cell contains 4 byte because int takes 4 bytes
    // so as we know, to form an array it requires a contiguous space of memory in heap the
    // array address will be stored in stack memory but if there is no contiguous space
    // is there the array will not create.

    // heap: |---allocated---|---20byte----|-----allocated----|----20byte----|
    // In the above heap memory 40 byte are present but not in contiguous order. so no array will be formed.

    // But if we try to create a linked list which needs 40 byte as well it can be created easily because
    // it does not require continuous space all the nodes can be formed anywhere in the memory
    // it requires 2 things in the node |data-value (4 byte) |next-node-address (4)|  (8 byte) (Singly-linked-list)

    // heap: |---allocated---|---node 1 (value | address of node 2)---|----allocated----|---node 2 (value | address of node 3)---|
    // head address of the linkedList will be present in the stack
    // last node (value | null)

    public static class Node {
        // Data present in a node
        int data;
        // Address of the next node
        Node next;
    }

    public static class LinkedList {
        // Address of the head node
        Node head;
        // Address of the tail node
        Node tail;
        // Size of the linked-list
        int size;

        // Add a node in the last of the linked list
        public void addLast (int val) {
            //  if(size == 0) {
            //      // create new node
            //      Node temp = new Node();
            //      // Add value in temp data field
            //      temp.data = val;
            //      // Add null in the temp next field
            //      temp.next = null;
            //      // Initialize head, tail with the newly created temp node
            //      head = tail = temp;
            //      // increase size
            //      size++;
            //  } else {
            //      // create a new node
            //      Node temp = new Node();
            //      // Add value in temp data field
            //      temp.data = val;
            //      // Add null in temp next field
            //      temp.next = null;
            //      // Modify last tail node next with this new temp node
            //      tail.next = temp;
            //      // Modify last tail node with this new temp node
            //      tail = temp;
            //      // Increase size
            //      size++;
            // }

            // Above code Modification to cleaner code
            // create new node
            Node temp = new Node();
            // Add value in temp data field
            temp.data = val;
            // Add null in the temp next field
            temp.next = null;

            if (size == 0) {
                // Initialize head, tail with the newly created temp node
                head = tail = temp;
            } else {
                // Modify last tail node next with this new temp node
                tail.next = temp;
                // Modify last tail node with this new temp node
                tail = temp;
            }

            // increase size
            size++;
        }

        public int size () {
            return size;
        }

        public void display () {
            // using for loop
            // for (Node temp = head ; temp != null ; temp = temp.next) {
            //    System.out.println(temp.data);
            // }

            // using while loop
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        public void removeFirst () {
            if (size == 0) {
                System.out.println("Empty list");
            }
            else if (size == 1) {
                head = tail = null;
                size = 0;
            }
            else {
                // create a temp pointer
                Node temp = new Node();
                // point temp on head
                temp = head;
                // head = head.next
                head = head.next;
                // temp.next = null
                temp.next = null;
                // reduce size
                size--;
            }
        }

        public int getFirst () {
            if(size == 0) {
                System.out.println("List is empty");
                return -1;
            }
            return head.data;
        }

        public int getLast () {
            if(size == 0) {
                System.out.println("List is empty");
                return -1;
            }
            return tail.data;
        }

        public int getAt (int index) {
            if(size == 0) {
                System.out.println("List is empty");
                return -1;
            }
            else if (index < 0 || index >= size) {
                System.out.println("Invalid arguments");
                return -1;
            }
            Node temp = head;
            for (int i = 0 ; i < index ; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        public void addFirst (int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;
            if(size == 0) {
                tail = temp;
            }
            size++;
        }
    }

    public static void testLinkedList (LinkedList list) {
        for (Node temp = list.head ; temp != null ; temp = temp.next) {
            System.out.println("Data: " + temp.data);
        }
        System.out.println("Size: " + list.size);

        if(list.size > 0) {
            System.out.println("Tail data: " + list.tail.data);
        }
    }
}
