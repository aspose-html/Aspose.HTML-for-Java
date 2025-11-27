package com.aspose.html.examples.Converting_Between_Formats.HTMLConverter.ConvertHTMLToXPS;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.examples.utils.FileHelper;
import com.aspose.html.drawing.*;
import com.aspose.html.saving.XpsSaveOptions;

import static com.aspose.html.examples.utils.Resources.$o;

public class SpecifyXpsSaveOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertHtmlToXpsWithXpsSaveOptions.java
        // Convert HTML to XPS with custom settings using Java
        // Learn more: https://docs.aspose.com/html/java/convert-html-to-xps/

        // Prepare HTML code and save it to a file
        String code = "<h1>  XpsSaveOptions Class</h1>\r\n" +
                "<p>Using XpsSaveOptions Class, you can programmatically " +
                "apply a wide range of conversion parameters " +
                "such as BackgroundColor, PageSetup, etc.</p>";

        FileHelper.writeAllText($o("save-options.html"), code);

        // Initialize an HTML document from the html file
        HTMLDocument document = new HTMLDocument($o("save-options.html"));

        // Set up the page-size, margins and change the background color to AntiqueWhite
        XpsSaveOptions options = new XpsSaveOptions();
        options.setBackgroundColor(Color.getAntiqueWhite());
        options.getPageSetup().setAnyPage(new Page(new Size(Length.fromInches(4.9f), Length.fromInches(3.5f)), new Margin(30, 20, 10, 10)));

        // Convert HTML to XPS
        Converter.convertHTML(document, options, $o("save-options-output.xps"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}