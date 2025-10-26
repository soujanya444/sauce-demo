package com.fayda.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtils {

    private static Properties props;

    public static void initProperties(){
        String propertiesFile=System.getProperty("user.dir");
        try {
            FileInputStream in = new FileInputStream(propertiesFile.concat("/src/test/resources/config.property"));
            props = new Properties();
            props.load(in);
        }catch(Exception ex){
            throw new RuntimeException(ex.getCause());
        }
    }

    public static String getProperty(String key){
        if(props==null)
            initProperties();
        return props.getProperty(key);
    }
}
