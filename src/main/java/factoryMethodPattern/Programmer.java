package factoryMethodPattern;

public class Programmer extends Employee {
    public Programmer(String name) {
        super(name);
        System.out.printf("\nБыло создано рабочее место Программист. Его зовут %s.", getName());
    }

    @Override
    public void doSomething() {
        System.out.printf(" Программист %s пишет код",getName());
    }
}
