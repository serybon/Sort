package com.company.homework3.proxyPattern;

public class ProxyTextFile implements TextFile {
    private RealTextFile realTextFile;
    private final String filePath;

    public ProxyTextFile(String filePath) {
        this.filePath = filePath;
        System.out.println("Создан экземпляр класс ProxyTextFile");
        for (int i = 1; i < 6; i++) {
            System.out.print(i + "s ");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void display() {
        if (realTextFile == null) {
            System.out.println("\nЗагружаем текстовый файл по требованию через прокси");
            realTextFile = new RealTextFile(filePath);
        }
        System.out.println("Загружаем текстовый файл из хранилища прокси");
        realTextFile.display();
    }
}
