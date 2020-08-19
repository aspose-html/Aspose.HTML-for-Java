package com.aspose.html.examples.java;

public class Examples_Java_Conversion_HTMLtoBMP_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Source HTML document
        var htmlDocument = new com.aspose.html.HTMLDocument(dataDir + "input.html");
        // Initialize ImageSaveOptions
        var options = new com.aspose.html.saving.ImageSaveOptions(com.aspose.html.rendering.image.ImageFormat.Bmp);
        // Output file path
        var outputFile = dataDir + "HTMLtoBMP_Output.bmp";
        // Convert HTML to BMP
        com.aspose.html.converters.Converter.convertHTML(htmlDocument, options, outputFile);
    }
}