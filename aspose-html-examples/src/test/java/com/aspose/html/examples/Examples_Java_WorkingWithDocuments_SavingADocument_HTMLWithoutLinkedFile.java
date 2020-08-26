package com.aspose.html.examples;

public class Examples_Java_WorkingWithDocuments_SavingADocument_HTMLWithoutLinkedFile {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        String dataDir = RunExamples.getResourcePath();
        // Prepare a simple HTML file with a linked document.
        try (java.io.FileWriter fileWriter = new java.io.FileWriter(dataDir + "document.html")) {
            fileWriter.write("<p>Hello World!</p>\n" +
                             "<a href='linked.html'>linked file</a>\n"
            );
        }

        // Prepare a simple linked HTML file
        try (java.io.FileWriter fileWriter = new java.io.FileWriter(dataDir + "linked.html")) {
            fileWriter.write("<p>Hello linked file!</p>");
        }

        // Load 'document.html' into memory
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(dataDir + "document.html");
        try {
            // Create Save Options instance
            com.aspose.html.saving.HTMLSaveOptions options = new com.aspose.html.saving.HTMLSaveOptions();

            // The following line with value '0' cut off all other linked HTML-files while saving this instance.
            // If you remove this line or change value to the '1', the 'linked.html' file will be saved as well to the output folder.
            options.getResourceHandlingOptions().setMaxHandlingDepth(1);

            // Save the document
            document.save(dataDir + "document.html", options);
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}