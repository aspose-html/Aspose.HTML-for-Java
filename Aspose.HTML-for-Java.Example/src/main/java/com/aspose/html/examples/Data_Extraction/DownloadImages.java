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

import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Collectors;

import static com.aspose.html.examples.utils.Resources.$o;

public class DownloadImages {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Extract Images From Website")
    @org.junit.jupiter.api.Tag("remote")
    public final void extractImagesFromWebsiteTest() {
        // @START_SNIPPET Example_ExtractImagesFromWebsite.java
        // Extract images from website using Java
        // Learn more: https://docs.aspose.com/html/java/extract-images-from-website/

        // Open a document you want to download images from
        final HTMLDocument document = new HTMLDocument("https://docs.aspose.com/svg/net/drawing-basics/svg-shapes/");

        // Collect all <img> elements
        HTMLCollection images = document.getElementsByTagName("img");

        // Create a distinct collection of relative image URLs
        Iterator<Element> iterator = images.iterator();
        java.util.Set<String> urls = new HashSet<>();
        for (Element e : images) {
            urls.add(e.getAttribute("src"));
        }

        // Create absolute image URLs
        java.util.List<Url> absUrls = urls.stream()
                .map(src -> new Url(src, document.getBaseURI()))
                .collect(Collectors.toList());

        // foreach to while statements conversion
        for (Url url : absUrls) {
            // Create an image request message
            final RequestMessage request = new RequestMessage(url);

            // Extract image
            final ResponseMessage response = document.getContext().getNetwork().send(request);

            // Check whether a response is successful
            if (response.isSuccess()) {
                String[] split = url.getPathname().split("/");
                String path = split[split.length - 1];

                // Save file to a local file system
                FileHelper.writeAllBytes($o(path), response.getContent().readAsByteArray());
                Assert.True(FileHelper.exists(path));
            }
        }
        // @END_SNIPPET ExtractImagesFromWebsite
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Extract Icons From Website")
    @org.junit.jupiter.api.Tag("remote")
    public final void extractIconsFromWebsiteTest() {
        // @START_SNIPPET Example_ExtractIconsFromWebsite.java
        // Download icons from website using Java
        // Learn more: https://docs.aspose.com/html/java/extract-images-from-website/

        // Open a document you want to download icons from
        final HTMLDocument document = new HTMLDocument("https://docs.aspose.com/html/net/message-handlers/");

        // Collect all <link> elements
        HTMLCollection links = document.getElementsByTagName("link");

        // Leave only "icon" elements
        java.util.Set<Element> icons = new HashSet<>();
        for (Element link : links) {
            if ("icon".equals(link.getAttribute("rel"))) {
                icons.add(link);
            }
        }

        // Create a distinct collection of relative icon URLs
        java.util.Set<String> urls = new HashSet<>();
        for (Element icon : icons) {
            urls.add(icon.getAttribute("href"));
        }

        // Create absolute image URLs
        java.util.List<Url> absUrls = urls.stream()
                .map(src -> new Url(src, document.getBaseURI()))
                .collect(Collectors.toList());

        // foreach to while statements conversion
        for (Url url : absUrls) {
            // Create a downloading request
            final RequestMessage request = new RequestMessage(url);

            // Extract icon
            final ResponseMessage response = document.getContext().getNetwork().send(request);

            // Check whether a response is successful
            if (response.isSuccess()) {
                String[] split = url.getPathname().split("/");
                String path = split[split.length - 1];

                // Save file to a local file system
                FileHelper.writeAllBytes($o(path), response.getContent().readAsByteArray());
                Assert.True(FileHelper.exists(path));
            }
        }
        // @END_SNIPPET ExtractIconsFromWebsite
    }
}
