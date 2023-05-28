
import java.io.*;

public class FIS {
    public static void main(String ar[]) throws IOException
    {
        FileInputStream in=new FileInputStream("DemoOut.txt");
        BufferedInputStream br=new BufferedInputStream(in);
        //FilterInputStream br=new FilterInputStream(in); Might give an error saying "Protected access"
        int i;
        while((i=br.read())!=-1)
        {
            i=(char)br.read();
            System.out.print((char)i);
        }
    }
}
