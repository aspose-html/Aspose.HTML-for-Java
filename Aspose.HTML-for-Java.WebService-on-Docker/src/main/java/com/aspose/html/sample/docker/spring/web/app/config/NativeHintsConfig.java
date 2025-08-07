package com.aspose.html.sample.docker.spring.web.app.config;

import com.aspose.html.HTMLDocument;
import com.aspose.html.saving.ImageSaveOptions;
import com.aspose.html.saving.PdfSaveOptions;
import com.aspose.html.saving.XpsSaveOptions;
import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportRuntimeHints;

@Configuration
@ImportRuntimeHints(AsposeRuntimeHints.class)
public class NativeHintsConfig { }

class AsposeRuntimeHints implements RuntimeHintsRegistrar {
    @Override
    public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
        // Рефлексия для Aspose-типов
        hints.reflection().registerType(HTMLDocument.class,
                MemberCategory.INVOKE_DECLARED_CONSTRUCTORS,
                MemberCategory.INVOKE_PUBLIC_CONSTRUCTORS,
                MemberCategory.INVOKE_DECLARED_METHODS,
                MemberCategory.INVOKE_PUBLIC_METHODS);

        hints.reflection().registerType(PdfSaveOptions.class,
                MemberCategory.INVOKE_DECLARED_CONSTRUCTORS,
                MemberCategory.INVOKE_PUBLIC_CONSTRUCTORS,
                MemberCategory.INVOKE_DECLARED_METHODS,
                MemberCategory.INVOKE_PUBLIC_METHODS);

        hints.reflection().registerType(XpsSaveOptions.class,
                MemberCategory.INVOKE_DECLARED_CONSTRUCTORS,
                MemberCategory.INVOKE_PUBLIC_CONSTRUCTORS,
                MemberCategory.INVOKE_DECLARED_METHODS,
                MemberCategory.INVOKE_PUBLIC_METHODS);

        hints.reflection().registerType(ImageSaveOptions.class,
                MemberCategory.INVOKE_DECLARED_CONSTRUCTORS,
                MemberCategory.INVOKE_PUBLIC_CONSTRUCTORS,
                MemberCategory.INVOKE_DECLARED_METHODS,
                MemberCategory.INVOKE_PUBLIC_METHODS);

        // Ресурсы (шаблоны/статика/настройки)
        hints.resources().registerPattern("templates/**");
        hints.resources().registerPattern("static/**");
        hints.resources().registerPattern("application.properties");
        hints.resources().registerPattern("META-INF/**");

        // ResourceBundle
        hints.resources().registerResourceBundle("messages");
    }
}
