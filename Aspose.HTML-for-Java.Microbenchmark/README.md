# Aspose.Html.Java.Sample.Microbenchmark

This is a sample project to demonstrate how make microbenchmark  **Aspose.HTML for Java** library

## Run Benchmark

For run benchmark using command from command line

```
./gradlew jmh
```

You can see report of benchmark 
in dir `build/jmh-reports`.
Each launch result is written to a separate file.

## Analyze Benchmark

You can get analyze it in human format 
from `xxx-human.txt`.  

You can see the visualization of results as 
upload  `xxx-result.json` 
to https://jmh.morethan.io/ site.

You can see profiling results in the output console. 
For each iteration printed elapsed time 
by steps and total time of iteration.

Benchmark has two types of iteration. 
- Several **warm-up** iterations are marked as `[Benchmark Phase: WARMUP]`. 
- Several **MEASUREMENT** iterations are marked as `[Benchmark Phase: MEASUREMENT]`

**NOTE:** Warm-up iterations are necessary for 
initial compiler optimization. After one,  two, three 
such iterations, stable real performance values 
can be observed.

## Setup project

See gradle. properties file for setting. 
You can set up the version of the library 
of Aspose.HTML for Java and select version JVM.






