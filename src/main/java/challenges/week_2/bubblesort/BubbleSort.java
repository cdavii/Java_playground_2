package challenges.week_2.bubblesort;

import java.util.Arrays;

public class BubbleSort {


    int[] bubbleSort(int[] arr){
        int length = arr.length;
        for (int i = 0; i < length; i++){
            for (int j = 1; j < length - i; j++){
                if (arr[j] < arr[j-1]){
                    // Swap arr[j] and arr[j-1]
                    swap(arr, j, j -1);
                }
            }
        }
        return arr;
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        int[] toSort = {7, 3, 1, 4, 5};
        BubbleSort sorter = new BubbleSort();
        sorter.bubbleSort(toSort);

        System.out.println(Arrays.toString(toSort));
    }


}


