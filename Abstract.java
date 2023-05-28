abstract class Main
{
    abstract void Disp();
}
public class Abstract extends Main {
    @Override
    void Disp()
    {
        System.out.println("Abstract class and function");
    }
    public static void main(String[] args) {
        Abstract a=new Abstract();
        a.Disp();
        }
}
