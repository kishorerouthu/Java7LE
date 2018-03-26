package com.java7;

/**
 * @author Kishore Routhu on 24/10/17 7:37 PM.
 */
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class TestFA {
    static void printAttributes(File file) throws IOException {
        Path p = Paths.get(file.getPath());
        BasicFileAttributes attr = Files.readAttributes(p, BasicFileAttributes.class);
        System.out.println("creationTime: " + attr.creationTime());
        System.out.println("lastAccessTime: " + attr.lastAccessTime());
        System.out.println("lastModifiedTime: " + attr.lastModifiedTime());
    }
    public static void main(String[] args) throws IOException {
        File file = new File("/tmp/dependency1.txt");
        printAttributes(file);
    }
}
