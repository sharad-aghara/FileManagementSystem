package com.filemanagementsystem.commands;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class locateFile {
    public locateFile() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory to search in: ");
        Path startPath = Path.of(sc.nextLine());

        System.out.print("Enter target name: ");
        String targetName = sc.nextLine();

        try {
            Files.walkFileTree(startPath, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                    if (file.getFileName().toString().equals(targetName)) {
                        System.out.println("File found at location: " + file.toString());
                    }
                    // If you want to terminate after finding first match
                    return FileVisitResult.TERMINATE;

                    // If you want to continue the search after first match
                    // return FileVisitResult.CONTINUE;
                }

                // Because of any reasons if the file / directory have not been visited, this will let us know about that.
                @Override
                public FileVisitResult visitFileFailed(Path file, IOException exc) {
                    System.err.println("Error accessing file: " + file.toString() + " - " + exc.getMessage());
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
