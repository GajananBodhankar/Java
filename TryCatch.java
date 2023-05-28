import java.util.ArrayList;

public class TryCatch {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(20);
        al.add(20);
        try {
            int x=al.get(1);
            System.out.println(x);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        

    }
}
