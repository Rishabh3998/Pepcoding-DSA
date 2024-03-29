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
        public Node head;
        // Address of the tail node
        public Node tail;
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

        public void addAt (int idx, int val) {
            if (idx < 0 || idx > size) {
                System.out.println("Invalid arguments");
            }
            else if (idx == 0) {
                addFirst(val);
            } else if (idx == size) {
                addLast(val);
            }
            else {
                // Create a new node
                Node node = new Node();
                // set its value
                node.data = val;

                // create a pointer pointing on head
                Node temp = head;
                // Traverse through list
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }

                node.next = temp.next;
                temp.next = node;
                size++;
            }
        }

        public void removeLast () {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Node temp = head;
                for (int i = 0 ; i < size - 2 ; i++) {
                    temp = temp.next;
                }
                tail = temp;
                temp.next = null;
                size--;
            }
        }

        private Node getNodeAt (int idx) {
            Node temp = head;
            for (int i = 0 ; i < idx ; i++) {
                temp = temp.next;
            }
            return temp;
        }

        public void reverseLinkedList () {
            // Same 2 pointer approach that we use to reverse an array
            // The difference here is only that: to get each pointer we have to traverse the list
            // Time complexity: O(n ^ 2)
            int li = 0;
            int ri = size - 1;

            while (li < ri) {
                Node getLeft = getNodeAt(li);
                Node getRight = getNodeAt(ri);

                int temp = getLeft.data;
                getLeft.data = getRight.data;;
                getRight.data = temp;

                li++;
                ri--;
            }
        }

        public void reverseLinkedListOptimal () {
            Node prev = null;
            Node curr = head;

            while (curr != null) {
                Node temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            Node temp = head;
            head = tail;
            tail = temp;
        }

        public void removeAt (int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            }
            else if (idx == 0) {
                removeFirst();
            } else if (idx == size - 1) {
                removeLast();
            } else {
                Node temp = head;
                for (int i = 0 ; i < idx - 1 ; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;
            }
        }

        public int kthFromEnd (int k) {
            Node slow = head;
            Node fast = head;

            for (int i = 0 ; i < k ; i++) {
                fast = fast.next;
            }

            while(fast != tail) {
                slow = slow.next;
                fast = fast.next;
            }

            return slow.data;
        }

        public int middleOfLinkedList () {
            Node slow = head;
            Node fast = head;

            while(fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow.data;
        }

        public static LinkedList mergeTwoSortedLL (LinkedList l1, LinkedList l2) {
            Node p1 = l1.head;
            Node p2 = l2.head;
            LinkedList list = new LinkedList();

            while (p1 != null && p2 != null) {
                if(p1.data < p2.data) {
                    list.addLast(p1.data);
                    p1 = p1.next;
                } else if (p2.data < p1.data) {
                    list.addLast(p2.data);
                    p2 = p2.next;
                }
            }

            if (p1 != null) {
                while (p1 != null) {
                    list.addLast(p1.data);
                    p1 = p1.next;
                }
            } else if (p2 != null) {
                while (p2 != null) {
                    list.addLast(p2.data);
                    p2 = p2.next;
                }
            }

            return list;
        }

        public static Node midNode (Node head, Node tail) {
            Node slow = head;
            Node fast = head;

            while(fast != tail && fast.next != tail) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }
        public static LinkedList mergeSortLL (Node head, Node tail) {
            if(head == tail) {
                LinkedList res = new LinkedList();
                res.addLast(head.data);
                return res;
            }
            Node mid = midNode(head, tail);
            LinkedList l1 = mergeSortLL(head, mid);
            LinkedList l2 = mergeSortLL(mid.next, tail);
            return LinkedList.mergeTwoSortedLL(l1, l2);
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
