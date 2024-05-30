package com.aspose.html.examples;

public class Examples_Java_Document_LoadHTMLdocAsyn_EventNavigate {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {

        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument();

        // you can subscribe to the event 'OnLoad'
        document.OnLoad.add(new com.aspose.html.dom.events.DOMEventHandler() {
            @Override
            public void invoke(Object sender, com.aspose.html.dom.events.Event e) {
                // manipulate with document here
            }
        });

        document.navigate(Resources.input("input.html"));
    }
}