package com.locator;

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
    public String path =System.getProperty("user.dir") + "\\src\\test\\resources\\document\\uesrname.text";
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
    }catch(Exception e){System.out.println(e);}
}

public String readFile(){
    String text = "";
    try {
        text = new String(Files.readAllBytes(Paths.get(path))); }
     catch ( IOException e) { e.printStackTrace(); }
    return text;
}

    public String gettingTitle(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddhhss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        title = "Testtoday"+dtf.format(now).toString();
        System.out.println(title);
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

    public int getRandNum() { return rand; }

    // Method 2 - Setter
    public void setRandNum(int N)
    {
        // This keyword refers to current instance itself
        this.rand = N;
    }
}

