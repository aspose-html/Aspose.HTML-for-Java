//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.aspose.html.examples.utils;

public class MemoryStream extends com.aspose.html.utils.Stream {

    @Override
    public boolean canRead() {
        return false;
    }

    @Override
    public boolean canSeek() {
        return false;
    }

    @Override
    public boolean canWrite() {
        return false;
    }

    @Override
    public long getLength() {
        return 0;
    }

    @Override
    public long getPosition() {
        return 0;
    }

    @Override
    public void setPosition(long l) {

    }

    @Override
    public void flush() {

    }

    @Override
    public int read(byte[] bytes, int i, int i1) {
        return 0;
    }

    @Override
    public long seek(long l, int i) {
        return 0;
    }

    @Override
    public void setLength(long l) {

    }

    @Override
    public void write(byte[] bytes, int i, int i1) {

    }

    public byte[] toArray() {
        return null;
    }
}
