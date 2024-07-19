package IntroToGenericTrees;

import java.util.ArrayList;
import java.util.Stack;

public class GenericTree {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display (Node root) {
        StringBuilder str = new StringBuilder(root.data + " -> ");
        for (Node child : root.children) {
            str.append(child.data).append(", ");
        }
        str.append(".");
        System.out.println(str);

        for (Node child: root.children) {
            display(child);
        }
    }

    public static void main(String[] args) {
        int[] nodeData = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        Node root = null;
        Stack<Node> nodeTracker = new Stack<>();

        for (int i = 0 ; i < nodeData.length ; i++) {
            if(nodeData[i] == -1) {
                nodeTracker.pop();
            } else {
                Node node = new Node();
                node.data = nodeData[i];

                if (!nodeTracker.isEmpty()) {
                    nodeTracker.peek().children.add(node);
                }
                else {
                    root = node;
                }
                nodeTracker.push(node);
            }
        }

        display(root);
    }
}
