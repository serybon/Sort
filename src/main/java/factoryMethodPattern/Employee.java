package factoryMethodPattern;

public abstract class Employee {
    final private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void doSomething();
}
