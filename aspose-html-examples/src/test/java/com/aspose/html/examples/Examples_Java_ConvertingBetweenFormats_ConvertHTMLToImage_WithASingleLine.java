package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertHTMLToImage_WithASingleLine {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
// Invoke the ConvertHTML method to convert the HTML code to image.
        com.aspose.html.converters.Converter.convertHTML(
                "<span>Hello</span> <span>World!!</span>",
                ".",
                new com.aspose.html.saving.ImageSaveOptions(
                        com.aspose.html.rendering.image.ImageFormat.Jpeg
                ),
                Resources.output("output.jpg")
        );
    }
}