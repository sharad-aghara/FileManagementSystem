package com.filemanagementsystem.commands;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.util.Scanner;

public class fileInfo {
    public fileInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Exact location of file: ");
        Path filePath = Path.of(sc.nextLine());

        try {
            // to get info of basic attributes
            BasicFileAttributes ba = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Size: " + ba.size() + " bytes");
            System.out.println("Created on: " + ba.creationTime());
            System.out.println("Last modified on: " + ba.lastModifiedTime());

            // to get owner info
            FileOwnerAttributeView foa = Files.getFileAttributeView(filePath, FileOwnerAttributeView.class);
            UserPrincipal owner = foa.getOwner();
            System.out.println("Owner: " + owner.getName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
