package challenges.week_2.binary_tree;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(5);

        binaryTree.addElement(1);
        binaryTree.addElement(10);
        binaryTree.addElement(11);
        binaryTree.addElement(16);
        binaryTree.addElement(100);
        binaryTree.addElement(16);

        binaryTree.addElements(new int[]{20, 21, 22, 25, 23});


        System.out.println(Arrays.toString(binaryTree.getSortedTreeAsc()));
        System.out.println(Arrays.toString(binaryTree.getSortedTreeDesc()));
    }

}
