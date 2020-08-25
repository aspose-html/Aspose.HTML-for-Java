package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertSVGToImage_SpecifyImageSaveOptions {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        // Prepare an SVG code and save it to the file
        var code = """
                <svg xmlns='http://www.w3.org/2000/svg'>
                <circle cx='50' cy='50' r='40' stroke='black' stroke-width='3' fill='red' />
                </svg>
                """;
        try (var fileWriter = new java.io.FileWriter(dataDir + "document.svg")) {
            fileWriter.write(code);
        }

        // Set up the page-size to 3000x1000 pixels and change the background color.
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

        options.setBackgroundColor(com.aspose.html.drawing.Color.getAliceBlue());

        // Call the ConvertSVG to convert 'document.html' into jpeg image
        com.aspose.html.converters.Converter.convertSVG(
                dataDir + "document.svg",
                options,
                dataDir + "output.jpg"
        );
    }
}