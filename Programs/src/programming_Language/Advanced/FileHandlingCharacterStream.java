package programming_Language.Advanced;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class FileHandlingCharacterStream {
    public static void main (String[] args) throws IOException {
        FileReader in=null;
        FileWriter out=null;

        //Use the same code in local machine compiler to do necessary operations
        //You may edit the location of file as desired

        try{
            in=new FileReader("input.txt");
            out=new FileWriter("output.txt");
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

