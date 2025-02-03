package com.company.homework3.proxyPattern;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RealTextFile implements TextFile{
    private final String filePath;
    File file;
    public RealTextFile(String filePath) {
        this.filePath = filePath;
        file = new File(filePath);
        loadFileFromDisk();
    }

    private void loadFileFromDisk() {
        System.out.println("Загрузка текстового файла: " + filePath + "/....");
    }
    @Override
    public void display() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}
