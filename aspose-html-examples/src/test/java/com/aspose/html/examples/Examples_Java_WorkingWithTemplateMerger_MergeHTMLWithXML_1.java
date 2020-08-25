package com.aspose.html.examples;

public class Examples_Java_WorkingWithTemplateMerger_MergeHTMLWithXML_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory
        String dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        // HTML template document
        var templateHtml = new com.aspose.html.HTMLDocument(dataDir + "HTMLTemplateforXML.html");
        //XML data for merging
        var data = new com.aspose.html.converters.TemplateData(dataDir + "XMLTemplate.xml");
        //Output file path
        var templateOutput = dataDir + "HTMLTemplate_Output.html";
        //Merge HTML tempate with XML data
        com.aspose.html.converters.Converter.convertTemplate(
                templateHtml,
                data,
                new com.aspose.html.loading.TemplateLoadOptions(),
                templateOutput
        );
    }
}