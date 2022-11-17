package com.step.steps;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerFile {
    static Logger logger = Logger.getLogger(LoggerFile.class);
   public static void config(){
      // BasicConfigurator.configure();
       PropertyConfigurator.configure("src/test/resources/log4j.properties");
   }
   /* public static void main(String arg[]){
        config();
        LoggerFile f =new LoggerFile();
        f.info("hi Iam message");
        logger.info("this is info");
        logger.warn("this is  onfor warn");
    }*/

    public void info(String Message){
       logger.info(Message);
    }
    public void error(String Message){
        logger.error(Message);
    }
}
