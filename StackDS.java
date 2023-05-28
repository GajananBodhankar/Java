import java.util.Iterator;
import java.util.Stack;

public class StackDS {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.add(10);
        s.insertElementAt(50, 0);
        s.push(20);
        s.push(30);
        System.out.print(s.peek());
        s.set(1, 3);
        s.sort(null);
        s.pop();


        System.out.print(s);
Iterator<Integer> i=s.iterator();
while(i.hasNext())
{
    System.out.println((i.next()));
}
    }
}
