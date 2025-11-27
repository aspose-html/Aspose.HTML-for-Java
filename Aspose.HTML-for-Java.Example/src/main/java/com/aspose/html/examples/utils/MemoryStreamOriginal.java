package com.aspose.html.examples.utils;/// ///
/// /// Source code recreated from a .class file by IntelliJ IDEA
/// /// (powered by FernFlower decompiler)
/// ///
/// /
/// /package  com.aspose.html.utils;
/// /
/// /import com.aspose.html.documentation.examples.utils.ms.System.*;
/// /import com.aspose.html.documentation.examples.utils.ms.System.StringExtensions;
/// /import com.aspose.html.documentation.examples.utils.ms.System.IO.IOException;
/// /
/// /import java.io.ByteArrayOutputStream;
/// /import java.io.InputStream;
/// /
/// /
//import com.aspose.html.drawing.Resolution;
//import com.aspose.html.rendering.image.ImageDevice;
//import com.aspose.html.rendering.image.ImageFormat;
//import com.aspose.html.rendering.image.ImageRenderingOptions;
//import com.aspose.html.documentation.examples.utils.*;
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
//import com.aspose.html.net.MessageHandler;
//import com.aspose.html.net.INetworkOperationContext;
//import com.aspose.html.net.MessageFilter;
//import com.aspose.html.documentation.examples.utils.File;
//import java.nio.file.Paths;
//import com.aspose.html.forms.FormSubmitter;
//import com.aspose.html.forms.SubmissionResult;
//import com.aspose.html.forms.TextAreaElement;
//import java.util.HashMap;
//
// public class MemoryStreamOriginal extends Stream {
////    private boolean a;
////    private boolean b;
////    private int c;
////    private int d;
////    private byte[] e;
////    private int f;
////    private boolean g;
////    private boolean h;
////    private int i;
////    private int j;
////
////    public MemoryStreamOriginal() {
////        this(0);
////    }
////
////    public MemoryStreamOriginal(int var1) {
////        if (var1 < 0) {
////            throw new ArgumentOutOfRangeException("capacity");
////        } else {
////            this.a = true;
////            this.c = var1;
////            this.e = new byte[var1];
////            this.g = true;
////            this.b = true;
////            this.b();
////        }
////    }
////
////    public MemoryStreamOriginal(byte[] var1) {
////        if (var1 == null) {
////            throw new ArgumentNullException("buffer");
////        } else {
////            this.a(var1, 0, var1.length, true, false);
////        }
////    }
////
////    public MemoryStreamOriginal(byte[] var1, boolean var2) {
////        if (var1 == null) {
////            throw new ArgumentNullException("buffer");
////        } else {
////            this.a(var1, 0, var1.length, var2, false);
////        }
////    }
////
////    public MemoryStreamOriginal(byte[] var1, int var2, int var3) {
////        this.a(var1, var2, var3, true, false);
////    }
////
////    public MemoryStreamOriginal(byte[] var1, int var2, int var3, boolean var4) {
////        this.a(var1, var2, var3, var4, false);
////    }
////
////    public MemoryStreamOriginal(byte[] var1, int var2, int var3, boolean var4, boolean var5) {
////        this.a(var1, var2, var3, var4, var5);
////    }
////
////    private void a(byte[] var1, int var2, int var3, boolean var4, boolean var5) {
////        if (var1 == null) {
////            throw new ArgumentNullException("buffer");
////        } else if (var2 >= 0 && var3 >= 0) {
////            if (var1.length - var2 < var3) {
////                throw new ArgumentException("index+count", "The size of the buffer is less than index + count.");
////            } else {
////                this.a = var4;
////                this.e = var1;
////                this.c = var3 + var2;
////                this.d = this.c;
////                this.i = var2;
////                this.f = var2;
////                this.b = var5;
////                this.g = false;
////                this.b();
////            }
////        } else {
////            throw new ArgumentOutOfRangeException("index or count is less than 0.");
////        }
////    }
////
////    private void a() {
////        if (this.h) {
////            throw new ObjectDisposedException("MemoryStream");
////        }
////    }
////
////    public boolean canRead() {
////        return !this.h;
////    }
////
////    public boolean canSeek() {
////        return !this.h;
////    }
////
////    public boolean canWrite() {
////        return !this.h && this.a;
////    }
////
////    public int getCapacity() {
////        this.a();
////        return this.c - this.f;
////    }
////
////    public void setCapacity(int var1) {
////        this.a();
////        if (!this.g) {
////            throw new NotSupportedException("Cannot expand this MemoryStream");
////        } else if (var1 >= 0 && var1 >= this.d) {
////            if (this.e == null || var1 != this.e.length) {
////                byte[] var2 = null;
////                if (var1 != 0) {
////                    var2 = new byte[var1];
////                    if (this.e != null) {
////                        System.arraycopy(this.e, 0, var2, 0, this.d);
////                    }
////                }
////
////                this.j = 0;
////                this.e = var2;
////                this.c = var1;
////                this.b();
////            }
////        } else {
////            throw new ArgumentOutOfRangeException("value", StringExtensions.concat(new Object[]{"New capacity cannot be negative or less than the current capacity ", var1, " ", this.c}));
////        }
////    }
////
////    public long getLength() {
////        this.a();
////        return (long)(this.d - this.f);
////    }
////
////    public long getPosition() {
////        this.a();
////        return (long)(this.i - this.f);
////    }
////
////    public void setPosition(long var1) {
////        this.a();
////        if (var1 < 0L) {
////            throw new ArgumentOutOfRangeException("value", "Position cannot be negative");
////        } else if (var1 > 2147483647L) {
////            throw new ArgumentOutOfRangeException("value", "Position must be non-negative and less than 2^31 - 1 - origin");
////        } else {
////            this.i = this.f + (int)var1;
////        }
////    }
////
////    public void dispose(boolean var1) {
////        this.h = true;
////        this.g = false;
////    }
////
////    public void flush() {
////    }
////
////    public byte[] getBuffer() {
////        if (!this.b) {
////            throw new IOException();
////        } else {
////            return this.e;
////        }
////    }
////
////    public int read(byte[] var1, int var2, int var3) {
////        if (var1 == null) {
////            throw new ArgumentNullException("buffer");
////        } else if (var2 >= 0 && var3 >= 0) {
////            if (var1.length - var2 < var3) {
////                throw new ArgumentException("offset+count", "The size of the buffer is less than offset + count.");
////            } else {
////                this.a();
////                if (this.i < this.d && var3 != 0) {
////                    if (this.i > this.d - var3) {
////                        var3 = this.d - this.i;
////                    }
////
////                    System.arraycopy(this.e, this.i, var1, var2, var3);
////                    this.i += var3;
////                    return var3;
////                } else {
////                    return 0;
////                }
////            }
////        } else {
////            throw new ArgumentOutOfRangeException("offset or count less than zero.");
////        }
////    }
////
////    public int readByte() {
////        this.a();
////        return this.i >= this.d ? -1 : this.e[this.i++] & 255;
////    }
////
////    public long seek(long var1, int var3) {
////        this.a();
////        if (var1 > 2147483647L) {
////            throw new ArgumentOutOfRangeException(StringExtensions.concat(new Object[]{"Offset out of range. ", var1}));
////        } else {
////            int var4;
////            switch (var3) {
////                case 0:
////                    if (var1 < 0L) {
////                        throw new IOException("Attempted to seek before start of MemoryStream.");
////                    }
////
////                    var4 = this.f;
////                    break;
////                case 1:
////                    var4 = this.i;
////                    break;
////                case 2:
////                    var4 = this.d;
////                    break;
////                default:
////                    throw new ArgumentException("loc", "Invalid SeekOrigin");
////            }
////
////            var4 += (int)var1;
////            if (var4 < this.f) {
////                throw new IOException("Attempted to seek before start of MemoryStream.");
////            } else {
////                this.i = var4;
////                return (long)this.i;
////            }
////        }
////    }
////
////    private int a(int var1) {
////        if (var1 < 256) {
////            var1 = 256;
////        }
////
////        if (var1 < this.c * 2) {
////            var1 = this.c * 2;
////        }
////
////        return var1;
////    }
////
////    private void b(int var1) {
////        if (var1 > this.c) {
////            this.setCapacity(this.a(var1));
////        } else if (this.j > 0) {
////            msArray.clear(this.e, this.d, this.j);
////            this.j = 0;
////        }
////
////    }
////
////    public void setLength(long var1) {
////        if (!this.g && var1 > (long)this.c) {
////            throw new NotSupportedException("Expanding this MemoryStream is not supported");
////        } else {
////            this.a();
////            if (!this.a) {
////                throw new NotSupportedException("Cannot write to this MemoryStream");
////            } else if (var1 >= 0L && var1 + (long)this.f <= 2147483647L) {
////                int var3 = (int)var1 + this.f;
////                if (var3 > this.d) {
////                    this.b(var3);
////                } else if (var3 < this.d) {
////                    this.j += this.d - var3;
////                }
////
////                this.d = var3;
////                if (this.i > this.d) {
////                    this.i = this.d;
////                }
////
////            } else {
////                throw new ArgumentOutOfRangeException();
////            }
////        }
////    }
////
////    public byte[] toArray() {
////        int var1 = this.d - this.f;
////        byte[] var2 = new byte[var1];
////        if (this.e != null) {
////            System.arraycopy(this.e, this.f, var2, 0, var1);
////        }
////
////        return var2;
////    }
////
////    public void write(byte[] var1, int var2, int var3) {
////        if (!this.a) {
////            throw new NotSupportedException("Cannot write to this stream.");
////        } else if (var1 == null) {
////            throw new ArgumentNullException("buffer");
////        } else if (var2 >= 0 && var3 >= 0) {
////            if (var1.length - var2 < var3) {
////                throw new ArgumentException("offset+count", "The size of the buffer is less than offset + count.");
////            } else {
////                this.a();
////                if (this.i > this.d - var3) {
////                    this.b(this.i + var3);
////                }
////
////                System.arraycopy(var1, var2, this.e, this.i, var3);
////                this.i += var3;
////                if (this.i >= this.d) {
////                    this.d = this.i;
////                }
////
////                this.b();
////            }
////        } else {
////            throw new ArgumentOutOfRangeException();
////        }
////    }
////
////    public void writeByte(byte var1) {
////        this.a();
////        if (!this.a) {
////            throw new NotSupportedException("Cannot write to this stream.");
////        } else {
////            if (this.i >= this.d) {
////                this.b(this.i + 1);
////                this.d = this.i + 1;
////            }
////
////            this.e[this.i++] = var1;
////        }
////    }
////
////    public void writeTo(Stream var1) {
////        this.a();
////        if (var1 == null) {
////            throw new ArgumentNullException("stream");
////        } else {
////            var1.write(this.e, this.f, this.d - this.f);
////        }
////    }
////
////    public static MemoryStreamOriginal fromInputStream(InputStream var0) throws java.io.IOException {
////        ByteArrayOutputStream var1 = new ByteArrayOutputStream();
////        byte[] var2 = new byte[4096];
////
////        int var3;
////        while(-1 != (var3 = var0.read(var2))) {
////            var1.write(var2, 0, var3);
////        }
////
////        return new MemoryStreamOriginal(var1.toByteArray());
////    }
////
////    private void b() {
////    }
////}
