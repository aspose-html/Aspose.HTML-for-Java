package com.aspose.html.examples;

public class Examples_Java_WebScraping_WebScraping_XPathQueryUsageExample {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // Prepare an HTML code
        String code = "< div class='happy' >\n" +
                      "        <div >\n" +
                      "            <span > Hello ! </span >\n" +
                      "        </div >\n" +
                      "    </div >\n" +
                      "    <p class='happy' >\n" +
                      "        <span > World </span >\n" +
                      "    </p >\n";

        // Initialize a document based on the prepared code
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(code, ".");
        try {
            // Here we evaluate the XPath expression where we select all child SPAN elements from elements whose 'class' attribute equals to 'happy':
            com.aspose.html.dom.xpath.IXPathResult result = document.evaluate("//*[@class='happy']//span",
                    document,
                    null,
                    com.aspose.html.dom.xpath.XPathResultType.Any,
                    null
            );

            // Iterate over the resulted nodes
            for (com.aspose.html.dom.Node node; (node = result.iterateNext()) != null; ) {
                System.out.println(node.getTextContent());
                // output: Hello
                // output: World!
            }
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}