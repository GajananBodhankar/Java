public class ThisKeyword {
    int age;
    String name;
    void details(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
    void disp()
    {
        System.out.print(age+" "+name);
    }
    public static void main(String ar[])
    {
        ThisKeyword t=new ThisKeyword();
        t.details(21, "John");
        t.disp();
    }
}
