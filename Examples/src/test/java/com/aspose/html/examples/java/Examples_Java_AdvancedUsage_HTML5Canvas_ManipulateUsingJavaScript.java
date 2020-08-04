package com.aspose.html.examples.java;

public class Examples_Java_AdvancedUsage_HTML5Canvas_ManipulateUsingJavaScript {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Prepare a document with HTML5 Canvas inside and save it to the file 'document.html'
        var code = """
                < canvas id = myCanvas width = '200' height = '100' style = 'border:1px solid #d3d3d3;' ></canvas >
                <script >
                    var c = document.getElementById('myCanvas');
                    var context = c.getContext('2d');
                    context.font = '20px Arial';
                    context.fillStyle = 'red';
                    context.fillText('Hello World', 40, 50);
                </script >
                """;
        try (var fileWriter = new java.io.FileWriter(dataDir + "document.html")) {
            fileWriter.write(code);
        }

        // Initialize an HTML document from the html file
        var document = new com.aspose.html.HTMLDocument(dataDir + "document.html");
        try {
            // Convert HTML to PDF
            com.aspose.html.converters.Converter.convertHTML(
                    document,
                    new com.aspose.html.saving.PdfSaveOptions(),
                    dataDir + "output.pdf"
            );
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}