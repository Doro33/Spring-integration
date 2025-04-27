package com.example.integrationpractice;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Component
public class FileCopyHandler {

    private static final String OUTPUT_FILE = "output/destination.txt";

    @ServiceActivator(inputChannel = "fileCopyChannel")
    public void handleLine(String line) {
        System.out.println("📄 Copying line to file: " + line);
        try {
            File outputFile = new File(OUTPUT_FILE);
            outputFile.getParentFile().mkdirs(); // Create output/ folder if it doesn't exist
            try (BufferedWriter writer =
                         new BufferedWriter(new FileWriter(outputFile, true))) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("❌ Error writing line to file: " + e.getMessage());
        }
    }
}
