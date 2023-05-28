public class Static {
    // int x=10;
    // static void Disp()
    // {
    //     System.out.println(x);     CANNOT ACCESS
    // }
    int x=10;
    static class Inner
    {
        void Disp()
        {
            System.out.println(x);
        }
    }
    public static void main(String ar[])
    {
       Static s=new Static();
       Static.Inner i=s.new Inner();
       i.Disp();
    }
}
