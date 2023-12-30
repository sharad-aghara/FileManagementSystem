package com.filemanagementsystem.commands;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class deleteFile {
    public deleteFile() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file location: ");
        String customLocation = sc.nextLine();

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        Path filePath = Paths.get(customLocation, fileName);

        try {
            Files.deleteIfExists(filePath);
            System.out.println(fileName + " from the location " + customLocation + " deleted successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
