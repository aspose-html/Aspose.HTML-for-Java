package com.aspose.html.examples.java;

public class Examples_Java_Document_LoadHtmlDoc_LoadHtmlDoc {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory.
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();

        String InputHtml = dataDir + "input.html";
        try (var fileWriter = new java.io.FileWriter(InputHtml)) {
            // Write sample HTML tags to HTML file
            fileWriter.write("<p>this is a simple text");
        }
    }
}