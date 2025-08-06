package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents_2.SavingDocument;

import com.aspose.html.HTMLDocument;
import com.aspose.html.saving.HTMLSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class HTMLWithoutLinkedFile {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // Prepare a simple HTML file with a linked document.
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("document.html"))) {
            fileWriter.write("<p>Hello World!</p>\n" +
                    "<a href='linked.html'>linked file</a>\n"
            );
        }

        // Prepare a simple linked HTML file
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("linked.html"))) {
            fileWriter.write("<p>Hello linked file!</p>");
        }

        // Load 'document.html' into memory
        HTMLDocument document = new HTMLDocument($o("document.html"));

        // Create Save Options instance
        HTMLSaveOptions options = new HTMLSaveOptions();

        // The following line with value '0' cut off all other linked HTML-files while saving this instance.
        // If you remove this line or change value to the '1', the 'linked.html' file will be saved as well to the output folder.
        options.getResourceHandlingOptions().setMaxHandlingDepth(1);

        // Save the document
        document.save($o("document.html"), options);
    }
}
