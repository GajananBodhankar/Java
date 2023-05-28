import java.util.Scanner;

public class LinearsearchScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Enter the size of elements");
        int x = s.nextInt();
        int arr[] = new int[x];
        System.out.println("Enter the elements :");
        for (int i = 0; i < x; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the search element:");
        int searchElement = s.nextInt();
        for (int j = 0; j < x; j++) {
            if (arr[j] == searchElement) {
                System.out.println("Found at " + j + " Location");
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Element not found");
        }

    }
}
