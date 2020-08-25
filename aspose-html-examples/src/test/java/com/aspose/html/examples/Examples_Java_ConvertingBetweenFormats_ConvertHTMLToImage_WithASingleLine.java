package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertHTMLToImage_WithASingleLine {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        // Invoke the ConvertHTML method to convert the HTML code to image.
        com.aspose.html.converters.Converter.convertHTML(
                "<span>Hello</span> <span>World!!</span>",
                ".",
                new com.aspose.html.saving.ImageSaveOptions(
                        com.aspose.html.rendering.image.ImageFormat.Jpeg
                ),
                dataDir + "output.jpg"
        );
    }
}