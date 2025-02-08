package com.mylaptop.asts.test.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static final Properties properties = new Properties();

    static {
        try (FileInputStream fileInputStream = new FileInputStream("src/test/resources/properties/configuration.properties")) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException("Configuration properties file not found", e);
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
