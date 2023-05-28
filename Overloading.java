public class Overloading {
    Overloading(int a,int b)
    {
        System.out.println(a+b);
    }
    Overloading(int age,String name)
    {
        System.out.println(age+" "+name);
    }
    public static void main(String arg[])
    {
        Overloading o=new Overloading(10,20);
        Overloading o1=new Overloading(21,"gajanan");
    }
    
}
