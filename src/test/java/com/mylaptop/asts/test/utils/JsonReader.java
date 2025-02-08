package com.mylaptop.asts.test.utils;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.IOException;

public class JsonReader {
    public static JsonObject readJsonFile() {
        try (FileReader reader = new FileReader("src/test/resources/testdata/loginData.json")) {
            return JsonParser.parseReader(reader).getAsJsonObject();
        } catch (IOException e) {
            throw new RuntimeException("Failed to read loginData.json", e);
        }
    }

    public static void main(String[] args) {
        JsonObject jsonObject = readJsonFile();
        String username = jsonObject.getAsJsonObject("validUser").get("username").getAsString();
        String password = jsonObject.getAsJsonObject("validUser").get("password").getAsString();
        System.out.println("Username: " + username + ", Password: " + password);
    }
}
