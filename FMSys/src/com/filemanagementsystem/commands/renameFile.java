package com.filemanagementsystem.commands;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class renameFile {
    public renameFile() {
        Scanner sc = new Scanner(System.in);

        // Current file name with exact path
        System.out.print("Enter exact location of file: ");
        Path soucePath = Path.of(sc.nextLine());

        // take Parent location from sourcePath
        Path location = soucePath.getParent();

        System.out.print("Rename to: ");
        String rename = sc.nextLine();

        // make full path
        Path targetPath = location.resolve(rename);

        try {
            Files.move(soucePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File renamed successfully to " + rename);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
