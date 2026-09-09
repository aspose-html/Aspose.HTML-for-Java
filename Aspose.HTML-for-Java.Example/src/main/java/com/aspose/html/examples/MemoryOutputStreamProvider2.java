package com.aspose.html.examples;

import com.aspose.html.io.ICreateOutputStreamProvider;
import com.aspose.html.io.MemoryOutputStream;
import com.aspose.html.io.OutputStream;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Keeps rendering output in memory and releases every created resource on close.
 * This provider is intended for reasonably sized documents only.
 */
public final class MemoryOutputStreamProvider2
        implements Closeable, ICreateOutputStreamProvider {

    private final List<InputStream> inputStreams = new ArrayList<>();
    private final List<OutputStream> outputStreams = new ArrayList<>();
    private final List<MemoryOutputStream> memoryStreams = new ArrayList<>();
    private boolean closed;

    /**
     * Returns the mutable destination required by Aspose conversion overloads
     * that append input streams to a caller-provided list.
     */
    public List<InputStream> getInputStreams() {
        ensureOpen();
        return inputStreams;
    }

    @Override
    public synchronized OutputStream getOutputStream(String name, String extension) {
        return createOutputStream();
    }

    @Override
    public synchronized OutputStream getOutputStream(String name, String extension, int page) {
        return createOutputStream();
    }

    private OutputStream createOutputStream() {
        ensureOpen();

        MemoryOutputStream memoryStream = new MemoryOutputStream();
        OutputStream outputStream = OutputStream.fromStream(memoryStream);
        memoryStreams.add(memoryStream);
        outputStreams.add(outputStream);
        return outputStream;
    }

    @Override
    public void releaseOutputStream(OutputStream stream) {
        // Streams remain available until close(), so the caller can read the result.
    }

    @Override
    public synchronized void close() throws IOException {
        if (closed) {
            return;
        }
        closed = true;

        IOException failure = null;
        failure = closeAll(inputStreams, failure);
        failure = closeAll(outputStreams, failure);
        failure = disposeAll(memoryStreams, failure);

        inputStreams.clear();
        outputStreams.clear();
        memoryStreams.clear();

        if (failure != null) {
            throw failure;
        }
    }

    @Override
    public void dispose() {
        try {
            close();
        } catch (IOException e) {
            throw new IllegalStateException("Unable to release memory output streams", e);
        }
    }

    private static IOException closeAll(Iterable<? extends Closeable> streams, IOException failure) {
        for (Closeable stream : streams) {
            try {
                stream.close();
            } catch (IOException e) {
                failure = addFailure(failure, e);
            }
        }
        return failure;
    }

    private static IOException disposeAll(Iterable<MemoryOutputStream> streams, IOException failure) {
        for (MemoryOutputStream stream : streams) {
            try {
                stream.dispose();
            } catch (RuntimeException e) {
                failure = addFailure(failure, new IOException("Unable to dispose memory output stream", e));
            }
        }
        return failure;
    }

    private static IOException addFailure(IOException failure, IOException next) {
        if (failure == null) {
            return next;
        }
        failure.addSuppressed(next);
        return failure;
    }

    private void ensureOpen() {
        if (closed) {
            throw new IllegalStateException("MemoryOutputStreamProvider is already closed");
        }
    }
}
// @END_SNIPPET
