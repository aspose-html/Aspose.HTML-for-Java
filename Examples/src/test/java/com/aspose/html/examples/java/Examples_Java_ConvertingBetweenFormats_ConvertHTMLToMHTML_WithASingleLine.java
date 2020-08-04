package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_ConvertHTMLToMHTML_WithASingleLine {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Invoke the ConvertHTML method to convert the HTML to MHT.
        com.aspose.html.converters.Converter.convertHTML(
                "<span>Hello World!!</span>",
                ".",
                new com.aspose.html.saving.MHTMLSaveOptions(),
                dataDir + "output.mht"
        );
    }
}