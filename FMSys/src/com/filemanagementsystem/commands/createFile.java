package com.filemanagementsystem.commands;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class createFile {
    public createFile() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file location: ");
        String customLocation = sc.nextLine();

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        Path filePath = Paths.get(customLocation, fileName);

//        new gtLocation();
//        Path filePath = Paths.get(customLocation, fileName);

        try {
            Files.createFile(filePath);
            System.out.println("File created successfully at " + filePath);
        } catch (IOException e) {
            // catch (IOException | UnsupportedOperationException | SecurityException e)
            System.out.println("Error: " + e.getMessage());
        }
    }
}
