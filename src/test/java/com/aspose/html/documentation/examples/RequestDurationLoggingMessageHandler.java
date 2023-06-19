package com.aspose.html.documentation.examples;

import com.aspose.html.Url;
import com.aspose.html.net.MessageHandler;
import com.aspose.html.utils.TimeSpan;

import java.util.HashMap;
import java.util.Map;

// START_SNIPPET MessageHandlers_RequestDurationLoggingMessageHandler
public abstract class RequestDurationLoggingMessageHandler extends MessageHandler {

    private static Map<Url, Long> requests = new HashMap<>();

    protected void startTimer(Url url)
    {
        requests.put(url, System.currentTimeMillis());
    }

    protected TimeSpan stopTimer(Url url)
    {
        long end = System.currentTimeMillis();
        long start = requests.get(url);
        return new TimeSpan(end - start);
    }
}
// END_SNIPPET
