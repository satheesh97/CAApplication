package com.step.steps;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jPrint {
     static Logger Log = LogManager.getLogger(Log4jPrint.class.getName());


    public static void startTestCase(String sTestCaseName){

        Log.info("****************************************************************************************");

        Log.info("****************************************************************************************");

        Log.info("$$$$$$$$$$$$$$$$$$$$$                 "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");

        Log.info("****************************************************************************************");

        Log.info("****************************************************************************************");

    }

    //This is to print log for the ending of the test case

    public static void endTestCase(String sTestCaseName){

        Log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");

        Log.info("X");

        Log.info("X");

        Log.info("X");

        Log.info("X");

    }

    // Need to create these methods, so that they can be called

    public static void info(String message) {

        Log.info(message);

    }

    public static void warn(String message) {

        Log.warn(message);

    }

    public static void error(String message) {

        Log.error(message);

    }

    public static void fatal(String message) {

        Log.fatal(message);

    }

    public static void debug(String message) {

        Log.debug(message);

    }

}
