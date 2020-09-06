package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertHTMLToMHTML_WithASingleLine {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
// Invoke the ConvertHTML method to convert the HTML to MHT.
        com.aspose.html.converters.Converter.convertHTML(
                "<span>Hello World!!</span>",
                ".",
                new com.aspose.html.saving.MHTMLSaveOptions(),
                Resources.output("output.mht")
        );
    }
}