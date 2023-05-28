import java.util.ArrayList;

public class Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(10);
        al.add(10);
        al.add(20);
//         Iterator i=(Iterator) al.iterator();
//         while(((java.util.Iterator<Integer>) i).hasNext())
//         {
// System.out.print(((java.util.Iterator<Integer>) i).next());
//         }
    java.util.Iterator<Integer> i=al.iterator();
    while(i.hasNext())
    {
        System.out.println(i.next());
    }
    int arr[]=new int[10];
    arr[0]=1;
    arr[1]=2;
    arr[2]=3;
    for(Integer Obj:arr)
    {
        System.out.println(Obj);
    }
    }
}
