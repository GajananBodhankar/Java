import java.io.*;
public class FOS {
    public static void main(String[] args) throws IOException {
        FileOutputStream out=new FileOutputStream("Demo.txt");
        BufferedOutputStream o=new BufferedOutputStream(out)   ;
        String s="Gajanan Bodhankar";
        byte b[]=s.getBytes();
        for(int i=0;i<b.length;i++)
        {
            o.write((char)b[i]);
        }
        out.close();
    }
}
