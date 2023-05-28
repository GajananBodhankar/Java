import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(5);
        ll.sort(null);
       // Object access=ll.toArray()[0];
        System.out.println(ll);
        ll.remove(ll.size()-1);
        
        Iterator<Integer> i=ll.iterator();
      while(i.hasNext())
      {
        System.out.println("Iterator"+i.next());
      }
      Iterator<Integer> i1=ll.descendingIterator();
      while(i1.hasNext())
      {
        System.out.println("Des"+i1.next());
      }
      System.out.println("Top:"+ll.peek()+" Offer"+ll.offer(14)+"Polled element"+ll.poll()+" "+ll);
    }
}
