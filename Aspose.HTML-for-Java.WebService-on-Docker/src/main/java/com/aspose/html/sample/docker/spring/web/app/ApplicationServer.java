package com.aspose.html.sample.docker.spring.web.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SpringBootApplication
public class ApplicationServer {
    public static void main(String[] args) {
        SpringApplication.run(
                ApplicationServer.class,
                args
        );
    }
}
