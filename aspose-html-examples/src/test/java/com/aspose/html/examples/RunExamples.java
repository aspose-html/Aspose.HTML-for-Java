package com.aspose.html.examples;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RunExamples {

    public static void main(String... args) {
        System.out.println("Open com.aspose.html.examples.RunExamples.java. \nIn main(String... args) method uncomment the example that you want to run.");
        System.out.println("=====================================================");

        System.exit(0);
    }

    public static String GetDataDir_Data() {
        Path resourceDirectory = Paths.get("src","test","resources");
        return resourceDirectory.toFile().getAbsolutePath() + "/Data/";
    }
}