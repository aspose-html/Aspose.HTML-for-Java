package com.aspose.html.examples;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;

public class Resources {
    public static String input(String inputfileName) {
        URL inputUrl = Resources.class.getClassLoader().getResource(inputfileName);
        if (inputUrl == null) {
            URL rootSource = Resources.class.getClassLoader().getResource(".");
            throw new Error(String.format("Not found input file  '%s' in path %s ", inputfileName, rootSource.getPath()));
        }

        BannersPrinter.printOutputResourcesUrl("In ",inputUrl);
        try {
            return Paths.get(inputUrl.toURI()).toString();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
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
            BannersPrinter.printOutputResourcesUrl("Create dir ",outputDir.toUri().toURL());
            Files.createDirectories(outputDir);
        }
        return outputDir.toFile().getAbsolutePath();
    }

    public static String output(String outputfileName) throws IOException {
        Path pathResource = Paths.get(outputDirectory(), outputfileName);
        BannersPrinter.printOutputResourcesUrl("Out ",pathResource.toUri().toURL());
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

    public static String toFileString(URL url) {
        try {
            return Paths.get(url.toURI()).toString();
        }
        catch (Exception exc) {
            throw new RuntimeException(exc);
        }
    }

    public static class BannersPrinter {
        private static final Logger log = new Logger();

        public static synchronized void printOutputResourcesUrl(String prefix, URL inputUrl) {
//            log.info("========= Begin block : Output resource url ===================================== ");
//            log.info("=== ");
            log.info("===>>  "+prefix+" : " + toURLString(inputUrl));
//            log.info("=== ");
//            log.info("========= End block : Output resource url ======================================= ");

        }

        public static String toURLString(URL url) {
            return url.getProtocol() + "://" + url.getPath();
        }

        public static String toURLString(Path path) {
            try {
                return toURLString(path.toUri().toURL());
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
    //        return new File(path.toUri()).toString();
        }


    }

    public static class Logger {
        public static void info(String text) {
            System.out.println(text);
        }
    }
}
