package com.aspose.html.examples;

public class Examples_Java_WorkingWithTemplateMerger_MergeHTMLWithXML_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {

        // HTML template document
        com.aspose.html.HTMLDocument templateHtml = new com.aspose.html.HTMLDocument(Resources.input("HTMLTemplateforXML.html"));
        //XML data for merging
        com.aspose.html.converters.TemplateData data = new com.aspose.html.converters.TemplateData(Resources.input("XMLTemplate.xml"));
        //Output file path
        String templateOutput = Resources.output("HTMLTemplate_Output.html");
        //Merge HTML tempate with XML data
        com.aspose.html.converters.Converter.convertTemplate(
                templateHtml,
                data,
                new com.aspose.html.loading.TemplateLoadOptions(),
                templateOutput
        );
    }
}