class Inheritance1
{
     protected void Disp()
    {
        System.out.println("Inheritance 1");
    }
}
class Inheritance2 extends Inheritance1
{
    protected void Disp2()
    {
        System.out.println("Inheritance2");
    }
}
public class Inheritance extends Inheritance2 {
public static void main(String ar[])
{
    Inheritance i=new Inheritance();
    i.Disp();
    i.Disp2();
}
    
}
