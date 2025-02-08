package com.mylaptop.asts.test.utils;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.IOException;
import java.io.InputStream;

public class TestDataReader {
    private static final JSONObject testData;

    static {
        try (InputStream inputStream = TestDataReader.class.getClassLoader()
                .getResourceAsStream("testdata/loginData.json")) {
            if (inputStream != null) {
                testData = new JSONObject(new JSONTokener(inputStream));
            } else {
                throw new RuntimeException("loginData.json file not found");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getData(String key) {
        return testData.getString(key);
    }
}
