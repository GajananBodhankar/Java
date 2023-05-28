import java.util.ArrayList;
import java.util.List;

class Arraylist {
public static void main(String[] args) {
    ArrayList<Integer> al=new ArrayList<>(10);
    List<Integer> li=new ArrayList<>(10);
    al.add(10);
    al.add(11);
    al.add(12);
    li.add(9);
    li.add(8);
    al.addAll(li);
    System.out.print("Size "+al.size()+" list"+al);
    al.sort(null);
    System.out.print(al);
}    
}
