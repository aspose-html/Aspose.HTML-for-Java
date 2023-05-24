package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_CreateDocuments_NewHTML {
    public static void main(String [] args) throws IOException {
//        using System.IO;
//        using Aspose.Html;
//        ...
//        // Prepare an output path for a document saving
//        string documentPath = Path.Combine(OutputDir, "create-new-document.html");
//
//        // Initialize an empty HTML document
//        using (var document = new HTMLDocument())
//        {
//            // Create a text element and add it to the document
//            var text = document.CreateTextNode("Hello World!");
//            document.Body.AppendChild(text);
//
//            // Save the document to a disk
//            document.Save(documentPath);
//        }

        // START_SNIPPET WorkingWithHTMLDocuments_CreateDocuments_NewHTML
        // Initialize an empty HTML Document.
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument();
        try {
            // Create a text element and add it to the document
            com.aspose.html.dom.Text text = document.createTextNode("Hello World!");
            document.getBody().appendChild(text);

            // Save the document to disk.
            document.save("document.html");
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
        // END_SNIPPET
    }
}
