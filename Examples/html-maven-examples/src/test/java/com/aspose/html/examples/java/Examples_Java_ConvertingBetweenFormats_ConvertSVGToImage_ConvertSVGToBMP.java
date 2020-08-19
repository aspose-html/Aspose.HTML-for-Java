package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_ConvertSVGToImage_ConvertSVGToBMP {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Prepare an SVG code and save it to the file.
        var code = """
                <svg xmlns='http://www.w3.org/2000/svg'>
                <circle cx='50' cy='50' r='40' stroke='black' stroke-width='3' fill='red' />
                </svg>
                """;
        try (var fileWriter = new java.io.FileWriter(dataDir + "document.svg")) {
            fileWriter.write(code);
        }

        // Initialize an SVG document from the svg file.
        var document = new com.aspose.html.dom.svg.SVGDocument(dataDir + "document.svg");
        try {
            // Initialize ImageSaveOptions
            var options = new com.aspose.html.saving.ImageSaveOptions(com.aspose.html.rendering.image.ImageFormat.Bmp);

            // Convert HTML to BMP
            com.aspose.html.converters.Converter.convertSVG(
                    document,
                    options,
                    dataDir + "output.bmp"
            );
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}