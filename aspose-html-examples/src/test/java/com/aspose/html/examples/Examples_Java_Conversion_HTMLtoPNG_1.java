package com.aspose.html.examples;

public class Examples_Java_Conversion_HTMLtoPNG_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory
        String dataDir = RunExamples.getResourcePath();
        // Source HTML document
        com.aspose.html.HTMLDocument htmlDocument = new com.aspose.html.HTMLDocument(dataDir + "input.html");
        // Initialize ImageSaveOptions
        com.aspose.html.saving.ImageSaveOptions options = new com.aspose.html.saving.ImageSaveOptions(com.aspose.html.rendering.image.ImageFormat.Png);
        // Output file path
        String outputFile = dataDir + "HTMLtoPNG_Output.png";
        // Convert HTML to PNG
        com.aspose.html.converters.Converter.convertHTML(htmlDocument, options, outputFile);
    }
}