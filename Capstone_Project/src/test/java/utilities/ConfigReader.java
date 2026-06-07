package utilities;

import java.io.FileInputStream;
import java.io.File;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop = new Properties();

    static {
        try {
            // Try both Maven and Eclipse path formats
            String[] paths = {
                System.getProperty("user.dir") + "/src/test/resources/config.properties",
                System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties",
                "src/test/resources/config.properties",
                "src\\test\\resources\\config.properties"
            };

            boolean loaded = false;
            for (String path : paths) {
                File f = new File(path);
                if (f.exists()) {
                    prop.load(new FileInputStream(f));
                    System.out.println("Config loaded from: " + f.getAbsolutePath());
                    loaded = true;
                    break;
                }
            }

            if (!loaded) {
                // Fallback: hardcode so project still runs
                System.out.println("WARNING: config.properties not found. Using defaults.");
                prop.setProperty("browser", "chrome");
                prop.setProperty("url", "https://testautomationpractice.blogspot.com");
            }

        } catch (Exception e) {
            e.printStackTrace();
            prop.setProperty("browser", "chrome");
            prop.setProperty("url", "https://testautomationpractice.blogspot.com");
        }
    }

    public static String get(String key) {
        return prop.getProperty(key);
    }
}
