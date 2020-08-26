package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertMHTMLToXPS_SpecifyXpsSaveOptions {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        String dataDir = RunExamples.getResourcePath();
        // Open an existing MHTML file for reading.
        try (java.io.FileInputStream fileInputStream = new java.io.FileInputStream(dataDir + "sample.mht")) {
            // Create an instance of the XpsSaveOptions with a custom page-size and a background-color.
            com.aspose.html.saving.XpsSaveOptions options = new com.aspose.html.saving.XpsSaveOptions();
            com.aspose.html.rendering.PageSetup pageSetup = new com.aspose.html.rendering.PageSetup();
            com.aspose.html.drawing.Page anyPage = new com.aspose.html.drawing.Page();
            anyPage.setSize(
                    new com.aspose.html.drawing.Size(
                            com.aspose.html.drawing.Length.fromPixels(3000),
                            com.aspose.html.drawing.Length.fromPixels(1000)
                    )
            );
            pageSetup.setAnyPage(anyPage);
            options.setPageSetup(pageSetup);

            options.setBackgroundColor(com.aspose.html.drawing.Color.getAliceBlue());

            // Call the ConvertMHTML method to convert the MHTML to XPS.
            com.aspose.html.converters.Converter.convertMHTML(
                    fileInputStream,
                    options,
                    dataDir + "output.xps"
            );
        }
    }
}