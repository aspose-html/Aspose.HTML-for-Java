package com.aspose.html.examples;


public class Examples_Java_Conversion_MHTMLtoXPS_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory
        String dataDir = RunExamples.getResourcePath();
        // Source EPUUB document
        try (java.io.FileInputStream fileInputStream = new java.io.FileInputStream(dataDir + "sample.mht")) {
            // Initialize XpsSaveOptions
            com.aspose.html.saving.XpsSaveOptions options = new com.aspose.html.saving.XpsSaveOptions();

            options.setBackgroundColor(com.aspose.html.drawing.Color.getCyan());
            // Output file path
            String outputFile = dataDir + "MHTMLtoXPS_Output.xps";
            // Convert MHTML to XPS
            com.aspose.html.converters.Converter.convertMHTML(fileInputStream, options, outputFile);
        }
    }
}