import java.util.Stack;

public class MultiCatch {
    public static void main(String[] args) {
        try{
            Stack<Integer> s=new Stack();
            s.insertElementAt(10, 1);
            System.out.println(s.peek()); //won't be printed because, once control goes in catch, it wont come back again
        }
        catch(RuntimeException e)
        {
            System.out.println("Exception"+e);
        }
        catch(Exception e){
        System.out.print(e);
        }
    }
}
