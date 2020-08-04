package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_ConvertHTMLToXPS_ConvertHTMLDocumentToXPS {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Prepare an HTML code and save it to the file.
        var code = "<span>Hello World!!</span>";
        try (var fileWriter = new java.io.FileWriter(dataDir + "document.html")) {
            fileWriter.write(code);
        }

        // Initialize an HTML document from the file
        var document = new com.aspose.html.HTMLDocument(dataDir + "document.html");
        try {
            // Initialize XpsSaveOptions
            var options = new com.aspose.html.saving.XpsSaveOptions();

            // Convert HTML to XPS
            com.aspose.html.converters.Converter.convertHTML(
                    document,
                    options,
                    dataDir + "output.xps"
            );
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}