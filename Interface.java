interface I1{
    public void Disp();
    public void Show();
}
public class Interface implements I1{
    @Override
    public void Disp()
    {
        System.out.println("hello");
    }
    @Override
    public void Show()
    {
        System.out.println("Hi");
    }
    public static void main(String ar[])
    {
        Interface i=new Interface();
        i.Disp();
        i.Show();
    }
}
