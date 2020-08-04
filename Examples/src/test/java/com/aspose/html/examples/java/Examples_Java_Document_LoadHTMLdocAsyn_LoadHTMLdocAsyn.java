package com.aspose.html.examples.java;

public class Examples_Java_Document_LoadHTMLdocAsyn_LoadHTMLdocAsyn {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory.
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();

        var document = new com.aspose.html.HTMLDocument();

        // subscribe to the event 'OnReadyStateChange' that will be fired once document is completely loaded
        document.OnReadyStateChange.add(new com.aspose.html.dom.events.DOMEventHandler() {
            @Override
            public void invoke(Object sender, com.aspose.html.dom.events.Event e) {
                if (document.getReadyState().equals("complete")) {
                    // manipulate with document here
                }
            }
        });

        document.navigate(dataDir + "input.html");
    }
}