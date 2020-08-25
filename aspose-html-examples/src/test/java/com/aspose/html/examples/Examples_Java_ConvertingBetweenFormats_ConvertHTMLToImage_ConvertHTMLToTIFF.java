package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertHTMLToImage_ConvertHTMLToTIFF {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        // Prepare an HTML code and save it to the file.
        var code = "<span>Hello</span> <span>World!!</span>";
        try (var fileWriter = new java.io.FileWriter(dataDir + "document.html")) {
            fileWriter.write(code);
        }

        // Initialize an HTML document from the html file
        var document = new com.aspose.html.HTMLDocument(dataDir + "document.html");
        try {
            // Initialize ImageSaveOptions
            var options = new com.aspose.html.saving.ImageSaveOptions(com.aspose.html.rendering.image.ImageFormat.Tiff);

            // Convert HTML to TIFF
            com.aspose.html.converters.Converter.convertHTML(document, options, dataDir + "output.tiff");
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}