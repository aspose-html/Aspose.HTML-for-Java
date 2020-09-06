package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertSVGToPDF_WithASingleLine {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
// Prepare an SVG code.
        String code = "<svg xmlns='http://www.w3.org/2000/svg'>\n" +
                      "<circle cx='50' cy='50' r='40' stroke='black' stroke-width='3' fill='red' />\n" +
                      "</svg>\n";

        // Call the ConvertSVG method to convert the SVG code to PDF.
        com.aspose.html.converters.Converter.convertSVG(
                code,
                ".",
                new com.aspose.html.saving.PdfSaveOptions(),
                Resources.output("output.pdf")
        );
    }
}