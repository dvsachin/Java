package programming_Language.Advanced;

import java.io.File;
import java.io.IOException;

public class FileHandlingCreateAndGetInformation {
    public static void main (String[] args) {

        //Use the same code in local machine compiler to generate a file named as
        //"File.txt" at location shown in the below code

        //You may edit the location of file as desired

        try{
            File obj=new File("input.txt");
            if(obj.createNewFile()){
                System.out.print(obj.getName());
            }else{
                System.out.print("File already exists.");
            }
        }
        catch (IOException e){
            System.out.print("An error occured");
        }
    }
}
