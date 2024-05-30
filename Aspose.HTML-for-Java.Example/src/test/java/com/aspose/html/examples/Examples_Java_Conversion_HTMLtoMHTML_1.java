package com.aspose.html.examples;

public class Examples_Java_Conversion_HTMLtoMHTML_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {

        // Source HTML Document
        com.aspose.html.HTMLDocument htmlDocument = new com.aspose.html.HTMLDocument(Resources.input("input.html"));
        // Initialize MHTMLSaveOptions
        com.aspose.html.saving.MHTMLSaveOptions options = new com.aspose.html.saving.MHTMLSaveOptions();
        // Set the resource handling rules
        options.getResourceHandlingOptions().setMaxHandlingDepth(1);
        // Output file path
        String outputPDF = Resources.output("HTMLtoMHTML_Output.mht");
        // Convert HTML to MHTML
        com.aspose.html.converters.Converter.convertHTML(htmlDocument, options, outputPDF);
    }
}