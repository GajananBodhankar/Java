class ValueRef {
    int x;
    ValueRef ref(ValueRef v)
    {
        v.x=10;
        return v;
    }
    public static void main(String ar[])
    {
        ValueRef i=new ValueRef();
        ValueRef j=new ValueRef();
        i=i.ref(j);
        System.out.println(i.x);
    }
}