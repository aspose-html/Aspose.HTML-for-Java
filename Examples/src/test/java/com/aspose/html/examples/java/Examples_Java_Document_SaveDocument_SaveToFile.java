package com.aspose.html.examples.java;

public class Examples_Java_Document_SaveDocument_SaveToFile {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();

        var document = new com.aspose.html.HTMLDocument("<p>my first paragraph</p>", "about:blank");
        try {
            document.save(dataDir + "SaveToFile_out.html");
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}