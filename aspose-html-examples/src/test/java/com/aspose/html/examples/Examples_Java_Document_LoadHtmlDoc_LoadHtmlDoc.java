package com.aspose.html.examples;

public class Examples_Java_Document_LoadHtmlDoc_LoadHtmlDoc {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory.
        String dataDir = RunExamples.getResourcePath();

        String InputHtml = dataDir + "input.html";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter(InputHtml)) {
            // Write sample HTML tags to HTML file
            fileWriter.write("<p>this is a simple text");
        }
    }
}