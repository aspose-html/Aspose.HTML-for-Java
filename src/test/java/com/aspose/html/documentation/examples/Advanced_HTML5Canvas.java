package com.aspose.html.documentation.examples;

public class Advanced_HTML5Canvas {
    public static void main(String [] args) throws java.io.IOException {
        // START_SNIPPET Advanced_HTML5Canvas
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // Prepare a document with HTML5 Canvas inside and save it to the file 'document.html'
        String code = "<canvas id=myCanvas width='200' height='100' style='border:1px solid #d3d3d3;'></canvas>" +
                        "<script>" +
                        "var c = document.getElementById('myCanvas');" +
                        "var context = c.getContext('2d');" +
                        "context.font = '20px Arial';" +
                        "context.fillStyle = 'red';" +
                        "context.fillText('Hello World', 40, 50);" +
                        "</script>";
        java.io.FileWriter fileWriter = new java.io.FileWriter("document.html");
        fileWriter.write(code);
        fileWriter.close();

        // Initialize an HTML document from the html file
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument("document.html");

        com.aspose.html.converters.Converter.convertHTML(document, new com.aspose.html.saving.PdfSaveOptions(), "output.pdf");
        // END_SNIPPET
    }
}
