package com.aspose.html.examples.utils;/// /package  com.aspose.html.utils;
/// /
/// /import com.aspose.pdf.internal.ms.System.l13p;
/// /import com.aspose.pdf.internal.ms.System.l1u;
/// /import com.aspose.pdf.internal.ms.System.l8l;
/// /import com.aspose.pdf.internal.ms.System.lh;
/// /import com.aspose.pdf.internal.ms.System.lk;
/// /import com.aspose.pdf.internal.ms.System.lv;
/// /import com.aspose.pdf.internal.ms.System.ly;
/// /import com.aspose.pdf.internal.ms.System.Collections.Generic.l0t;
/// /import com.aspose.pdf.internal.ms.System.IO.Stream;
/// /
/// /
//import com.aspose.html.drawing.Resolution;
//import com.aspose.html.rendering.image.ImageDevice;
//import com.aspose.html.rendering.image.ImageFormat;
//import com.aspose.html.rendering.image.ImageRenderingOptions;
//import com.aspose.html.SmoothingMode;
//import com.aspose.html.dom.mutations.MutationRecord;
//import com.aspose.html.documentation.examples.utils.collections.generic.IGenericList;
//import com.aspose.html.HTMLDocument;
//import com.aspose.html.converters.Converter;
//import com.aspose.html.drawing.Color;
//import com.aspose.html.drawing.Length;
//import com.aspose.html.drawing.Margin;
//import com.aspose.html.drawing.Page;
//import com.aspose.html.drawing.Size;
//import com.aspose.html.saving.PdfSaveOptions;
//import com.aspose.html.documentation.examples.utils.File;
//import com.aspose.html.documentation.examples.utils.StringExtensions;
//
//import com.aspose.html.saving.ImageSaveOptions;
//import com.aspose.html.saving.PdfSaveOptions;
//import com.aspose.html.saving.XpsSaveOptions;
//import com.aspose.html.saving.MarkdownSaveOptions;
//import com.aspose.html.saving.MarkdownFeatures;
//import com.aspose.html.saving.ResourceHandling;
//import com.aspose.html.saving.MHTMLSaveOptions;
//import com.aspose.html.saving.HTMLSaveOptions;
//import com.aspose.html.saving.HTMLSaveFormat;
//import com.aspose.html.saving.UrlRestriction;
//import com.aspose.html.dom.mutations.MutationObserverInit;
//import com.aspose.html.dom.mutations.MutationObserver;
//import com.aspose.html.dom.mutations.MutationRecord;
//import com.aspose.html.dom.Element;
//import com.aspose.html.dom.css.IViewCSS;
//import com.aspose.html.dom.css.ICSSStyleDeclaration;
//import com.aspose.html.dom.traversal.filters.NodeFilter;
//import com.aspose.html.dom.traversal.ITreeWalker;
//import com.aspose.html.dom.Text;
//import com.aspose.html.dom.svg.SVGDocument;
//import com.aspose.html.dom.Node;
//import com.aspose.html.dom.events.DOMEventHandler;
//
//import com.aspose.html.converters.Converter;
//import com.aspose.html.dom.canvas.ICanvasGradient;
//import com.aspose.html.dom.canvas.ICanvasRenderingContext2D;
//import com.aspose.html.rendering.pdf.PdfDevice;
//import com.aspose.html.HTMLCanvasElement;
//import com.aspose.html.rendering.HtmlRenderer;
//import com.aspose.html.rendering.xps.XpsRenderingOptions;
//import com.aspose.html.rendering.xps.XpsDevice;
//import com.aspose.html.rendering.EpubRenderer;
//import com.aspose.html.rendering.image.ImageFormat;
//import com.aspose.html.rendering.image.Compression;
//import com.aspose.html.rendering.image.ImageRenderingOptions;
//import com.aspose.html.rendering.image.ImageDevice;
//import com.aspose.html.rendering.MhtmlRenderer;
//import com.aspose.html.rendering.pdf.PdfRenderingOptions;
//import com.aspose.html.rendering.pdf.encryption.PdfEncryptionInfo;
//import com.aspose.html.rendering.pdf.encryption.PdfPermissions;
//import com.aspose.html.rendering.pdf.encryption.PdfEncryptionAlgorithm;
//import com.aspose.html.rendering.pdf.FormFieldBehaviour;
//import com.aspose.html.rendering.PageSetup;
//import com.aspose.html.rendering.pdf.FormFieldBehaviour;
//import com.aspose.html.rendering.MediaType;
//import com.aspose.html.rendering.SvgRenderer;
//import com.aspose.html.rendering.doc.DocDevice;
//import com.aspose.html.rendering.doc.DocRenderingOptions;
//import com.aspose.html.drawing.Page;
//import com.aspose.html.drawing.Size;
//import com.aspose.html.drawing.Margin;
//import com.aspose.html.drawing.Resolution;
//import com.aspose.html.drawing.Color;
//import com.aspose.html.drawing.Length;
//import com.aspose.html.SmoothingMode;
//import com.aspose.html.HTMLElement;
//import com.aspose.html.HTMLDivElement;
//import com.aspose.html.collections.NodeList;
//import com.aspose.html.collections.HTMLCollection;
//import com.aspose.html.HTMLParagraphElement;
//import com.aspose.html.HTMLImageElement;
//import com.aspose.html.dom.xpath.IXPathResult;
//import com.aspose.html.dom.xpath.XPathResultType;
//import com.aspose.html.dom.Document;
//import com.aspose.html.dom.events.Event;
//import com.aspose.html.Configuration;
//import com.aspose.html.services.INetworkService;
//import com.aspose.html.services.IUserAgentService;
//import com.aspose.html.services.IRuntimeService;
//import com.aspose.html.utils.TimeSpan;
//import com.aspose.html.net.MessageHandler;
//import com.aspose.html.net.INetworkOperationContext;
//import com.aspose.html.net.MessageFilter;
//
//import com.aspose.html.documentation.examples.utils.File;
//
//
//import java.nio.file.Paths;
//import com.aspose.html.forms.FormSubmitter;
//import com.aspose.html.forms.SubmissionResult;
//import com.aspose.html.forms.TextAreaElement;
//import com.aspose.html.documentation.examples.utils.Assert;
//
//
//
//import java.util.HashMap;
//
// public class OptimizedMemoryStream extends Stream {
////    private l0t<byte[]> lI;
////    public static final int DefaultBufferSize = 1000000;
////    private int lf;
////    private int lj;
////    private long lt;
////    private int lb;
////    private boolean ld;
////
////    public OptimizedMemoryStream() {
////        this(1000000);
////    }
////
////    public OptimizedMemoryStream(int bufferSize, byte[] buffer) {
////        this.lI = new l0t();
////        this.setFreeOnDispose(true);
////        this.setBufferSize(bufferSize);
////        this.lI.addItem(new byte[bufferSize]);
////        if (buffer != null) {
////            this.write(buffer, 0, buffer.length);
////            this.setPosition(0L);
////        }
////
////    }
////
////    public OptimizedMemoryStream(int bufferSize) {
////        this((byte[])null);
////        this.setBufferSize(bufferSize);
////    }
////
////    public OptimizedMemoryStream(byte[] buffer) {
////        this(1000000, buffer);
////    }
////
////    public boolean canRead() {
////        return true;
////    }
////
////    public boolean canSeek() {
////        return true;
////    }
////
////    public boolean canWrite() {
////        return true;
////    }
////
////    public final int getBufferSize() {
////        return this.lb;
////    }
////
////    public final void setBufferSize(int value) {
////        this.lb = value;
////    }
////
////    public long getLength() {
////        this.lI();
////        return this.lI.size() == 0 ? 0L : ((long)this.lI.size() - 1L) * (long)this.getBufferSize() + (long)this.lf;
////    }
////
////    public long getPosition() {
////        this.lI();
////        return this.lt;
////    }
////
////    public void setPosition(long value) {
////        this.lI();
////        if (value > this.getLength()) {
////            throw new lv("value");
////        } else if (value < 0L) {
////            throw new lv("value");
////        } else {
////            this.lt = value;
////        }
////    }
////
////    public final boolean getFreeOnDispose() {
////        return this.ld;
////    }
////
////    public final void setFreeOnDispose(boolean value) {
////        this.ld = value;
////    }
////
////    protected void lI(boolean var1) {
////        if (this.getFreeOnDispose() && this.lI != null) {
////            this.lI = null;
////            this.lt = 0L;
////        }
////
////        super.lI(var1);
////    }
////
////    public int read(byte[] buffer, int offset, int count) {
////        if (buffer == null) {
////            throw new lk("buffer");
////        } else if (offset < 0) {
////            throw new lv("offset");
////        } else if (count < 0) {
////            throw new lv("count");
////        } else if (buffer.length - offset < count) {
////            throw new lh((String)null, "count");
////        } else {
////            this.lI();
////            int var4 = (int)(this.lt / (long)this.getBufferSize());
////            if (var4 == this.lI.size()) {
////                return 0;
////            } else {
////                int var5 = (int)(this.lt % (long)this.getBufferSize());
////                count = (int)l13p.lt((long)count, this.getLength() - this.lt);
////                if (count == 0) {
////                    return 0;
////                } else {
////                    int var6 = count;
////                    int var7 = offset;
////                    int var8 = 0;
////
////                    do {
////                        int var9 = l13p.lt(var6, this.getBufferSize() - var5);
////                        l1u.lI(ly.lI(this.lI.get_Item(var4)), var5, ly.lI(buffer), var7, var9);
////                        var7 += var9;
////                        var6 -= var9;
////                        var8 += var9;
////                        if (var5 + var9 == this.getBufferSize()) {
////                            if (var4 == this.lI.size() - 1) {
////                                break;
////                            }
////
////                            var5 = 0;
////                            ++var4;
////                        } else {
////                            var5 += var9;
////                        }
////                    } while(var6 > 0);
////
////                    this.lt += (long)var8;
////                    return var8;
////                }
////            }
////        }
////    }
////
////    public int readByte() {
////        this.lI();
////        if (this.lt >= this.getLength()) {
////            return -1;
////        } else {
////            byte var1 = ((byte[])this.lI.get_Item((int)(this.lt / (long)this.getBufferSize())))[(int)(this.lt % (long)this.getBufferSize())];
////            ++this.lt;
////            return var1 & 255;
////        }
////    }
////
////    public long seek(long offset, SeekOrigin origin) {
////        this.lI();
////        switch (origin) {
////            case Begin:
////                this.setPosition(offset);
////                break;
////            case Current:
////                this.setPosition(this.getPosition() + offset);
////                break;
////            case End:
////                this.setPosition(this.getLength() + offset);
////        }
////
////        return this.getPosition();
////    }
////
////    public long seek(long offset, int origin) {
////        return this.seek(offset, OptimizedMemoryStream.SeekOrigin.getByValue(origin));
////    }
////
////    private void lI() {
////        if (this.lI == null) {
////            throw new l8l((String)null, "Cannot access a disposed stream");
////        }
////    }
////
////    public void flush() {
////    }
////
////    public void setLength(long value) {
////        this.lI();
////        if (value >= 0L && value <= this.getLength()) {
////            long var3 = value / (long)this.getBufferSize();
////            if (value % (long)this.getBufferSize() != 0L) {
////                ++var3;
////            }
////
////            if (var3 > 2147483647L) {
////                throw new lv("value");
////            } else {
////                if (var3 < (long)this.lI.size()) {
////                    int var5 = (int)((long)this.lI.size() - var3);
////
////                    for(int var6 = 0; var6 < var5; ++var6) {
////                        this.lI.removeAt(this.lI.size() - 1);
////                    }
////                }
////
////                this.lf = (int)(value % (long)this.getBufferSize());
////            }
////        } else {
////            throw new lv("value");
////        }
////    }
////
////    public final byte[] toArray() {
////        this.lI();
////        byte[] var1 = new byte[(int)this.getLength()];
////        int var2 = 0;
////
////        for(int var3 = 0; var3 < this.lI.size(); ++var3) {
////            int var4 = var3 == this.lI.size() - 1 ? this.lf : ((byte[])this.lI.get_Item(var3)).length;
////            if (var4 > 0) {
////                l1u.lI(ly.lI(this.lI.get_Item(var3)), 0, ly.lI(var1), var2, var4);
////                var2 += var4;
////            }
////        }
////
////        return var1;
////    }
////
////    public void write(byte[] buffer, int offset, int count) {
////        if (buffer == null) {
////            throw new lk("buffer");
////        } else if (offset < 0) {
////            throw new lv("offset");
////        } else if (count < 0) {
////            throw new lv("Count");
////        } else if (buffer.length - offset < count) {
////            throw new lh((String)null, "Count");
////        } else {
////            this.lI();
////            int var4 = (int)(this.lt % (long)this.getBufferSize());
////            int var5 = (int)(this.lt / (long)this.getBufferSize());
////            if (var5 == this.lI.size()) {
////                this.lI.addItem(new byte[this.getBufferSize()]);
////            }
////
////            int var6 = count;
////            int var7 = offset;
////
////            do {
////                int var8 = l13p.lt(var6, this.getBufferSize() - var4);
////                l1u.lI(ly.lI(buffer), var7, ly.lI(this.lI.get_Item(var5)), var4, var8);
////                var7 += var8;
////                var6 -= var8;
////                if (var4 + var8 == this.getBufferSize()) {
////                    ++var5;
////                    var4 = 0;
////                    if (var5 == this.lI.size()) {
////                        this.lI.addItem(new byte[this.getBufferSize()]);
////                    }
////                } else {
////                    var4 += var8;
////                }
////            } while(var6 > 0);
////
////            this.lt += (long)count;
////            if (var5 == this.lI.size() - 1 && (var5 > this.lj || var5 == this.lj && var4 > this.lf)) {
////                this.lf = var4;
////                this.lj = var5;
////            }
////
////        }
////    }
////
////    public void writeByte(byte value) {
////        this.lI();
////        int var2 = (int)(this.lt / (long)this.getBufferSize());
////        int var3 = (int)(this.lt % (long)this.getBufferSize());
////        if (var2 == this.lI.size()) {
////            this.lI.addItem(new byte[this.getBufferSize()]);
////        }
////
////        ((byte[])this.lI.get_Item(var2))[var3++] = value;
////        ++this.lt;
////        if (var2 == this.lI.size() - 1 && (var2 > this.lj || var2 == this.lj && var3 > this.lf)) {
////            this.lf = var3;
////            this.lj = var2;
////        }
////
////    }
////
////    public final void writeTo(Stream stream) {
////        if (stream == null) {
////            throw new lk("stream");
////        } else {
////            this.lI();
////
////            for(int var2 = 0; var2 < this.lI.size(); ++var2) {
////                int var3 = var2 == this.lI.size() - 1 ? this.lf : ((byte[])this.lI.get_Item(var2)).length;
////                stream.write((byte[])this.lI.get_Item(var2), 0, var3);
////            }
////
////        }
////    }
////
////    public static enum SeekOrigin {
////        Begin(0),
////        Current(1),
////        End(2);
////
////        private final int lI;
////
////        private SeekOrigin(int newValue) {
////            this.lI = newValue;
////        }
////
////        public int getValue() {
////            return this.lI;
////        }
////
////        public static SeekOrigin getByValue(int value) {
////            SeekOrigin[] var1 = values();
////            int var2 = var1.length;
////
////            for(int var3 = 0; var3 < var2; ++var3) {
////                SeekOrigin var4 = var1[var3];
////                if (var4.getValue() == value) {
////                    return var4;
////                }
////            }
////
////            throw new IllegalArgumentException("No SeekOrigin with value " + value);
////        }
////    }
////}
