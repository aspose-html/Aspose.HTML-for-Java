package com.aspose.html.examples.Converting_Between_Formats.HTMLConverter.ConvertHTMLToDOCX;

import com.aspose.html.converters.Converter;
import com.aspose.html.saving.DocSaveOptions;

import static com.aspose.html.examples.utils.Resources.$o;

public class WithASingleLine__6 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertHtmlToDocxWithOneLineOfCode.java
        // Convert HTML to DOCX in one line using Java
        // Learn more: https://docs.aspose.com/html/java/convert-html-to-docx/

        // Invoke the convertHTML() method to convert HTML to DOCX
        Converter.convertHTML("<h1>Convert HTML to DOCX!</h1>", ".", new DocSaveOptions(), $o("convert-with-single-line.docx"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists("convert-with-single-line.docx"));
    }

}