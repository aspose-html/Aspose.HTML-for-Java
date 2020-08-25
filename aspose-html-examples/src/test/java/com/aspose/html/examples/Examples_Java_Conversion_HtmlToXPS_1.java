package com.aspose.html.examples;

public class Examples_Java_Conversion_HtmlToXPS_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        // Source HTML document
        var htmlDocument = new com.aspose.html.HTMLDocument(dataDir + "input.html");
        // Initialize XpsSaveOptions
        var options = new com.aspose.html.saving.XpsSaveOptions();

        options.setBackgroundColor(com.aspose.html.drawing.Color.getCyan());
        // Output file path
        var outputFile = dataDir + "input.xps";
        // Convert HTML to XPS
        com.aspose.html.converters.Converter.convertHTML(htmlDocument, options, outputFile);
    }
}