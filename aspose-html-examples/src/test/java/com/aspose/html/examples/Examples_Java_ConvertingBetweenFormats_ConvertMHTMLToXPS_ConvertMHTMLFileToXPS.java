package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertMHTMLToXPS_ConvertMHTMLFileToXPS {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        // Open an existing MHTML file for reading.
        try (var fileInputStream = new java.io.FileInputStream(dataDir + "sample.mht")) {
            // Create an instance of XpsSaveOptions.
            var options = new com.aspose.html.saving.XpsSaveOptions();

            // Call the ConvertMHTML method to convert the MHTML to XPS.
            com.aspose.html.converters.Converter.convertMHTML(
                    fileInputStream,
                    options,
                    dataDir + "output.xps"
            );
        }
    }
}