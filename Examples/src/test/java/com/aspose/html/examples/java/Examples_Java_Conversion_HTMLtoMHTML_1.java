package com.aspose.html.examples.java;

public class Examples_Java_Conversion_HTMLtoMHTML_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Source HTML Document
        var htmlDocument = new com.aspose.html.HTMLDocument(dataDir + "input.html");
        // Initialize MHTMLSaveOptions
        var options = new com.aspose.html.saving.MHTMLSaveOptions();
        // Set the resource handling rules
        options.getResourceHandlingOptions().setMaxHandlingDepth(1);
        // Output file path
        var outputPDF = dataDir + "HTMLtoMHTML_Output.mht";
        // Convert HTML to MHTML
        com.aspose.html.converters.Converter.convertHTML(htmlDocument, options, outputPDF);
    }
}