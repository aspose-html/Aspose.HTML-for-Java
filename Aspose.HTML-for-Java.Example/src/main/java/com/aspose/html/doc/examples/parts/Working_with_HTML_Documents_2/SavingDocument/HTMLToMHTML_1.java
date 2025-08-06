package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents_2.SavingDocument;

import com.aspose.html.HTMLDocument;
import com.aspose.html.saving.HTMLSaveFormat;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class HTMLToMHTML_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // Prepare a simple HTML file with a linked document.
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("document.html"))) {
            fileWriter.write("<p>Hello World!</p>" + "<a href='linked.html'>linked file</a>");
        }

        // Prepare a simple linked HTML file
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("linked.html"))) {
            fileWriter.write("<p>Hello linked file!</p>");
        }

        // Load 'document.html' into memory
        HTMLDocument document = new HTMLDocument($o("document.html"));

        // Save the document
        document.save($o("document.mht"), HTMLSaveFormat.MHTML);
    }
}