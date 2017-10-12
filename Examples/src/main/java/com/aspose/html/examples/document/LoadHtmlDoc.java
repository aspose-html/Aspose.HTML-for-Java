package com.aspose.html.examples.document;
import com.aspose.html.examples.Utils;
import java.io.File;
import java.io.FileOutputStream;

public class LoadHtmlDoc {
    /**
     * The main entry point for the application.
     */
    public static void main(String[] args) throws Exception
    {
        //ExStart:LoadHtmlDoc
        // The path to the documents directory.
        String dataDir = Utils.getDataDir();

        final File file = new File( dataDir + "input.html");
        final FileOutputStream sw = new FileOutputStream(file);
        try
        {
            sw.write("<p>this is a simple text".getBytes());
        }
        finally
        {
            if (sw != null)
                (sw).close();
        }
        //ExEnd:LoadHtmlDoc
    }
}
