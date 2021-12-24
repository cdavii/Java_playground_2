package challenges.week_2.binary_tree;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryTree implements BinaryTreeI{
    private final Node rootNode;
    private int numberOfNodes = 1;

    public BinaryTree(final int element) {
        rootNode = new Node(element);
    }

    public void addElement(final int element) {
        addNodeToTree(rootNode, element);
        numberOfNodes++;
    }

    public void addElements(final int[] elements) {
        for (int i : elements) {
            addNodeToTree(rootNode, i);
            numberOfNodes++;
        }
    }

    public int getRootElement(){
        return rootNode.getValue();
    }

    public int getNumberOfElements() {
        return numberOfNodes;
    }

    public boolean findElement(final int value) {
        Node node = findNode(value);
        if (node != null) {
            return true;
        }
        return false;
    }

    public int[] getSortedTreeAsc(){
        int [] sortedArr = sortArrayListAsc().stream().mapToInt(i -> (int) i).toArray();
        return sortedArr;
    }

    public int[] getSortedTreeDesc(){
        int [] sortedArr = sortArrayListDesc().stream().mapToInt(i -> (int) i).toArray();
        return sortedArr;
    }

    private ArrayList sortArrayListAsc() {
        ArrayList sortedArrayList = new ArrayList<Integer>();
        sortedArrayList.addAll(inOrderTraversal(rootNode));

        Collections.sort(sortedArrayList);
        return sortedArrayList;
    }

    private ArrayList sortArrayListDesc() {
        ArrayList sortedDescArrayList = new ArrayList<Integer>();
        sortedDescArrayList.addAll(inOrderTraversal(rootNode));

        Collections.sort(sortedDescArrayList, Collections.reverseOrder());
        return sortedDescArrayList;
    }


    // Traverses the binary tree using recursion and adds the values of each node to an ArrayList
    private ArrayList inOrderTraversal(Node node) {
        Node current = node;
        ArrayList integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(current.getValue());
        // If left child is not empty, call the method again with Node argument set to left of current child
        // When left child IS empty, the current.getValue is added to integerArrayList from the stack
        if (!node.isLeftChildEmpty()) {
            integerArrayList.addAll(inOrderTraversal(current.getLeftChild()));
            }
        // Two separate if statements are used to evaluate each branch using the same logic
        if (!node.isRightChildEmpty()) {
            integerArrayList.addAll(inOrderTraversal(current.getRightChild()));
        }
        return integerArrayList;
    }
    // Checks whether value of element is greater or smaller than value stored in current node
    // When value in node.getValue is equal to element returns that node object, else returns null
    private Node findNode(int element){
        Node node = rootNode;
        while (node != null) {
            if (element == node.getValue()) {
                return node;
            }
            if (element < node.getValue()) {
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        }
        return null;
    }

    // Uses recursion to add new nodes to tree with the value of the element argument.
    private void addNodeToTree(Node node, final int element) {
        // If the element is a lower or equal to the value in the current node it is added to the left
        if (element <= node.getValue()) {
            // If the child on the left is empty a new node is created with the value of the element argument.
            if (node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(element));
            } else {
                // If the child on the left is not empty addNodeToTree is called again
                // this time with the Node argument set to the left child, this repeats until the if statement evaluates true
                // whereby a new node is added to the left of currently interrogated node.
                addNodeToTree(node.getLeftChild(), element);
            }
        // This could be a plain else statement, but I've left it in to show symmetry
        // If element is greater than currently interrogated node the right branch is checked
        } else if (element > node.getValue()) {
            if (node.isRightChildEmpty()) {
                node.setRightChild(new Node(element));
            } else {
                addNodeToTree(node.getRightChild(), element);
            }

        }
    }
}
