package com.aspose.html.doc.examples.parts.WorkingWith.WorkingWithTemplateMerger;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class MergeHTMLWithXML_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {

        // HTML template document
        HTMLDocument templateHtml = new HTMLDocument($i("HTMLTemplateforXML.html"));
        //XML data for merging
        com.aspose.html.converters.TemplateData data = new com.aspose.html.converters.TemplateData($i("XMLTemplate.xml"));
        //Output file path
        String templateOutput = $o("HTMLTemplate_Output.html");
        //Merge HTML tempate with XML data
        Converter.convertTemplate(templateHtml, data, new com.aspose.html.loading.TemplateLoadOptions(), templateOutput
        );
    }
}