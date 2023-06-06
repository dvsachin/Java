package programming_Language.Advanced;

import java.io.File;
import java.io.IOException;

public class FileHandlingCreateAndGetInformation2 {
    public static void main (String[] args) {

        //Use the same code in local machine compiler to generate a file named as
        //"File.txt" at location shown in the below code

        //You may edit the location of file as desired

        try{
            File obj=new File("input.txt");
            if(obj.createNewFile()){
                System.out.println(obj.getName());
            }else{
                System.out.println("File already exists.");
            }
            if(obj.exists()){
                System.out.println(obj.getName());
                System.out.println(obj.getAbsolutePath());
                System.out.println(obj.canWrite());
                System.out.println(obj.canRead());
                System.out.println(obj.length());
            }else{
                System.out.println("File doesn't exists");
            }
        }
        catch (IOException e){
            System.out.println("An error occured");
        }

    }
}
