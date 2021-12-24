package properties;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static final Properties config;

    static {
        config = new Properties();

        try {
            config.load(new BufferedReader(new FileReader("properties/config.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String appEnvironmentInUse(){return config.getProperty("env");}

    public static String fileLocation(){return config.getProperty("file_location");}




}
