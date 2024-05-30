package com.aspose.html.samples.benchmark;

import com.aspose.html.HTMLDocument;
import com.aspose.html.drawing.Margin;
import com.aspose.html.drawing.Page;
import com.aspose.html.saving.PdfSaveOptions;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.infra.IterationParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.profiler.Profiler;
import org.slf4j.profiler.TimeInstrument;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Fork(
        value = 1,
        warmups = 2
)
@Timeout(time = 3, timeUnit = TimeUnit.MINUTES)
@Warmup(iterations = 1, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 1, time = 1, timeUnit = TimeUnit.SECONDS, batchSize = 1)
@OutputTimeUnit(TimeUnit.SECONDS)
@BenchmarkMode({Mode.AverageTime})
@Threads(1)
@State(Scope.Thread)
public class BenchmarkConverter {
    private static Logger log = LoggerFactory.getLogger(BenchmarkConverter.class);

    @Benchmark
    @Setup(Level.Iteration)
    public static void benchmark_2(IterationParams params) {
        String phaseName = params.getType().name();

        Profiler profiler = new Profiler("Benchmark Phase: "+phaseName);
        profiler.setLogger(log);
        try {
            profiler.start("new HTMLDocument(input);");
            String input = "E:\\prj\\aspose\\issues\\data\\input\\HTMLJAVA_1715\\HTMLJAVA_1715.html";
            String cssinput = "E:\\prj\\aspose\\issues\\data\\input\\HTMLJAVA_1715\\styles.css";
            String output = "E:\\prj\\aspose\\issues\\data\\output\\HTMLJAVA_1715\\HTMLJAVA_1715.ts_2024-05-03T23.45.15.095.v_v0.0.0.jvm_11.0.20.1.ext_1.out.pdf";
            HTMLDocument document = new HTMLDocument(input);
            profiler.start("head.appendChild(link);");
            com.aspose.html.dom.Element link = document.createElement("link");
            link.setAttribute("rel", "stylesheet");
            link.setAttribute("href", cssinput);
            com.aspose.html.dom.Element head = document.getElementsByTagName("head").get_Item(0);
            head.appendChild(link);
            profiler.start("new PdfSaveOptions();");
            PdfSaveOptions options = new PdfSaveOptions();
            options.getPageSetup().setAnyPage(
                    new Page(new com.aspose.html.drawing.Size(com.aspose.html.drawing.Length.fromMillimeters(297),
                            com.aspose.html.drawing.Length.fromMillimeters(210)), new Margin(0, 0, 0, 0)));
            options.getPageSetup().setAdjustToWidestPage(true);

            profiler.start("convertHTML to file;");
            com.aspose.html.converters.Converter.convertHTML(document, options, output);
            profiler.start("convertHTML to memory;");
            try (MemoryStreamProvider streamProvider = new MemoryStreamProvider()) {
                com.aspose.html.converters.Converter.convertHTML(document, options, streamProvider.lStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } finally {
            TimeInstrument stop = profiler.stop();
            stop.print();
            stop.log();

        }
    }

    @Benchmark
    public void measureName(Blackhole bh) {

    }
}


