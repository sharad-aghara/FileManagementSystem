package com.filemanagementsystem.commands;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class copyFile {
    public copyFile() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Source location: ");
        Path sourcePath = Path.of(sc.nextLine());

        System.out.print("Enter destination location: ");
        Path destPath = Path.of(sc.nextLine());

        try {
            Files.copy(sourcePath, destPath.resolve(sourcePath.getFileName()), StandardCopyOption.COPY_ATTRIBUTES);
            System.out.println("File copied successfully to location: " + destPath);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
