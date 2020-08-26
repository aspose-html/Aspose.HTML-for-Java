package com.aspose.html.examples;

public class HTMLDocumentWaiter implements Runnable {

    private final Examples_Java_WorkingWithDocuments_CreatingADocument_HTMLDocumentAsynchronouslyOnLoad html;

    public HTMLDocumentWaiter(Examples_Java_WorkingWithDocuments_CreatingADocument_HTMLDocumentAsynchronouslyOnLoad html) throws Exception {
        this.html = html;
        this.html.execute();
    }

    @Override
    public void run() {
        System.out.println("Current Thread: " + Thread.currentThread().getName() + "; " + Thread.currentThread().getId());
        try {
            while (!Thread.currentThread().isInterrupted() && html.getMsg() == null) {
                Thread.currentThread().sleep(60000);
            }
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
