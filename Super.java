class Main
{
    Main()
    {
        System.out.print("Constructor main");
    }
    void Disp()
    {
        System.out.print("Hello");
    }
}
class Super extends Main {
    Super()
    {
        super();
        System.out.println("Constructor super");
    }
    @Override
    void Disp()
    {
super.Disp();
    }
    public static void main(String ar[])
    {
        Super s=new Super();
        s.Disp();
    }
}
