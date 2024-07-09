package com.redhat.spring.cloud.config.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@SpringBootApplication
public class ApplicationServer {
    public static void main(String[] args) {
        SpringApplication.run(
                ApplicationServer.class,
                args
        );
        System.out.println("Operative System:" + System.getProperty("os.name"));
        print("java -version");
    }

    private static void print(String command) {
        try {
            Process p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader buf = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = "";
            String output = "";
            while ((line = buf.readLine()) != null) {
                output += line + "\n";
            }
            System.out.println(output);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
