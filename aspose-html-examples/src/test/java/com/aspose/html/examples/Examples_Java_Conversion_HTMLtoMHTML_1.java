package com.aspose.html.examples;

public class Examples_Java_Conversion_HTMLtoMHTML_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory
        String dataDir = RunExamples.getResourcePath();
        // Source HTML Document
        com.aspose.html.HTMLDocument htmlDocument = new com.aspose.html.HTMLDocument(dataDir + "input.html");
        // Initialize MHTMLSaveOptions
        com.aspose.html.saving.MHTMLSaveOptions options = new com.aspose.html.saving.MHTMLSaveOptions();
        // Set the resource handling rules
        options.getResourceHandlingOptions().setMaxHandlingDepth(1);
        // Output file path
        String outputPDF = dataDir + "HTMLtoMHTML_Output.mht";
        // Convert HTML to MHTML
        com.aspose.html.converters.Converter.convertHTML(htmlDocument, options, outputPDF);
    }
}