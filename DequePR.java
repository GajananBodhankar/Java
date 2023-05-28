import java.util.ArrayDeque;
import java.util.Deque;

public class DequePR {
    public static void main(String[] args) {
        //FIFO -Queue
Deque<Integer> d=new ArrayDeque<>();
System.out.println("Queue :");
d.addLast(10);
d.addLast(20);
d.addLast(3);
System.out.println(d);
d.removeFirst();
System.out.println(d);

//LIFO - stack
Deque<Integer> ds=new ArrayDeque<>();
System.out.println("Stack :");
ds.addFirst(10);
ds.addFirst(20);
ds.addFirst(30);
System.out.println(ds);
ds.removeLast();
System.out.println(ds);
}
}
