package com.aspose.html.examples;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Resources {
    public static String input(String inputfileName) {
        URL inputUrl = Resources.class.getClassLoader().getResource(inputfileName);
        if (inputUrl == null) {
            URL rootSource = Resources.class.getClassLoader().getResource(".");
            throw new Error(String.format("Not found input file  '%s' in path %s ", inputfileName, rootSource.getPath()));
        }

        System.out.println("In "+ inputUrl.toExternalForm());
        return inputUrl.getFile();
    }

    public static String outputDirectory() throws IOException {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement element = null;
        for (StackTraceElement stackTraceElement : stackTrace) {
            if(!stackTraceElement.getClassName().equals(Resources.class.getCanonicalName())
            && stackTraceElement.getClassName().startsWith("com.aspose")) {
                element = stackTraceElement;
                break;
            }
        }

        List<String> strings = Arrays.asList(element.getClassName().split("\\."));
        String simpleClassName = strings.get(strings.size()-1);


        String rootDir = Enviroment.enviroment("OUTPUT_DIR_OF_TEST_RESULT", "test-output");
        Path outputDir = Paths.get(rootDir, simpleClassName);
        if(!outputDir.toFile().exists()) {
            System.out.println("Create dir file://"+outputDir.toFile().getAbsolutePath());
            Files.createDirectories(outputDir);
        }
        return outputDir.toFile().getAbsolutePath();
    }

    public static String output(String outputfileName) throws IOException {
        Path pathResource = Paths.get(outputDirectory(), outputfileName);
        System.out.println("Out file://"+pathResource.toFile().getAbsolutePath());
        return pathResource.toString();

    }

    public static String outputResource(String name, String format) throws IOException {
/*
        String outputfileName = MessageFormat.format("{0}.v_{1}.ts_{2}.out.{3}",
                name, Enviroment.productVersion(), Enviroment.timestamp(), format);
*/
        String outputfileName = MessageFormat.format("{0}.v_{1}.out.{3}",
                name, Enviroment.productVersion(),  format);
        Path pathResource = Paths.get(outputDirectory(), outputfileName);
        return pathResource.toString();
    }
}
