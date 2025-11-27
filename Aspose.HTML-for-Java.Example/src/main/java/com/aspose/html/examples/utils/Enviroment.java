package com.aspose.html.examples.utils;

import java.text.SimpleDateFormat;

public class Enviroment {

    public static String productVersion() {
        return Enviroment.enviroment("PRODUCT_VERSION");
    }

    public static String enviroment(String envName) {
        return enviroment(envName, "");
    }

    public static String enviroment(String envName, String defaultValue) {
        String envValue = System.getProperty(envName, System.getenv(envName));
        if (envValue != null) {
            return envValue;
        }
        return defaultValue;
    }

    private static void printEnviroment() {
        System.getenv().entrySet().forEach(
                e -> System.out.println("java sysenv: " + e.getKey() + "=" + e.getValue()));

        System.getProperties().stringPropertyNames().forEach(
                name -> System.out.println("java sys prop: " + name + "=" + System.getProperty(name)));
    }

    public static String timestamp() {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").format(System.currentTimeMillis());
        return timestamp;
    }
}