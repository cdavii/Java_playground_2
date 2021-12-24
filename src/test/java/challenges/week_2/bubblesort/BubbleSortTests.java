package challenges.week_2.bubblesort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTests {
    int[] sorted = {1, 2, 3, 4, 5};
    int[] toSort = {5, 2, 1, 4, 3};
    BubbleSort sorter = new BubbleSort();

    @Test
    public void BubbleSortChecker(){
        assertArrayEquals(sorted, sorter.bubbleSort(toSort));
    }
}
