package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertHTMLToXPS_WithASingleLine {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Invoke the ConvertHTML method to convert the HTML to XPS.
        com.aspose.html.converters.Converter.convertHTML(
                "<span>Hello World!!</span>",
                ".",
                new com.aspose.html.saving.XpsSaveOptions(),
                Resources.output("output.xps")
        );
    }
}
