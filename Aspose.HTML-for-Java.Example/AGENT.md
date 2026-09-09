# Agent Guide for Aspose.HTML for Java Examples

## Purpose

This is a Gradle project of documentation examples for Aspose.HTML for Java. Production-style application architecture is out of scope: each example should remain a small, readable, self-contained snippet that can be published in product documentation.

## Repository Structure

- `src/main/java/com/aspose/html/examples/` contains the examples, grouped by documentation area.
- `src/main/resources/` contains all bundled input documents, images, fonts, archives, and templates.
- `src/main/java/com/aspose/html/examples/utils/` contains shared helpers. Reuse these helpers instead of duplicating resource or output-path handling.
- `build.gradle`, `gradle.properties`, and `gradle/libs.versions.toml` define the build and dependencies.
- `aspsoe-examples-output/` and `build/` are generated directories. Do not edit their contents or add generated artifacts to source control.

## Build and Test

Run commands from the repository root with the Gradle wrapper:

```powershell
.\gradlew.bat classes
.\gradlew.bat test --tests "fully.qualified.ExampleClass"
.\gradlew.bat test
```

On Unix-like systems, use `./gradlew` instead of `gradlew.bat`.

The `test` task intentionally runs test methods located in `src/main/java`, not only `src/test/java`. Always run the narrowest affected test first. Full-suite runs can require network access because some examples download remote resources.

The configured JDK is controlled by `JAVA_VERSION` in `gradle.properties`; keep it compatible with the `jdk${JAVA_VERSION}` Aspose.HTML dependency classifier declared in `build.gradle`.

## Example Conventions

- Keep the package name aligned with the folder path under `com.aspose.html.examples`.
- Implement runnable examples as public classes with JUnit 5 `@Test` methods. Follow nearby classes for `@Timeout` usage.
- Preserve `// @START_SNIPPET` and `// @END_SNIPPET` markers: downstream documentation tooling consumes them.
- Keep code between snippet markers concise and focused on the documented API scenario. Setup, assertions, and cleanup may remain outside when that improves the published snippet.
- Use `Resources.$i("name")` to resolve a file from `src/main/resources`.
- Use `Resources.$o("name")` for every generated output. It creates an example-specific output directory under `aspsoe-examples-output/` by default.
- Use `FileHelper.exists(...)` and `Assert.True(...)` when an example should validate that it produced a file.
- Add required assets to `src/main/resources`; do not rely on developer-specific absolute paths.
- Close `HTMLDocument`, streams, and other closeable API objects using try-with-resources where the API supports it.

## Change Discipline

- Make minimal, topic-local changes; do not reformat unrelated examples.
- Do not modify Gradle wrapper files, dependency versions, or `gradle.properties` unless the requested change requires it.
- Do not alter existing generated output, IDE metadata, or unrelated working-tree changes.
- Keep source compatible with the configured Java level and existing project style (four-space indentation, explicit imports, no wildcard imports unless already required).
- Update the nearest topic `README.md` and `index.json` when adding, removing, or materially changing a documentation example, following the established structure in that topic.

## Verification Checklist

1. Confirm referenced resource names exist under `src/main/resources`.
2. Run `classes` after build-related changes.
3. Run the exact affected test class or method after an example change.
4. Inspect the generated artifact when the example produces a visual or document output.
5. Report any failure caused by external network access, licensing, or unrelated pre-existing code without masking it.
