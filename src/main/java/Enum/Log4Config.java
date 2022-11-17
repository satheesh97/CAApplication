package Enum;

import org.apache.logging.log4j.*;

import java.util.Properties;

public class Log4Config {
   // static final Logger log = LogManager.getLogger(Log4Config.class);
    public static void main(String arg[]){

Logger log = LogManager.getLogger("Log4Config");
log.info("Error");
log.debug("for debug");
log.error("for error");
log.warn("warn for");

        }


    }


