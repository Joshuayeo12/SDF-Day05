package day05;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class GetFile {
    public static void main(String[] args) {
        // "Downloads", "gol", "blinker.gol"
        // Get the user's home directory
        String homeDirectory = System.getProperty("user.home");

        // Construct the path to the file in the Downloads folder
        Path downloadsPath = Paths.get(homeDirectory, "Downloads", "gol", "blinker.gol");

        // Check if the file exists
        if (Files.exists(downloadsPath)) {
            System.out.println("File found: " + downloadsPath.toAbsolutePath());
        } else {
            System.out.println("File not found.");
        }
    }

    @Override
    public String toString() {
        return "GetFile []";
    }
}

    




