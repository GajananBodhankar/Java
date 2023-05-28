import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArray {
    public static void main(String[] args) throws IOException {
    // char c[]={'a','b','c'};
    // int i;
    // CharArrayReader cr=new CharArrayReader(c);
    //     while((i=cr.read())!=-1)
    // {
    //     i=(char)cr.read();
    //     System.out.println((char)i);
    // }
    // }
    CharArrayWriter cr=new CharArrayWriter();
    cr.write("Gajanan");
    System.out.print(cr);
    }

}