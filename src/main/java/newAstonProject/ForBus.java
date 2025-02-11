package newAstonProject;

import newAstonProject.classes.Bus;
import newAstonProject.comparators.BusComporators;
import newAstonProject.comparators.CompositeComparator;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static newAstonProject.InputScanner.*;

public class ForBus {

    public static void run(String[] args) {

        Bus[] buses = createBusArray();
        processBuses(buses);
    }

    private static void processBuses(Bus[] buses) {
        System.out.println("Ваш выбор: 1 - быстрая сортировка, 2 - кастомная сортировка, 3 - бинарный поиск");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                QuickSortWithStrategy<Bus> busQuickSortWithStrategy = new QuickSortWithStrategy<>
                        (new CompositeComparator<>(
                                new BusComporators.SortByNumber(),
                                new BusComporators.SortByModel(),
                                new BusComporators.SortByMileage()
                        ));
                busQuickSortWithStrategy.sort(buses);
                break;
            case 2:
                chooseCustomSort(buses);
                break;
            case 3:
                busBinarySearch(buses);
                break;
            default:
                System.out.println("Неверный выбор");
                break;
        }
    }

    private static void busBinarySearch(Bus[] buses) {

    }

    private static void chooseCustomSort(Bus[] buses) {
        System.out.println("Выберите по каким параметрам сортировать (можно несколько до 2 параметров):\n" +
                "По номеру автобуса - 1, по модели - 2, по пробегу - 3");
        int choice = InputScanner.getIntInput("Сделайте ваш выбор: ");

        switch (choice) {
            case 1:
                new QuickSortWithStrategy<>(new CompositeComparator<>(
                        new BusComporators.SortByNumber())).sort(buses);
                break;
            case 2:
                new QuickSortWithStrategy<>(new CompositeComparator<>(
                        new BusComporators.SortByModel())).sort(buses);
                break;
            case 3:
                new QuickSortWithStrategy<>(new CompositeComparator<>(
                        new BusComporators.SortByMileage())).sort(buses);
                break;
            case 12:
                new QuickSortWithStrategy<>(new CompositeComparator<>(
                        new BusComporators.SortByNumber(), new BusComporators.SortByNumber())).sort(buses);
                break;
            case 13:
                new QuickSortWithStrategy<>(new CompositeComparator<>(
                        new BusComporators.SortByNumber(), new BusComporators.SortByMileage())).sort(buses);
                break;
            case 21:
                new QuickSortWithStrategy<>(new CompositeComparator<>(
                        new BusComporators.SortByModel(), new BusComporators.SortByNumber())).sort(buses);
                break;
            case 23:
                new QuickSortWithStrategy<>(new CompositeComparator<>(
                        new BusComporators.SortByModel(), new BusComporators.SortByMileage())).sort(buses);
                break;
            case 31:
                new QuickSortWithStrategy<>(new CompositeComparator<>(
                        new BusComporators.SortByMileage(), new BusComporators.SortByNumber())).sort(buses);
                break;
            case 32:
                new QuickSortWithStrategy<>(new CompositeComparator<>(
                        new BusComporators.SortByMileage(), new BusComporators.SortByModel())).sort(buses);
                break;
            default:
                System.out.println("Неверный выбор");
                break;
        }
    }

    private static void fillArrayRandomly(Bus[] buses) {
        for (int i = 0; i < buses.length; i++) {
            buses[i] = ModelFactory.createRandomBus();
        }
        printArray(buses);
    }

    private static void fillArrayManually(Bus[] buses) {
        for (int i = 0; i < buses.length; i++) {
            buses[i] = ModelFactory.createBus(
                    getStringInput("Номер: "),
                    getStringInput("Модель: "),
                    getIntInput("Пробег: "));
        }
        printArray(buses);
    }

    private static void fillArrayFromFile(Bus[] buses) {

    }

    public static void printArray(Bus[] buses) {
        System.out.println("Массив автобусов: ");
        for (Bus bus : buses) {
            System.out.println(bus);
        }
    }

    static Bus[] createBusArray() {
        System.out.println("Выберите способ заполнения массива:");
        System.out.println("1. Случайно");
        System.out.println("2. Вручную");
        System.out.println("3. Из файла");
        System.out.println("Ваш выбор: ");
        int choice = scanner.nextInt();
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        Bus[] buses = new Bus[size];
        switch (choice) {
            case 1:
                fillArrayRandomly(buses);
                break;
            case 2:
                fillArrayManually(buses);
                break;
            case 3:
                fillArrayFromFile(buses);
                break;
            default:
                System.out.println("Неверный выбор. Заполняем случайно.");
                fillArrayRandomly(buses);
        }
        return buses;
    }
}
