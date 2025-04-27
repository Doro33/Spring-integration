package com.example.integrationpractice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FileSplitter {
    public List<String> split(File file) throws IOException {
        System.out.println("🔪 Splitting file: " + file.getName());
        return Files.readAllLines(file.toPath());
    }
}