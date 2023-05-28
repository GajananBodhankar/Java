import java.util.Iterator;
import java.util.LinkedList;

public class UserDefinedExceptions extends Exception {
    UserDefinedExceptions(String s) {
        super(s);
    }
}

class User {
    public static void main(String[] args) {
        try {
        throw new UserDefinedExceptions("Exception occured");
        } catch (Exception e) {
        System.out.println(e.getMessage());
        }
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // LinkedList<Integer> li = new LinkedList<>();
        // for (int x : arr) {
        //     li.add(x);
        // }
        // Iterator<Integer> i = li.descendingIterator();
        // while (i.hasNext()) {
        //     System.out.println(i.next());
        // }
    }
}
