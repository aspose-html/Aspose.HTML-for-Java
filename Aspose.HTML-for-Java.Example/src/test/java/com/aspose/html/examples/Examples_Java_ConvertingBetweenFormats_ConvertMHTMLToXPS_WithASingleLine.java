package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertMHTMLToXPS_WithASingleLine {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Open an existing MHTML file for reading.
        try (java.io.FileInputStream fileInputStream = new java.io.FileInputStream(Resources.input("sample.mht"))) {
            // Call the ConvertMHTML method to convert the MHTML to XPS.
            com.aspose.html.converters.Converter.convertMHTML(
                    fileInputStream,
                    new com.aspose.html.saving.XpsSaveOptions(),
                    Resources.output("output.xps")
            );
        }
    }
}
