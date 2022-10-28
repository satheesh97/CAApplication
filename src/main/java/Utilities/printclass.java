package Utilities;

import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class printclass  {
    public static void main(String arg[]) {
        System.out.println(System.getProperty("user.dir"));

        try{
            FileWriter fw=new FileWriter(System.getProperty("user.dir") + "\\src\\test\\resources\\document\\uesrname.text");
            fw.write("Welcome to javaTpoint.");
            fw.close();
        }catch(Exception e){System.out.println(e);}
       try{
           FileReader fr=new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\document\\uesrname.text");
      int data;
           while((data=fr.read())!=-1)
               System.out.print((char)data);
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}


