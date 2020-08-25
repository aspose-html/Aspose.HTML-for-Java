package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertSVGToPDF_SpecifyPdfSaveOptions {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        // Prepare an SVG code and save it to the file.
        var code = """
                <svg xmlns='http://www.w3.org/2000/svg'>
                <circle cx='50' cy='50' r='40' stroke='black' stroke-width='3' fill='red' />
                </svg>
                """;
        try (var fileWriter = new java.io.FileWriter(dataDir + "document.svg")) {
            fileWriter.write(code);
        }

        // Set A5 as a page-size and change the background color to green
        var options = new com.aspose.html.saving.PdfSaveOptions();
        var pageSetup = new com.aspose.html.rendering.PageSetup();
        var anyPage = new com.aspose.html.drawing.Page();
        anyPage.setSize(
                new com.aspose.html.drawing.Size(
                        com.aspose.html.drawing.Length.fromInches(8.3f),
                        com.aspose.html.drawing.Length.fromInches(5.8f)
                )
        );
        pageSetup.setAnyPage(anyPage);
        options.setPageSetup(pageSetup);

        options.setBackgroundColor(com.aspose.html.drawing.Color.getGreen());

        // Convert SVG document to PDF
        com.aspose.html.converters.Converter.convertSVG(
                dataDir + "document.svg",
                options,
                dataDir + "output.pdf"
        );
    }
}