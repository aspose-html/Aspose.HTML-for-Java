## Aspose.HTML for Java Examples with Maven/Gradle build tools

This directory contains Java examples for [Aspose.HTML for Java](https://products.aspose.com/html/java).

## How to use the Examples?

Clone or Download the ZIP and extract the contents to your local hard drive. This project uses Maven/Gradle build system and can be opened in any modern IDE like IntelliJ IDEA, Eclipse or NetBeans. For more details, visit our [Documentation website](https://docs.aspose.com/display/htmljava/How+to+Run+the+Examples).

## Step one
mvn compile test

## Execute all tests
mvn -Dtest="com.aspose.html.examples.**" test

.\gradlew test --tests "com.aspose.html.examples.*" for Windows

./gradlew test --tests "com.aspose.html.examples.*" for Linux

## Execute single test
mvn -Dtest=Examples_Java_AdvancedUsage_DOMMutationObserver_ObserveHowNodesAreAdded test

.\gradlew test --tests "com.aspose.html.examples.Examples_Java_AdvancedUsage_DOMMutationObserver_ObserveHowNodesAreAdded" for Windows

./gradlew test --tests "com.aspose.html.examples.Examples_Java_AdvancedUsage_DOMMutationObserver_ObserveHowNodesAreAdded" for Linux

## Execute asynchronously test in Thread
mvn org.codehaus.mojo:exec-maven-plugin:3.0.0:java -Dexec.mainClass="com.aspose.html.examples.SimpleWait" -Dexec.classpathScope="test" -Dexec.cleanupDaemonThreads=false

.\gradlew SimpleWait for Windows

./gradlew SimpleWait for Linux
