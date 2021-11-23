package com.pb.oliinykpomaza.hw9;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File {
    public static void main(String[] args) throws Exception {

        Path testFile1 = Files.createFile(Paths.get("C:\\numbers.txt"));
    }
}