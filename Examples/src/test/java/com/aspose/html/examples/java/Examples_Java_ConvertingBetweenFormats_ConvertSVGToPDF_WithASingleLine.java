package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_ConvertSVGToPDF_WithASingleLine {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Prepare an SVG code.
        var code = """
                <svg xmlns='http://www.w3.org/2000/svg'>
                <circle cx='50' cy='50' r='40' stroke='black' stroke-width='3' fill='red' />
                </svg>
                """;

        // Call the ConvertSVG method to convert the SVG code to PDF.
        com.aspose.html.converters.Converter.convertSVG(
                code,
                ".",
                new com.aspose.html.saving.PdfSaveOptions(),
                dataDir + "output.pdf"
        );
    }
}