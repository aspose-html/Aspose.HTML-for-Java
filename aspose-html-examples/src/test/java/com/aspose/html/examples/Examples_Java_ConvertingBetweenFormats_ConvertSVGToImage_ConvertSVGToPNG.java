package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertSVGToImage_ConvertSVGToPNG {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Prepare an SVG code and save it to the file.
        String code = "<svg xmlns='http://www.w3.org/2000/svg'>\n" +
                      "<circle cx='50' cy='50' r='40' stroke='black' stroke-width='3' fill='red' />\n" +
                      "</svg>\n";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter(Resources.output("document.svg"))) {
            fileWriter.write(code);
        }

        // Initialize an SVG document from the svg file.
        com.aspose.html.dom.svg.SVGDocument document = new com.aspose.html.dom.svg.SVGDocument(Resources.output("document.svg"));
        try {
            // Initialize ImageSaveOptions
            com.aspose.html.saving.ImageSaveOptions options = new com.aspose.html.saving.ImageSaveOptions(
                    com.aspose.html.rendering.image.ImageFormat.Png
            );

            // Convert SVG to PNG
            com.aspose.html.converters.Converter.convertSVG(
                    document,
                    options,
                    Resources.output("output.png")
            );
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}
