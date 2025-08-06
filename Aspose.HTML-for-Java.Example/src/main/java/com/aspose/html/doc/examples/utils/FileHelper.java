package com.aspose.html.doc.examples.utils;

import com.aspose.html.io.OutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHelper {
    public static void writeAllText(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static void writeAllText(Path fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName.toFile())) {
            writer.write(content);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    public static boolean exists(String fileName) {
        return new java.io.File(fileName).exists();
    }

    public static boolean exists(Path fileName) {
        return fileName.toFile().exists();
    }

    public static FileInputStream openRead(String input) {
        try {
            return new FileInputStream(Paths.get(input).toFile());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static java.io.File create(Path output) {
        return output.toFile();
    }

    public static java.io.File create(String output) {
        java.io.File file = new java.io.File(output);
        return file;
    }

    public static void writeAllBytes(Path combine, byte[] bytes) {

    }

    public static void writeAllBytes(String combine, byte[] bytes) {

    }

    public static void save(OutputStream memory, java.io.File fs) {
//        File.save(memory, fs);

    }
}
