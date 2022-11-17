package DataProvider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.io.BufferedReader;


public class ConfigFileReader {

    private final Properties properties;

    public ConfigFileReader(){
        //this.properties = properties;
        BufferedReader bufferReader;
        FileReader fileReader;
        String propertyFilePath = "config/configuration.properties";
        try{
            fileReader = new FileReader(propertyFilePath);
            bufferReader = new BufferedReader(fileReader);
            properties = new Properties();
            try{
                properties.load(bufferReader);
                bufferReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
            throw new RuntimeException("configproperties not found at"+ propertyFilePath);
        }
    }

    public String getURL(){
        String url = properties.getProperty("url");
        if(url !=null)return url;
        else
            throw new RuntimeException("url not specified in the config file.");
    }
public String getHeadleassmode(){
         String headless = properties.getProperty("headless");
    if(headless !=null)return headless;
    else
        throw new RuntimeException("url not specified in the config file.");

}
    public long getTime(){
        String timeout = properties.getProperty("timeout");
        if (timeout != null){
            return Long.parseLong(timeout);
        }else{
            throw new RuntimeException("Timeput not specified in the config file.");
        }
    }

    public DriverType getBrowser()  {
        String browserName = properties.getProperty("browser");

        switch (browserName) {
            case "chrome":
                return DriverType.CHROME;
            case "firefox":
                return DriverType.FIREFOX;
            case "edge":
                return DriverType.EDGE;
            case "safari":
                return DriverType.SAFARI;
            case "html":
                return DriverType.HTML;
            default:
                throw new RuntimeException("Browser name key value in configuration file is not matched: " + browserName);
        }
    }

    public EnvironmentType getEnvironment() {
        String environmentName = properties.getProperty("environment");

        switch (environmentName) {
            case "local":
                return EnvironmentType.LOCAL;
            case "dev":
                return EnvironmentType.Dev;
            case "test":
                return EnvironmentType.Test;
            case "prod":
                return EnvironmentType.PROD;
            default:
                throw new RuntimeException("Environment type key value in configuration file is not matched: " + environmentName);
        }
    }

}
