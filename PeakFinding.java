public class PeakFinding {

    public static int find_peak(int array[], int a, int b) {
        int mid = (a + b)/2;
        int peak;
        if (array[mid] > array[mid-1] & array[mid] > array[mid+1]) {
            peak = array[mid];
        } else if (array[mid - 1] > array[mid]) {
            a = a;
            b = mid - 1;
            peak = find_peak(array, a, b);
        } else {
            a = mid + 1;
            b = b;
            peak = find_peak(array, a, b);
        }
        return peak;
    }
    public static void main(String[] args) {
        int our_array[] = {12, 13, 20, 10, 18, 23, 89, 27};
        System.out.println("Peak found is: " + find_peak(our_array, 0, our_array.length-1));

    }
}
