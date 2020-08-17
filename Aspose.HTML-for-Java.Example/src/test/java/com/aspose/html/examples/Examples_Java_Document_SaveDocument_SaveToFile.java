package com.aspose.html.examples;

public class Examples_Java_Document_SaveDocument_SaveToFile {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument("<p>my first paragraph</p>", "about:blank");
        try {
            document.save(Resources.output("SaveToFile_out.html"));
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}