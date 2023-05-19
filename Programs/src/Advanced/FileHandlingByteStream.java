package Advanced;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingByteStream {

    public static void main (String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        //Use the same code in local machine compiler to do necessary operations

        //You may edit the location of file as desired

        try{
            in=new FileInputStream("input.txt");
            out=new FileOutputStream("output.txt");
            int c;
            while((c=in.read())!=-1){
                out.write(c);
            }
        }finally {
            if(in!=null){
                in.close();
            }if(out!=null){
                out.close();
            }
        }

    }
}
