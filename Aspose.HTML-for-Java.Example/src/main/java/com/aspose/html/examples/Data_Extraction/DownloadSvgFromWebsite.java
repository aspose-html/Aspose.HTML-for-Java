package com.aspose.html.examples.Data_Extraction;

import com.aspose.html.HTMLDocument;
import com.aspose.html.Url;
import com.aspose.html.collections.HTMLCollection;
import com.aspose.html.examples.utils.Assert;
import com.aspose.html.examples.utils.FileHelper;
import com.aspose.html.dom.Element;
import com.aspose.html.net.RequestMessage;
import com.aspose.html.net.ResponseMessage;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

import static com.aspose.html.examples.utils.Resources.$o;

public class DownloadSvgFromWebsite {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Extract Inline SVG")
    @org.junit.jupiter.api.Tag("remote")
    public final void extractInlineSvgTest() {
        // @START_SNIPPET Example_ExtractInlineSvg.java
        // How to extract inline SVG images from a webpage using Java
        // Learn more: https://docs.aspose.com/html/java/extract-svg-from-website/

        // Open a document you want to download inline SVG images from
        final HTMLDocument document = new HTMLDocument("https://products.aspose.com/html/net/");

        // Collect all inline SVG images
        HTMLCollection images = document.getElementsByTagName("svg");

        for (int i = 0; i < images.getLength(); i++) {
            // Save every image to a local file system
            FileHelper.writeAllText($o("{i}.svg"), images.get_Item(i).getOuterHTML());
            Assert.True(FileHelper.exists($o("{i}.svg")));
        }
        // @END_SNIPPET ExtractInlineSvg
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Extract External SVG")
    @org.junit.jupiter.api.Tag("remote")
    public final void extractExternalSvgTest() {
        // @START_SNIPPET Example_ExtractExternalSvg.java
        // Download external SVG images from HTML using Java
        // Learn more: https://docs.aspose.com/html/java/extract-svg-from-website/

        // Open a document you want to download external SVGs from
        final HTMLDocument document = new HTMLDocument("https://products.aspose.com/html/net/");

        // Collect all image elements
        HTMLCollection images = document.getElementsByTagName("img");

        // Create a distinct collection of relative image URLs
        java.util.Set<String> urls = new HashSet<>();
        for (Element element : images) {
            urls.add(element.getAttribute("src"));
        }

        // Filter out non SVG images
        java.util.List<String> svgUrls = new ArrayList<>();
        for (String url : urls) {
            if (url.endsWith(".svg")) {
                svgUrls.add(url);
            }
        }
        // Create absolute SVG image URLs
        java.util.List<Url> absUrls = svgUrls.stream()
                .map(src -> new Url(src, document.getBaseURI()))
                .collect(Collectors.toList());

        // foreach to while statements conversion
        for (Url url : absUrls) {
            // Create a downloading request
            final RequestMessage request = new RequestMessage(url);

            // Download SVG image
            final ResponseMessage response = document.getContext().getNetwork().send(request);

            // Check whether response is successful
            if (response.isSuccess()) {
                String[] split = url.getPathname().split("/");
                String path = split[split.length - 1];

                // Save file to a local file system
                FileHelper.writeAllBytes($o(path), response.getContent().readAsByteArray());
                Assert.True(FileHelper.exists(path));
            }
        }
        // @END_SNIPPET ExtractExternalSvg
    }
}