public class BinarySearch {
    static int GetBinarySearch(int arr[], int i, int j, int element) {
        if (i > j) {
            return -1;
        } else {
            int mid = i + j / 2;
            if (arr[mid] == element) {
                return mid;
            } else if (element > arr[mid]) {
                GetBinarySearch(arr, mid + 1, arr.length - 1, element);
            } else {
                GetBinarySearch(arr, 0, mid - 1, element);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 3, 4, 5, 6, 7, 8, 9, 11 };
        int pos = GetBinarySearch(arr, 0, arr.length - 1, 6);
        if (pos >= 0) {
            System.out.println("The element found at " + pos);
        } else {
            System.out.println("Element not found");
        }
    }
}
