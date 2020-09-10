package com.aspose.html.examples;

public class Examples_Java_WorkingWithDocuments_CreatingADocument_HTMLDocumentFromString {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Prepare an HTML code
        String html_code = "<p>Hello World!</p>";

        // Initialize document from the string variable
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(html_code, ".");
        try {
            // Save the document to disk.
            document.save(Resources.output("document.html"));
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}
