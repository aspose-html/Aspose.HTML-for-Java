package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertMHTMLToPDF_SpecifyPdfSaveOptions {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        // Open an existing MHTML file for reading.
        try (var fileInputStream = new java.io.FileInputStream(dataDir + "sample.mht")) {
            // Create an instance of the PdfSaveOptions with a custom page-size and a background-color.
            var options = new com.aspose.html.saving.PdfSaveOptions();
            var pageSetup = new com.aspose.html.rendering.PageSetup();
            var anyPage = new com.aspose.html.drawing.Page();
            anyPage.setSize(
                    new com.aspose.html.drawing.Size(
                            com.aspose.html.drawing.Length.fromPixels(3000),
                            com.aspose.html.drawing.Length.fromPixels(1000)
                    )
            );
            pageSetup.setAnyPage(anyPage);
            options.setPageSetup(pageSetup);

            options.setBackgroundColor(com.aspose.html.drawing.Color.getAliceBlue());

            // Call the ConvertMHTML method to convert the MHTML to PDF.
            com.aspose.html.converters.Converter.convertMHTML(
                    fileInputStream,
                    options,
                    dataDir + "output.pdf"
            );
        }
    }
}