import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileDemo {

public static void main(String ar[]) throws IOException
    {
         //     FileOutputStream in=new FileOutputStream("Demo.txt");
    // String s="Hi, This is demo file for FileDemo.java";
    // byte b[]=s.getBytes();
    // for(int i=0;i<b.length;i++)
    // {
    //     in.write(b[i]);
    // }
    // in.close();
        FileInputStream in=new FileInputStream("Demo.txt");
    FileOutputStream out=new FileOutputStream("DemoOut.txt");
    byte b[]=new byte[in.available()];
    for(int i=0;i<b.length;i++)
    {
    b[i]=(byte) in.read();
    System.out.print((char)b[i]);
    out.write(b[i]);
    }
    out.close();
    in.close();
   
    }
}
