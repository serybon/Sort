package newAstonProject.comparators;

public interface ComparatorStrategy<T> {
    int compare(T o1, T o2);
}
