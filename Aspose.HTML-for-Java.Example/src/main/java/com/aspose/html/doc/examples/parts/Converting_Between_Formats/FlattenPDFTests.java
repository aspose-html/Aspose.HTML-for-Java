package com.aspose.html.doc.examples.parts.Converting_Between_Formats;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.doc.examples.utils.FileHelper;
import com.aspose.html.rendering.pdf.FormFieldBehaviour;
import com.aspose.html.saving.PdfSaveOptions;
import org.junit.jupiter.api.DisplayName;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class FlattenPDFTests {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Convert HTML to PDF and Flattening PDF")
    public void convertHTMLToPDFAndFlattenPDFTest() {
        // @START_SNIPPET ConvertHTMLToPDFAndFlattenPDFTest
        // Prepare a path to an HTML source file
        String sourcePath = $i("SampleHtmlForm.html");

        // Initialize an HTML document from the file
        HTMLDocument document = new HTMLDocument(sourcePath);

        // Prepare PDF save options
        PdfSaveOptions options = new PdfSaveOptions();
        options.setFormFieldBehaviour(FormFieldBehaviour.Flattened);

        // Prepare a path to the result file
        String resultPath = $o("document.pdf");

        // Convert HTML to PDF
        Converter.convertHTML(document, options, resultPath);
        // @END_SNIPPET ConvertHTMLToPDFAndFlattenPDFTest
        org.junit.jupiter.api.Assertions.assertTrue(FileHelper.exists(resultPath));
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Convert MHTML to PDF and Flattening PDF")
    public void convertMHTMLToPDFAndFlattenPDFTest() {
        // @START_SNIPPET ConvertMHTMLToPDFAndFlattenPDFTest
        // Prepare a path to an MHTML source file
        String sourcePath = $i("SampleHtmlForm.mhtml");

        // Initialize PDF save options
        PdfSaveOptions options = new PdfSaveOptions();
        options.setFormFieldBehaviour(FormFieldBehaviour.Interactive);

        // Prepare a path to the result file
        String resultPath = $o("document-flattened.pdf");

        // Convert MHTML to PDF
        Converter.convertMHTML(sourcePath, options, resultPath);
        // @END_SNIPPET ConvertMHTMLToPDFAndFlattenPDFTest
        org.junit.jupiter.api.Assertions.assertTrue(FileHelper.exists(resultPath));
    }
}

