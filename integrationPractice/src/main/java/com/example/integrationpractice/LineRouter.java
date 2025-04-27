package com.example.integrationpractice;

import org.springframework.stereotype.Component;

@Component
public class LineRouter {
/*
    public String route(String line) {
        if (line.contains("@gmail.com")) {
            System.out.println("📬 Routing to DB Channel: " + line);
            return "dbChannel";
        } else if (line.toLowerCase().contains("name")) { // simple name pattern (first letter capitalized)
            System.out.println("📂 Routing to File Copy Channel: " + line);
            return "fileCopyChannel";
        } else {
            System.out.println("🗑️ Dropping line: " + line);
            return null; // goes to default (nullChannel = dropped)
        }
    }
*/

    public boolean isGmail(String line) {
        return line.contains("@gmail.com");
    }

    public boolean hasName(String line) {
        return line.toLowerCase().contains("name");
    }
}
