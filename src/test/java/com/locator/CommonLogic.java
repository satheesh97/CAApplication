package com.locator;

import com.step.steps.LoggerFile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommonLogic
{
    public   int rand =0;
    LoggerFile logger =new LoggerFile() ;
    public String path =System.getProperty("user.dir") + "\\src\\test\\resources\\document\\uesrname.text";
    public String OETpath =System.getProperty("user.dir") + "\\src\\test\\resources\\document\\document.text";
   public String year =System.getProperty("user.dir") + "\\src\\test\\resources\\document\\year.text";
    public String title;

    public String name;
    public  String Calldata =gettingTitle();
/*public static void main (String arg []){
    CommonLogic commonLogic = new CommonLogic();
    commonLogic.randomNumber9();
commonLogic.dateSet();
System.out.println(commonLogic.getRandNum());
System.out.println(commonLogic.getTitle());


}*/

    public String getCurrentDate(int count){

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime localDateTime = LocalDateTime.now().plusDays(count);
        String date = dateTimeFormatter.format(localDateTime);
        return  date;
    }

public void writeFile(String text){
    try{
        FileWriter writefile=new FileWriter(path);
        writefile.write(text);
        writefile.close();
        logger.info("File information written Sucessfully");
    }catch(Exception e){System.out.println(e);}
}

    public void writeYear(String text){
        try{
            FileWriter writefile=new FileWriter(year);
            writefile.write(text);
            writefile.close();
            logger.info("File information written Sucessfully");
        }catch(Exception e){System.out.println(e);}
    }

    public String readYear(){
        String text = "";
        try {
            text = new String(Files.readAllBytes(Paths.get(year)));
            //logger.info("File information read Sucessfully");
        }
        catch ( IOException e) { e.printStackTrace();
            logger.info("File information Not read ");}
        return text;
    }

    public void writeOET(String text){
        try{
            FileWriter writefile=new FileWriter(OETpath);
            writefile.write(text);
            writefile.close();
            logger.info("File information written Sucessfully");
        }catch(Exception e){System.out.println(e);
            logger.info("File information Not written Executed");}
    }
    public String readOET(){
        String text = "";
        try {
            text = new String(Files.readAllBytes(Paths.get(OETpath)));
            logger.info("File information read Sucessfully");}
        catch ( IOException e) { e.printStackTrace();
            logger.info("File information Not read ");}
        return text;
    }
public String readFile(){
    String text = "";
    try {
        text = new String(Files.readAllBytes(Paths.get(path)));
        //logger.info("File information read Sucessfully");
    }
     catch ( IOException e) { e.printStackTrace();
         logger.info("File information Not read ");}
    return text;
}

    public String gettingTitle(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddhhssmm");
        LocalDateTime now = LocalDateTime.now();
        logger.info("Title is  created time is "+ now);
        title = "Testtoday"+dtf.format(now).toString();
       // System.out.println(title);
      //  logger.info("Title is  created Name is "+ title);
        return title;
    }

    public  String getTitle() {
        return title;
    }


    public void setTitle(String Calldata)
    {
        this.title = Calldata;

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }
    public int randomNumber9(){
        int max =8;
        int min =2;
        rand=(int) Math.floor(Math.random()*(max-min+1)+min);
        return rand;
    }


    public int randomNumber4(){
        int max =4;
        int min =1;
        rand=(int) Math.floor(Math.random()*(max-min+1)+min);
        return rand;
    }
    public int randomNumber(int count ){
        int max =count;
        int min =1;
        rand=(int) Math.floor(Math.random()*(max-min+1)+min);
        return rand;
    }



    public int getRandNum() { return rand; }

    // Method 2 - Setter
    public void setRandNum(int N)
    {
        // This keyword refers to current instance itself
        this.rand = N;
    }
}

