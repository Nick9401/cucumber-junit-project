package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //create the object of Properties class
    //We need properties class to use methods coming  from getProperty("key
    private static Properties properties = new Properties();


   static {
        try{
        //Create the object of FileInputStream
        //We need this object to open file as a stream in java memory
        FileInputStream file = new FileInputStream("config.properties");

        //Load the properties object using FileInputStream object
        //Load "properties" object with the "file" we opened using FileInputStream
        properties.load(file);
        file.close();
    }catch(IOException e){
            e.printStackTrace();

    }
    }
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}
