package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_ConvertEPUBToXPS_WithASingleLine {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Open an existing EPUB file for reading.
        try (var fileInputStream = new java.io.FileInputStream(dataDir + "input.epub")) {
            // Call the ConvertEPUB method to convert the EPUB to XPS.
            com.aspose.html.converters.Converter.convertEPUB(
                    fileInputStream,
                    new com.aspose.html.saving.XpsSaveOptions(),
                    dataDir + "output.xps"
            );
        }
    }
}