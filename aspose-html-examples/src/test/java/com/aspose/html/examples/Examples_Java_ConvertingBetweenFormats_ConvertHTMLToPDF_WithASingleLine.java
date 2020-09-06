package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertHTMLToPDF_WithASingleLine {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
// Invoke the ConvertHTML method to convert the HTML to PDF.
        com.aspose.html.converters.Converter.convertHTML(
                "<span>Hello World!!</span>",
                ".",
                new com.aspose.html.saving.PdfSaveOptions(),
                Resources.output("output.pdf")
        );
    }
}