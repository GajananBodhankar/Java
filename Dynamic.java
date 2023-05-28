public class Dynamic {
    void Disp(){
        System.out.println(1);
    }
}
class Dynamic1 extends Dynamic
{
    @Override
    void Disp()
    {
        super.Disp();
        System.out.println(2);
    }
    public static void main(String ar[])
    {
        Dynamic1 d=new Dynamic1();
        d.Disp();
    }
}
