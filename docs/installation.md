# Aspose.HTML for Java – Installation

This guide explains how to install Aspose.HTML for Java using Maven, Gradle, or by downloading the library manually. Choose the method that best fits your project setup.

## Install via Maven

Add the Aspose repository and dependency to your `pom.xml`:

```xml
<repositories>
     <repository>
         <id>snapshots</id>
         <name>repo</name>
         <url>http://repository.aspose.com/repo/</url>
     </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.aspose</groupId>
        <artifactId>aspose-html</artifactId>
        <version>25.12</version>
        <classifier>jdk16</classifier>
    </dependency>
</dependencies>
```

## Install via Gradle

Add the repository and dependency to your `build.gradle`:
```
repositories {
     maven {
         url = uri('https://repository.aspose.com/repo/')
     }
 }

dependencies {
    implementation "com.aspose:aspose-html:25.12"
}
```

After completing these steps, the Aspose.HTML for Java library will be successfully configured in your Maven project. You can now begin using its powerful features for HTML manipulation, conversion, and processing.
