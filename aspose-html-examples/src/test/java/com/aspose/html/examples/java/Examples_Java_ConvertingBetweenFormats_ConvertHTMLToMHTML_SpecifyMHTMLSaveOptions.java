package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_ConvertHTMLToMHTML_SpecifyMHTMLSaveOptions {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Prepare an HTML code with a link to another file and save it to the file as 'document.html'
        var code = """
                <span>Hello World!!</span>
                <a href='document2.html'>click</a>
                """;
        try (var fileWriter = new java.io.FileWriter(dataDir + "document.html")) {
            fileWriter.write(code);
        }

        // Prepare an HTML code and save it to the file as 'document2.html'
        code = "<span>Hello World!!</span>";
        try (var fileWriter = new java.io.FileWriter(dataDir + "document2.html")) {
            fileWriter.write(code);
        }

        // Change the value of the resource linking depth to 1 in order to convert document with directly linked resources.
        var options = new com.aspose.html.saving.MHTMLSaveOptions();
        options.getResourceHandlingOptions().setMaxHandlingDepth(1);

        // Convert HTML to MHT
        com.aspose.html.converters.Converter.convertHTML(
                dataDir + "document.html",
                options,
                dataDir + "output.mht"
        );
    }
}