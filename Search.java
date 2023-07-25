import java.util.Random;

public class Search {

    public static boolean binarySearch(int[] array, int x, int left_index, int right_index) {
        if (left_index > right_index) {
            return false;
        }
        int mid = (left_index + right_index)/ 2;
        if (array[mid] == x) {
            return true;
        } else if (x < array[mid]) {
            return binarySearch(array, x, left_index, mid - 1);
        } else {
            return binarySearch(array, x, mid+1, right_index);
        }
    }

    public static boolean linearSearch(int[] array, int x){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return true;
            }
        } return false;
    }

    private static void shuffleArray(int[] array) {
        int index, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int [] numbers = new int[100000];
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = a + 1;
        }
        shuffleArray(numbers);

        if (binarySearch(numbers, 99567, 0, numbers.length-1)){
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        if (linearSearch(numbers, 99567)){
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}