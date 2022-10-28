package Enum;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Properties;

public class Log4Config {
    static final Logger log = LogManager.getLogger(Log4Config.class);
    public static void main(String arg[]){
        PropertyConfigurator.configure("src/log4j2.properties");
       // BasicConfigurator.configure();;
        log.info("hy Iam Logger");
        log.debug("Debug message");
        log.error("Error messg");
        log.fatal("fatal Mesage");
        loginTest();

    }
    public static void loginTest(){
        log.error("error");
    }

    public void info(String S) {
log.info(S);
    }

    public void error(String S){
        log.error(S);
    }

}
