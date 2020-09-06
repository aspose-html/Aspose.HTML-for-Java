package com.aspose.html.examples;

public class OnlyImageFilter extends com.aspose.html.dom.traversal.filters.NodeFilter {

    @Override
    public short acceptNode(com.aspose.html.dom.Node n) {
        // The current filter skips all elements, except IMG elements.
        return "img".equals(n.getLocalName()) ? FILTER_ACCEPT : FILTER_SKIP;
    }

}
