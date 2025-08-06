package com.aspose.html.doc.examples.parts.Converting_Between_Formats.HTMLConverter.ConvertHTMLToMHTML;

import com.aspose.html.converters.Converter;
import com.aspose.html.doc.examples.utils.FileHelper;
import com.aspose.html.saving.MHTMLSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SpecifyMHTMLSaveOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertHTMLToMHTML_SpecifyMHTMLSaveOptions
        // Prepare HTML code with a link to another file and save it to the file as "document.html"
        String code = "<span>Hello, World!!</span> " +
                "<a href='document2.html'>click</a>";
        FileHelper.writeAllText($o("document.html"), code);

        // Prepare HTML code and save it to the file as "document2.html"
        code = "<span>Hello, World!!</span>";
        FileHelper.writeAllText($o("document2.html"), code);

        // Change the value of the resource linking depth to 1 in order to convert document with directly linked resources
        MHTMLSaveOptions options = new MHTMLSaveOptions();
        options.getResourceHandlingOptions().setMaxHandlingDepth(1);

        // Convert HTML to MHTML
        Converter.convertHTML($o("document.html"), options, $o("output-options.mht"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}
