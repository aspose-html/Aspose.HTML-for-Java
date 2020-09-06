package com.aspose.html.examples;

public class Examples_Java_Conversion_MHTMLtoXPS_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Source EPUUB document
        try (java.io.FileInputStream fileInputStream = new java.io.FileInputStream(Resources.input("sample.mht"))) {
            // Initialize XpsSaveOptions
            com.aspose.html.saving.XpsSaveOptions options = new com.aspose.html.saving.XpsSaveOptions();

            options.setBackgroundColor(com.aspose.html.drawing.Color.getCyan());
            // Output file path
            String outputFile = Resources.output("MHTMLtoXPS_Output.xps");
            // Convert MHTML to XPS
            com.aspose.html.converters.Converter.convertMHTML(fileInputStream, options, outputFile);
        }
    }
}