package IntroToLinkedList;

public class LinkedList {
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
    // it only requires 2 things in the node |data-value (4 byte) |next-node-address (4)|  (8 byte) (Singly linked list)

    // heap: |---allocated---|---node 1 (value | address of node 2)---|----allocated----|---node 2 (value | address of node 3)---|
    // head address of the linkedList will be present in the stack
    // last node (value | null)

}
