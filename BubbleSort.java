import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = s.nextInt();
        System.out.println("ENter the elements");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int n, m;
        for (n = 0; n < size; n++) {
            for (m = n + 1; m < size; m++) {
                if (arr[n] > arr[m]) {
                    int temp = arr[n];
                    arr[n] = arr[m];
                    arr[m] = temp;
                    for (int i = 0; i < size; i++) {
                        System.out.print(arr[i]);
                    }
                    System.out.println();
                }
            }
        }
        System.out.println("The sorted array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
        }
    }
}