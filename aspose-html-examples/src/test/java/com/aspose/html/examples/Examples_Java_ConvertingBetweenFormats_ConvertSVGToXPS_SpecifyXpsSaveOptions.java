package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertSVGToXPS_SpecifyXpsSaveOptions {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Prepare an SVG code and save it to the file.
        String code = "<svg xmlns='http://www.w3.org/2000/svg'>\n" +
                      "<circle cx='50' cy='50' r='40' stroke='black' stroke-width='3' fill='red' />\n" +
                      "</svg>\n";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter(Resources.output("document.svg"))) {
            fileWriter.write(code);
        }

        // Set A5 as a page-size and change the background color to green
        com.aspose.html.saving.XpsSaveOptions options = new com.aspose.html.saving.XpsSaveOptions();
        com.aspose.html.rendering.PageSetup pageSetup = new com.aspose.html.rendering.PageSetup();
        com.aspose.html.drawing.Page anyPage = new com.aspose.html.drawing.Page();
        anyPage.setSize(
                new com.aspose.html.drawing.Size(
                        com.aspose.html.drawing.Length.fromInches(8.3f),
                        com.aspose.html.drawing.Length.fromInches(5.8f)
                )
        );
        pageSetup.setAnyPage(anyPage);
        options.setPageSetup(pageSetup);

        options.setBackgroundColor(com.aspose.html.drawing.Color.getGreen());

        // Convert SVG document to XPS
        com.aspose.html.converters.Converter.convertSVG(
                Resources.output("document.svg"),
                options,
                Resources.output("output.xps")
        );
    }
}