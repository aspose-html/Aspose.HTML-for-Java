package com.aspose.html.doc.examples.parts.Converting_Between_Formats;


import static com.aspose.html.doc.examples.utils.Resources.$o;

public class CreateHTMLFromTemplate {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET HTMLTemplate_CreateHTMLFromTemplate
        // Prepare a JSON data-source and save it to a file
        String data =
                "{\n" +
                        "   'FirstName': 'John',\n" +
                        "   'LastName': 'Smith',\n" +
                        "   'Address': {\n" +
                        "       'City': 'Dallas',\n" +
                        "       'Street': 'Austin rd.',\n" +
                        "       'Number': '200'\n" +
                        "       }\n" +
                        "}";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("data-source.json"))) {
            fileWriter.write(data);
        }

        // Prepare an HTML Template and save it to a file
        String template =
                "<table border=1>\n" +
                        "    <tr>\n" +
                        "        <th>Person</th>\n" +
                        "        <th>Address</th>\n" +
                        "    </tr>\n" +
                        "    <tr>\n" +
                        "        <td>{{FirstName}} {{LastName}}</td>\n" +
                        "        <td>{{Address.Street}} {{Address.Number}}, {{Address.City}}</td>\n" +
                        "    </tr>\n" +
                        "</table>\n";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("template.html"))) {
            fileWriter.write(template);
        }

        // Convert Template to HTML
        com.aspose.html.converters.Converter.convertTemplate(
                $o("template.html"),
                new com.aspose.html.converters.TemplateData($o("data-source.json")),
                new com.aspose.html.loading.TemplateLoadOptions(), $o("document.html")
        );
        // @END_SNIPPET
    }
}
