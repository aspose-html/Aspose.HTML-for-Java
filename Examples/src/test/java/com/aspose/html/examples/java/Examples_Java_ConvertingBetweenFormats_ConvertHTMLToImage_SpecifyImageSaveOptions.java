package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_ConvertHTMLToImage_SpecifyImageSaveOptions {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Prepare an HTML code and save it to the file
        var code = "<span>Hello</span> <span>World!!</span>";
        try (var fileWriter = new java.io.FileWriter(dataDir + "document.html")) {
            fileWriter.write(code);
        }

        // Set up the page-size 3000x1000 pixels and change the background color to green
        var options = new com.aspose.html.saving.ImageSaveOptions(com.aspose.html.rendering.image.ImageFormat.Jpeg);
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

        options.setBackgroundColor(com.aspose.html.drawing.Color.getGreen());

        // Call the ConvertHTML to convert 'document.html' into jpeg image
        com.aspose.html.converters.Converter.convertHTML(
                dataDir + "document.html",
                options,
                dataDir + "output.jpg"
        );
    }
}