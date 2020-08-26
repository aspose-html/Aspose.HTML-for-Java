package com.aspose.html.examples;


public class Examples_Java_Conversion_EPUBtoXPS_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory
        String dataDir = RunExamples.getResourcePath();
        // Source EPUB document
        try (java.io.FileInputStream fileInputStream = new java.io.FileInputStream(dataDir + "input.epub")) {
            // Initialize XpsSaveOptions
            com.aspose.html.saving.XpsSaveOptions options = new com.aspose.html.saving.XpsSaveOptions();

            options.setBackgroundColor(com.aspose.html.drawing.Color.getCyan());
            // Output file path
            String outputFile = dataDir + "EPUBtoXPS_Output.xps";
            // Convert EPUB to XPS
            com.aspose.html.converters.Converter.convertEPUB(fileInputStream, options, outputFile);
        }
    }
}