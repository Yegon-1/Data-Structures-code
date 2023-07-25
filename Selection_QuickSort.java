import java.util.Random;

public class Main {

    public static void selectionSort(int array[]) {
        int size = array.length;
        for (int step = 0; step < size - 1; step++) {
            int min_idx = step;
            for (int i = step + 1; i < size; i++) {
                if (array[i] < array[min_idx]) {
                    min_idx = i;
                }
            }

            // Swap min at the correct position
            int temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;
        }
    }

    public static void quickSort(int [] array, int loweBound, int upperBound) {
        if (loweBound >= upperBound) {
            return;
        }
        // Choose a pivot
        int pivot = array[upperBound];
        // create two pointers / trackers left && right
        int left = loweBound;
        int right = upperBound;

        while (left < right) {
            while (array[left] <= pivot && left < right) {
                left ++;
            }
            while (array[right] >= pivot && left < right) {
                right --;
            }
            swap(array, left, right);
        }
        swap(array, left, upperBound);
        quickSort(array, loweBound, left-1);
        quickSort(array, left+1, upperBound);
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void swap(int array[], int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }



    public static void main(String[] args) {
        Random rand = new Random();
        int [] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(30);
        }

        System.out.println("Before");
        print(nums);
        System.out.println(" ");

        quickSort(nums, 0, nums.length-1);
        //selectionSort(nums);

        System.out.println("After");
        print(nums);
    }
}