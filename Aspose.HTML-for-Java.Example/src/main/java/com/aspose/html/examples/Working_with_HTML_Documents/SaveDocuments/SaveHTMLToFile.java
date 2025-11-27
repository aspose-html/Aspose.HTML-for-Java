package com.aspose.html.examples.Working_with_HTML_Documents.SaveDocuments;

import com.aspose.html.HTMLDocument;
import com.aspose.html.saving.HTMLSaveOptions;

import java.io.IOException;

import static com.aspose.html.examples.utils.Resources.$o;

public class SaveHTMLToFile {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws IOException {
        // @START_SNIPPET Example_SaveHtmlWithLinkedFile.java
        // Save HTML with a linked resources using Java
        // Learn more: https://docs.aspose.com/html/java/save-a-document/

        // Prepare a simple HTML file with a linked document
        java.nio.file.Files.write(
                java.nio.file.Paths.get($o("save-with-linked-file.html")),
                "<p>Hello, World!</p><a href='linked.html'>linked file</a>".getBytes());

        // Prepare a simple linked HTML file
        java.nio.file.Files.write(java.nio.file.Paths.get($o("linked.html")),
                "<p>Hello, linked file!</p>".getBytes());

        // Load the "save-with-linked-file.html" into memory
        HTMLDocument document = new HTMLDocument($o("save-with-linked-file.html"));

        // Create an instance of the HTMLSaveOptions class
        HTMLSaveOptions options = new HTMLSaveOptions();

        // The following line with the value "0" cuts off all other linked HTML-files while saving this instance
        // If you remove this line or change the value to "1", the "linked.html" file will be saved as well to the output folder
        options.getResourceHandlingOptions().setMaxHandlingDepth(1);

        // Save the document with the save options
        document.save($o("save-with-linked-file_out.html"), options);
        // @END_SNIPPET
    }
}