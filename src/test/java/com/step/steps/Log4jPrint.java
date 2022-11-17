package com.step.steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Log4jPrint {
     static Logger Log = LogManager.getLogger(Log4jPrint.class.getName());
    // Logger l = new Logger();
enum level{
    INFO, WARNING,ERROR
}

    public String log(level l,String Message) {
        LocalDateTime present = LocalDateTime.now();
        DateTimeFormatter f =DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String logDateTime = present.format(f);

        return  l +": " +logDateTime +":"+ Message;
    }




}
