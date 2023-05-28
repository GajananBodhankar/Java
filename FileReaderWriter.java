import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
    public static void main(String ar[]) throws IOException
    {
        FileWriter r=new FileWriter("Demo.txt");
        BufferedWriter br=new BufferedWriter(r);
        br.write("Max butcher");
        r.close();
    }
}
