package com.aspose.html.examples.java;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RunExamples {

    public static void main(String... args) {
        System.out.println("=====================================================");

        System.exit(0);
    }

    public static String GetDataDir_Data() {
        Path resourceDirectory = Paths.get("src","test","resources");
        return resourceDirectory.toFile().getAbsolutePath() + "/Data/";
    }
}