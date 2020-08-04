package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_ConvertEPUBToXPS_SpecifyXpsSaveOptions {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Open an existing EPUB file for reading.
        try (var fileInputStream = new java.io.FileInputStream(dataDir + "input.epub")) {
            // Create an instance of the XpsSaveOptions with a custom page-size and a background-color.
            var options = new com.aspose.html.saving.XpsSaveOptions();
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

            // Call the ConvertEPUB method to convert the EPUB to XPS.
            com.aspose.html.converters.Converter.convertEPUB(
                    fileInputStream,
                    options,
                    dataDir + "output.xps"
            );
        }
    }
}