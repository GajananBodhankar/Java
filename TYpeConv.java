import java.util.Scanner;

public class TYpeConv {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String s=new String();
        int i,count=0;
        char c[]=new char[100];
        s=sc.nextLine();
        c=s.toCharArray();
        for(i=0;i<s.length();i++)
        {
            if(c[i]=='a')
            {
                count++;
            }
        }
        System.out.print(count);
    }
}
