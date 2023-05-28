import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Demo{

public static void main (String[] args) throws IOException{
   PipedInputStream in=new PipedInputStream();
   PipedOutputStream out=new PipedOutputStream();
   try{
    in.connect(out);
    out.write((char)'x');
    System.out.print((char)in.read());
   }
   catch(IOException e)
   {
    System.out.print(e);
   }
}
}
