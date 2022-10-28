package Managers;

import DataProvider.ConfigFileReader;
import okhttp3.internal.cache.CacheInterceptor;

public class FileReaderManager {

    private static final FileReaderManager fileReafderMANAGER = new FileReaderManager();

    private static ConfigFileReader configFileReader;

    private FileReaderManager(){

    }

    public static FileReaderManager getInstance(){
        return fileReafderMANAGER;
    }
    public ConfigFileReader getConfigFileReader(){
        return (configFileReader == null)?new ConfigFileReader():configFileReader;
    }




}
