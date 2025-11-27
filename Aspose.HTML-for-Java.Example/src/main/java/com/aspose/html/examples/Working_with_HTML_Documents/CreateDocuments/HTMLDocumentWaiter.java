package com.aspose.html.examples.Working_with_HTML_Documents.CreateDocuments;

// @START_SNIPPET Example_HtmlDocumentAsyncWaiterThread.java
// Create async waiter thread for HTML document loading using Java
// Learn more: https://docs.aspose.com/html/java/create-a-document/

public class HTMLDocumentWaiter implements Runnable {

    private final HTMLDocumentAsynchronouslyOnLoad html;

    public HTMLDocumentWaiter(HTMLDocumentAsynchronouslyOnLoad html) throws Exception {
        this.html = html;
        this.html.execute();
    }

    @Override
    public void run() {
        System.out.println("Current Thread: " + Thread.currentThread().getName() + "; " + Thread.currentThread().getId());

        while (!Thread.currentThread().isInterrupted() && html.getMsg() == null) {
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Thread.currentThread().interrupt();
    }
}
// @END_SNIPPET