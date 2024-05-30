package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertMHTMLToXPS_ConvertMHTMLFileToXPS {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Open an existing MHTML file for reading.
        try (java.io.FileInputStream fileInputStream = new java.io.FileInputStream(Resources.input("sample.mht"))) {
            // Create an instance of XpsSaveOptions.
            com.aspose.html.saving.XpsSaveOptions options = new com.aspose.html.saving.XpsSaveOptions();

            // Call the ConvertMHTML method to convert the MHTML to XPS.
            com.aspose.html.converters.Converter.convertMHTML(
                    fileInputStream,
                    options,
                    Resources.output("output.xps")
            );
        }
    }
}
