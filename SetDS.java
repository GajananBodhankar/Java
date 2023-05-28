import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetDS {
    public static void main(String[] args) {
        Set<Integer> s=new HashSet<>(10);
        s.add(10);
        s.add(20);
        s.add(30);
        for(Integer Obj:s)
        System.out.println(Obj); 
        ArrayList<Integer> i=new ArrayList<>(5);
        i.add(20);
        System.out.println("Set:"+s+" "+"ArrayList :"+i);
        s.retainAll(i);
        System.out.println("Set:"+s+" "+"ArrayList :"+i);

    }
}
