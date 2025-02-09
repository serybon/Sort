package newAstonProject;

import newAstonProject.comparators.ComparatorStrategy;

public class QuickSort<T> {

    private ComparatorStrategy<T> strategy;

    public QuickSort(ComparatorStrategy<T> strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ComparatorStrategy<T> strategy) {
        this.strategy = strategy;
    }

    public void sort(T[] items) {
        quickSort(items, 0, items.length - 1);
    }

    private void quickSort(T[] items, int low, int high) {
        if (low < high) {
            // Разделяем массив и получаем индекс
            int pivotIndex = partition(items, low, high);
            // Рекурсивно сортируем подмассивы
            quickSort(items, low, pivotIndex - 1);
            quickSort(items, pivotIndex + 1, high);
        }
    }

    private int partition(T[] items, int low, int high) {
        // Выбираем последний элемент в качестве опорного (pivot)
        T pivot = items[high];
        int i = low - 1; // Индекс меньшего элемента

        for (int j = low; j < high; j++) {
            // Если текущий элемент меньше или равен опорному
            if (strategy.compare(items[j], pivot) <= 0) {
                i++;
                // Меняем местами items[i] и items[j]
                swap(items, i, j);
            }
        }
        // Меняем местами опорный элемент с элементом на позиции i + 1
        swap(items, i + 1, high);
        return i + 1; // Возвращаем индекс опорного элемента
    }

    private void swap(T[] items, int i, int j) {
        T temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }
}
