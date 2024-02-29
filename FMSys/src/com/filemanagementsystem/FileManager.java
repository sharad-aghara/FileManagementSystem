package com.filemanagementsystem;

import java.util.Scanner;

import com.filemanagementsystem.commands.*;

public class FileManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to File Management System.");
        System.out.println("\nCommands to Navigate through project: " +
                "\nTo Create new file     -> Create or 1" +
                "\nTo Rename a file       -> Rename or 2" +
                "\nTo Copy a file         -> Copy or 3" +
                "\nTo Delete a file       -> Delete or 4" +
                "\nTo Search for file     -> Search or 5" +
                "\nTo Change location     -> Move or 6" +
                "\nTo get file info       -> fileInfo or 7" +
                "\nExit form FMS          -> Exit or 0");

        while (true) {

            System.out.print("\nEnter a Command: ");
            String command = sc.nextLine();

            if (command.equalsIgnoreCase("exit") || command.equalsIgnoreCase("0")) {
                break;
            }
            if (command.equalsIgnoreCase("create") || command.equalsIgnoreCase("1")) {
                new createFile();
            }
            if (command.equalsIgnoreCase("rename") || command.equalsIgnoreCase("2")) {
                new renameFile();
            }
            if (command.equalsIgnoreCase("copy") || command.equalsIgnoreCase("3")) {
                new copyFile();
            }
            if (command.equalsIgnoreCase("delete") || command.equalsIgnoreCase("4")) {
                new deleteFile();
            }
            if (command.equalsIgnoreCase("locate") || command.equalsIgnoreCase("5")) {
                new locateFile();
            }
            if (command.equalsIgnoreCase("move") || command.equalsIgnoreCase("6")) {
                new moveFile();
            }
            if (command.equalsIgnoreCase("fileInfo") || command.equalsIgnoreCase("7")) {
                new fileInfo();
            } else {
                System.out.println("Invalid command. Try again.");
            }
        }
    }
}
