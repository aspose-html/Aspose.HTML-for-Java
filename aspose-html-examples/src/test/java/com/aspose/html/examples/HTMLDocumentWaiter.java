package com.aspose.html.examples;

public class HTMLDocumentWaiter implements Runnable {

    private Examples_Java_WorkingWithDocuments_CreatingADocument_HTMLDocumentAsynchronouslyOnLoad html;

    public HTMLDocumentWaiter(Examples_Java_WorkingWithDocuments_CreatingADocument_HTMLDocumentAsynchronouslyOnLoad html) {
        this.html = html;
        try {
            this.html.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
