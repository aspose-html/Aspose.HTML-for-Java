package com.aspose.html.doc.examples.parts.Converting_Between_Formats.SVG_Converter.ConvertSVGToXPS;

import com.aspose.html.converters.Converter;
import com.aspose.html.dom.svg.SVGDocument;
import com.aspose.html.drawing.*;
import com.aspose.html.rendering.PageSetup;
import com.aspose.html.saving.XpsSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SpecifyXpsSaveOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertSVGToXPS_SpecifyXpsSaveOptions
        // Prepare SVG code and save it to a file
        String code = "<svg xmlns='http://www.w3.org/2000/svg'>\n" +
                "<circle cx='50' cy='50' r='40' stroke='black' stroke-width='3' fill='red' />\n" +
                "</svg>\n";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("document.svg"))) {
            fileWriter.write(code);
        }

        // Initialize an SVG document from the file
        SVGDocument document = new SVGDocument($o("document.svg"));

        // Initialize XpsSaveOptions. Set up the page size 500x500 pixels, margins, and resolutions
        XpsSaveOptions options = new XpsSaveOptions();
        options.setHorizontalResolution(new Resolution(200, UnitType.AUTO));
        options.setVerticalResolution(new Resolution(200, UnitType.AUTO));
        options.getPageSetup().setAnyPage(new Page(new Size(500, 500), new Margin(30, 10, 10, 10)));

        // Convert SVG to XPS
        Converter.convertSVG($o("document.svg"), options, $o("output.xps"));
        // @END_SNIPPET
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void test1() throws Exception {
        // @START_SNIPPET ConvertSVGToXPS_SpecifyXpsSaveOptions_1
        // Prepare SVG code and save it to a file
        String code = "<svg xmlns='http://www.w3.org/2000/svg'>\n" +
                "<circle cx='50' cy='50' r='40' stroke='black' stroke-width='3' fill='red' />\n" +
                "</svg>\n";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("document.svg"))) {
            fileWriter.write(code);
        }

        // Set A5 as a page-size and change the background color to green
        XpsSaveOptions options = new XpsSaveOptions();
        PageSetup pageSetup = new PageSetup();
        Page anyPage = new Page();
        anyPage.setSize(new Size(Length.fromInches(8.3f), Length.fromInches(5.8f)));
        pageSetup.setAnyPage(anyPage);
        options.setPageSetup(pageSetup);
        options.setBackgroundColor(Color.getGreen());

        // Convert SVG document to XPS
        Converter.convertSVG($o("document.svg"), options, $o("output.xps"));
        // @END_SNIPPET
    }
}