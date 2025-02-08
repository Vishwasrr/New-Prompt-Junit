package com.mylaptop.asts.test.constants;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class LocatorFileConstant {
    private static final Map<String, String> locators = new HashMap<>();

    static {
        try (InputStream inputStream = LocatorFileConstant.class.getClassLoader()
                .getResourceAsStream("locators/login.json")) {
            if (inputStream != null) {
                JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));
                jsonObject.keys().forEachRemaining(key -> locators.put(key, jsonObject.getString(key)));
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to load locators from login.json", e);
        }
    }

    public static String getLocator(String key) {
        return locators.get(key);
    }
}
