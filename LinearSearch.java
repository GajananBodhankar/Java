import java.util.Arrays;

class LinearSearch {
    public static void main(String[] args) {
        int arr[] = new int[] { 3, 4, 5, 6, 7 };
        for (int i : arr) {
            // if (i == 5) {
            // System.out.println("True" + Arrays.asList(arr).indexOf(i));
            // }
            System.out.println("True" + Arrays.binarySearch(arr, i));
        }
    }
}
