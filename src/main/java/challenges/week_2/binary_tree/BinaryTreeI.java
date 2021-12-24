package challenges.week_2.binary_tree;

public interface BinaryTreeI {
    int getRootElement(); //done

    int getNumberOfElements(); //done

    void addElement(int element); //done

    void addElements(final int[] elements); //done

    boolean findElement(int value); //done

    //int getLeftChild(int element) throws ChildNotFoundException;

    //int getRightChild(int element) throws ChildNotFoundException;

    int[] getSortedTreeAsc(); // done

    int[] getSortedTreeDesc(); // done
}