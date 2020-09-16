package com.aspose.html.examples;

public class Examples_Java_WorkingWithDocuments_SavingADocument_HTMLToMHTML {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Prepare a simple HTML file with a linked document.
        try (java.io.FileWriter fileWriter = new java.io.FileWriter(Resources.output("document.html"))) {
            fileWriter.write("<p>Hello World!</p>" + "<a href='linked.html'>linked file</a>");
        }

        // Prepare a simple linked HTML file
        try (java.io.FileWriter fileWriter = new java.io.FileWriter(Resources.output("linked.html"))) {
            fileWriter.write("<p>Hello linked file!</p>");
        }

        // Load 'document.html' into memory
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(Resources.output("document.html"));
        try {
            // Save the document
            document.save(Resources.output("document.mht"), com.aspose.html.saving.HTMLSaveFormat.MHTML);
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}