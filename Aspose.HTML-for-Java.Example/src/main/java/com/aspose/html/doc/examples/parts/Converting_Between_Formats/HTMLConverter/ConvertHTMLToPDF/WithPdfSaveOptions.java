package com.aspose.html.doc.examples.parts.Converting_Between_Formats.HTMLConverter.ConvertHTMLToPDF;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.doc.examples.utils.FileHelper;
import com.aspose.html.drawing.*;
import com.aspose.html.saving.PdfSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class WithPdfSaveOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertHTMLToPDF_WithPdfSaveOptions
        // Prepare HTML code and save it to a file
        String code = "<h1>  PdfSaveOptions Class</h1> " +
                "<p>Using PdfSaveOptions Class, you can programmatically " +
                "apply a wide range of conversion parameters " +
                "such as BackgroundColor, HorizontalResolution, VerticalResolution, PageSetup, etc.</p>";

        FileHelper.writeAllText($o("save-options.html"), code);

        // Initialize an HTML Document from the HTML file
        HTMLDocument document = new HTMLDocument($o("save-options.html"));

        // Set up the page-size, margins and change the background color to AntiqueWhite
        PdfSaveOptions options = new PdfSaveOptions();
        options.setBackgroundColor(Color.getAntiqueWhite());
        options.getPageSetup().setAnyPage(
                new Page(
                        new Size(Length.fromInches(4.9f), Length.fromInches(3.5f)),
                        new Margin(30, 20, 10, 10)
                )
        );

        // Convert HTML to PDF
        Converter.convertHTML(document, options, $o("save-options-output.pdf"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(documentPath));
    }
}
