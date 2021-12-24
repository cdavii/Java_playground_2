package core.loops.for_loops;

public class ForExamples {
    private int[] arr = {1, 2, 3, 4, 5, 6, 7};

    public void basicForI(){
        for (int i =0; i<arr.length; i++)
            // Key reason, if we had multiple counters / objects we can use the loop counter
            System.out.println(arr[i]);
    }

    public void forEach(){
        for (int num : arr){
            System.out.println(num);
        }
    }



}
