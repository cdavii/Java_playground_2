package challenges.week_2.array_merge;

import java.util.Arrays;

public class ArrayMerger {


    public static int[] merger(int[] arr1, int[] arr2){
        int aLength = arr1.length;
        int bLength = arr2.length;
        int[] mergedArr = new int[aLength + bLength];

        for (int i = 0; i < aLength; i++){
            mergedArr[i] = arr1[i];
        }
        for (int i = 0; i < bLength; i++){
            mergedArr[i + aLength] = arr2[i];
        }
        return mergedArr;
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14};


        int[] result = merger(a, b);
        System.out.println(Arrays.toString(result));
    }



}
