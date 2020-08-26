package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertSVGToImage_WithASingleLine {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        String dataDir = RunExamples.getResourcePath();
        // Prepare an SVG code.
        String code = "<svg xmlns='http://www.w3.org/2000/svg'>\n" +
                      "<circle cx='50' cy='50' r='40' stroke='black' stroke-width='3' fill='red' />\n" +
                      "</svg>\n";

        // Invoke the ConvertSVG method to convert the SVG code to image.
        com.aspose.html.converters.Converter.convertSVG(
                code,
                ".",
                new com.aspose.html.saving.ImageSaveOptions(
                        com.aspose.html.rendering.image.ImageFormat.Jpeg
                ),
                dataDir + "output.jpg"
        );
    }
}