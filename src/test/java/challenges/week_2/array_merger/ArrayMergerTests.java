package challenges.week_2.array_merger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import static challenges.week_2.array_merger.ArrayMerger.*;

public class ArrayMergerTests {
    //ArrayMerger arrayMerger = new ArrayMerger();
    int[] arrayOne = {0, 1, 2, 3, 4, 5};
    int[] arrayTwo = {5, 4, 3, 2, 1, 0};

    int[] result = arrayMerge(arrayOne, arrayTwo);

    @Test
    void mergeTest(){
        Assumptions.assumeTrue(result != null);
        Assertions.assertArrayEquals(result, new int[]{0, 1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 0});
    }

    @Test
    void sortAscTest() {
        int[] resultSort = sortAsc(result);
        Assumptions.assumeTrue(resultSort != null);
        Assertions.assertArrayEquals(resultSort, new int[]{0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5});
    }

    @Test
    void sortDescTest() {
        int[] resultSort = sortDesc(result);
        Assumptions.assumeTrue(resultSort != null);
        Assertions.assertArrayEquals(resultSort, new int[]{5, 5, 4, 4, 3, 3, 2, 2, 1, 1, 0, 0});
    }

    @Test
    void removeDuplicatesTest() {
        int[] resultRemovedDuplicates = removeDuplicates(result);
        Assumptions.assumeTrue(resultRemovedDuplicates != null);
        Assertions.assertArrayEquals(resultRemovedDuplicates, new int[]{0, 1, 2, 3, 4, 5});
    }
}
