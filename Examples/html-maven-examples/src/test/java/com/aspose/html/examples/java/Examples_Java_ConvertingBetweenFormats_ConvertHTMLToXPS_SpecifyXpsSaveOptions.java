package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_ConvertHTMLToXPS_SpecifyXpsSaveOptions {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Prepare an HTML code and save it to the file
        var code = "<span>Hello</span> <span>World!!</span>";
        try (var fileWriter = new java.io.FileWriter(dataDir + "document.html")) {
            fileWriter.write(code);
        }

        // Set A5 as a page-size and change the background color to green
        var options = new com.aspose.html.saving.XpsSaveOptions();
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

        // Convert HTML document to XPS
        com.aspose.html.converters.Converter.convertHTML(
                dataDir + "document.html",
                options,
                dataDir + "output.xps"
        );
    }
}