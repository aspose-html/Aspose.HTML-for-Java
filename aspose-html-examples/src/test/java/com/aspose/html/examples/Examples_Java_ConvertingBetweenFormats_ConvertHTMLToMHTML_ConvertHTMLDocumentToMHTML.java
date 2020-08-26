package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertHTMLToMHTML_ConvertHTMLDocumentToMHTML {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        String dataDir = RunExamples.getResourcePath();
        // Prepare an HTML code and save it to the file.
        String code = "<span>Hello World!!</span>";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter(dataDir + "document.html")) {
            fileWriter.write(code);
        }

        // Initialize an HTML document from the file
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(dataDir + "document.html");
        try {
            // Initialize MHTMLSaveOptions
            com.aspose.html.saving.MHTMLSaveOptions options = new com.aspose.html.saving.MHTMLSaveOptions();

            // Convert HTML to MHT
            com.aspose.html.converters.Converter.convertHTML(
                    document,
                    options,
                    dataDir + "output.mht"
            );
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}