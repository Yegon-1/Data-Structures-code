public class quickSort {

    public static void swapOrder(int[] array, int x, int y) {
        double temp = array[x];
        array[x] = array[y];
        array[y] = (int) temp;
    }

    public static void sort(int[] array) {   // goes to call the recursive method
        quicksort(array, 0, array.length-1);
    }


    public static void quicksort(int[] array, int left, int right) {
        // If left index is greater or equal to right index the really either the data has
        // one element (sorted) OR the pointers are imbalanced.
        if (left>=right) {
            return;
        }
        int pivot = array[(left+right) / 2]; // pick a pivot, the center is a great choice but others may apply
        int index = divide(array, left, right, pivot);  // returns partition point btn. left & right side.
        quicksort(array, left, index-1);    //left till partition point, 'just'
        quicksort(array, index, right);     // partition point till right
    }

    public static int divide(int[] array, int left, int right, int pivot) {   // returns int which is the dividing point
        while (left <= right) {         // track movement of left pointer till it gets to the mid
            while (array[left] < pivot) {
                left++;
            }

            while (array[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swapOrder(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }


    // Testing...
    public static void main(String[] args) {
        int[] lamp_heights = {2, 7, 1, 3, 8, 9, 4};
        sort(lamp_heights);
        for (int i = 0; i<lamp_heights.length; i++) {
            System.out.println(lamp_heights[i]);
        }
    }
}
