
package com.aspose.html.samples.start_application;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class AsposeHtmlApplication {

    public static void main(String[] arg) {
        try (PrintWriter out = new PrintWriter(
                new OutputStreamWriter(System.out, StandardCharsets.UTF_8), true)) {

            out.println("╔══════════════════════════════════════════════════════════════════╗");
            out.println("║  This is a sample using the 'Aspose.HTML for Java' library:      ║");
            out.println("║     new " + com.aspose.html.HTMLDocument.class.getCanonicalName() + "('<h1>Hello World!</h1>')    ║");
            out.println("╚══════════════════════════════════════════════════════════════════╝");
        }
    }
}