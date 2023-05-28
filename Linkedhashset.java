import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset {
    public static void main(String[] args) {
Set<Integer> s=new LinkedHashSet<>(10);
s.add(10);
s.add(20);
s.add(30);
Object access=s.toArray()[0];
System.out.println((access));
Iterator<Integer> i=s.iterator();
while(i.hasNext())
{
    System.out.println(i.next());
}
    }
}
