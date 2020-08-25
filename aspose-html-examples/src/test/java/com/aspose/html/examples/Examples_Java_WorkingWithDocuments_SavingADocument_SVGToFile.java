package com.aspose.html.examples;

public class Examples_Java_WorkingWithDocuments_SavingADocument_SVGToFile {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        // Prepare an SVG code
        var code = """
                <svg xmlns='http://www.w3.org/2000/svg' height='80' width='300'>
                        <g fill='none'>
                            <path stroke='red' d='M5 20 l215 0' />
                            <path stroke='black' d='M5 40 l215 0' />
                            <path stroke='blue' d='M5 60 l215 0' />
                        </g>
                    </svg>
                """;

        // Initialize a SVG instance from the content string
        var document = new com.aspose.html.dom.svg.SVGDocument(code, ".");
        try {
            // Save the SVG file to the disk
            document.save(dataDir + "document.svg");
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}
