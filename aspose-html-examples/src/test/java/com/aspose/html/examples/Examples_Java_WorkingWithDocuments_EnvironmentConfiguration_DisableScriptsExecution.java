package com.aspose.html.examples;

public class Examples_Java_WorkingWithDocuments_EnvironmentConfiguration_DisableScriptsExecution {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        // Prepare an HTML code and save it to the file.
        var code = """
                <span>Hello World!!</span>
                <script>document.write('Have a nice day!');</script>
                """;

        try (var fileWriter = new java.io.FileWriter(dataDir + "document.html")) {
            fileWriter.write(code);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        // Create an instance of Configuration
        var configuration = new com.aspose.html.Configuration();
        try {
            // Mark 'scripts' as an untrusted resource
            configuration.setSecurity(com.aspose.html.Sandbox.Scripts);

            // Initialize an HTML document with specified configuration
            var document = new com.aspose.html.HTMLDocument(dataDir + "document.html", configuration);
            try {
                // Convert HTML to PDF
                com.aspose.html.converters.Converter.convertHTML(
                        document,
                        new com.aspose.html.saving.PdfSaveOptions(),
                        dataDir + "output.pdf"
                );
            } finally {
                if (document != null) {
                    document.dispose();
                }
            }
        } finally {
            if (configuration != null) {
                configuration.dispose();
            }
        }
    }
}