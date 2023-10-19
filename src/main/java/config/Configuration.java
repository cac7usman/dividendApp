package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
    private static final String CONFIG_FILE_DEV = "application-dev.properties";
    private static final String CONFIG_FILE_PRD = "application-prd.properties";

    private static Properties properties = new Properties();

    static {
        String environment = System.getProperty("app.environment", "prd");
        String configFile = environment.equals("prd") ? CONFIG_FILE_PRD : CONFIG_FILE_DEV;

        try (InputStream input = Configuration.class.getClassLoader().getResourceAsStream(configFile)) {
            if (input != null) {
                properties.load(input);
            } else {
                throw new IOException("Unable to load configuration file: " + configFile);
            }
        } catch (IOException e) {
            throw new RuntimeException("Error loading configuration file: " + e.getMessage(), e);
        }
    }

    public static String getPolygonToken() {
        return properties.getProperty("api.polygon.token");
    }

    public static String getAPIName() { return properties.getProperty("api.name");}

    public static String getGoogleSpreadsheetId() {
        return properties.getProperty("google.spreadsheet.id");
    }

    public static String getGoogleSpreadsheetReadName() {
        return properties.getProperty("google.spreadsheet.read.name");
    }

    public static String getGoogleSpreadsheetReadRange() {
        return properties.getProperty("google.spreadsheet.read.range");
    }

    public static String getGoogleSpreadsheetWriteDividendName() {
        return properties.getProperty("google.spreadsheet.write.dividend.name");
    }

    public static String getGoogleSpreadsheetWriteDividendRange() {
        return properties.getProperty("google.spreadsheet.write.dividend.range");
    }

}
