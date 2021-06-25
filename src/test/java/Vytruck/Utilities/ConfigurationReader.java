package Vytruck.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    static Properties properties = new Properties();

    static {

        try {

            FileInputStream fileInputStream = new FileInputStream("configuration.properties");

            properties.load(fileInputStream);

            fileInputStream.close();

        } catch (IOException e) {
            System.out.println("File not found in Configuration properties");
        }
    }

    public static String getProperties(String key){
        return properties.getProperty(key);
    }

}
