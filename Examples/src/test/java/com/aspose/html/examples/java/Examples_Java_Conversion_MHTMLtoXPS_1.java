package com.aspose.html.examples.java;

public class Examples_Java_Conversion_MHTMLtoXPS_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Source EPUUB document
        try (var fileInputStream = new java.io.FileInputStream(dataDir + "sample.mht")) {
            // Initialize XpsSaveOptions
            var options = new com.aspose.html.saving.XpsSaveOptions();

            options.setBackgroundColor(com.aspose.html.drawing.Color.getCyan());
            // Output file path
            var outputFile = dataDir + "MHTMLtoXPS_Output.xps";
            // Convert MHTML to XPS
            com.aspose.html.converters.Converter.convertMHTML(fileInputStream, options, outputFile);
        }
    }
}