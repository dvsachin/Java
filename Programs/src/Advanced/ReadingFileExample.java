package Advanced;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFileExample {
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

            //FileWrite object creation to write a file
            FileWriter wr=new FileWriter("input.txt");
            wr.write("Java is a programming language");
            wr.close();
            System.out.println("Successfully wrote");


            //reading a file
            File obj_1=new File("input.txt");
            Scanner myReader=new Scanner(obj_1);
            while(myReader.hasNextLine()){
                String data=myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch (IOException e){
            System.out.println("An error occured");
        }

    }
}
