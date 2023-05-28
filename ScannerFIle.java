import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScannerFIle {
public static void main(String ar[]) throws IOException 
{
    FileInputStream in=new FileInputStream("Demo.txt");
    Scanner s=new Scanner(in);
    String str;
    while(s.hasNextLine())
    {
        str=s.nextLine();
        System.out.println(s);
    }
}   
}
