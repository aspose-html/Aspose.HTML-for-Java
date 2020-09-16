package com.aspose.html.examples;

public class Examples_Java_WorkingWithDocuments_SavingADocument_SVGToFile {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Prepare an SVG code
        String code = "<svg xmlns='http://www.w3.org/2000/svg' height='80' width='300'>\n" +
                      "        <g fill='none'>\n" +
                      "            <path stroke='red' d='M5 20 l215 0' />\n" +
                      "            <path stroke='black' d='M5 40 l215 0' />\n" +
                      "            <path stroke='blue' d='M5 60 l215 0' />\n" +
                      "        </g>\n" +
                      "    </svg>\n";

        // Initialize a SVG instance from the content string
        com.aspose.html.dom.svg.SVGDocument document = new com.aspose.html.dom.svg.SVGDocument(code, ".");
        try {
            // Save the SVG file to the disk
            document.save(Resources.output("document.svg"));
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}
