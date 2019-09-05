package com.aspose.html.examples.java.document;

import com.aspose.html.HTMLDocument;
import com.aspose.html.internal.ms.System.IO.StringReader;
import com.aspose.html.internal.ms.System.Net.NetworkCredential;
import com.aspose.html.net.HttpMethod;
import com.aspose.html.net.RequestMessage;
import com.aspose.html.net.ResponseMessage;


public class LoadHtmlDocWithCredentials
{
    public static void run()
    {
        String requestUri = "https://httpbin.org/basic-auth/user/passwd";
        HTMLDocument document = new HTMLDocument();
        try
        {
            RequestMessage tmp0 = new  RequestMessage(requestUri);
            tmp0.setMethod(HttpMethod.getGet());
            tmp0.setCredentials(new NetworkCredential("user", "passwd"));
            tmp0.setPreAuthenticate(true);
            ResponseMessage response = document.getContext().getNetwork().send(tmp0);

             StringReader sr = new StringReader(response.getContent().readAsString());
            try
            {
                System.out.println(document.getContentType());
                System.out.println(sr.readToEnd());
            }
            finally { if (sr != null) sr.dispose(); }
        }
        catch (java.lang.Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}
