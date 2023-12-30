package com.filemanagementsystem.commands;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import static java.nio.file.StandardCopyOption.ATOMIC_MOVE;

public class moveFile {
    public moveFile() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Move from: ");
        Path sourceLocation = Path.of(sc.nextLine());

        System.out.print("Move to location: ");
        Path destiLocation = Path.of(sc.nextLine());

        try{
            Files.move(sourceLocation, destiLocation.resolve(sourceLocation.getFileName()), ATOMIC_MOVE);
            System.out.print("File moved to " + destiLocation);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
