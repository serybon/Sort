package factoryMethodPattern;

public class SalesManager extends Employee {
    public SalesManager(String name) {
        super(name);
        System.out.printf("\nСоздано рабочее место менеджера по продажам. Нового сотрудника зовут %s.", getName());
    }

    @Override
    public void doSomething() {
        System.out.printf(" Менеджер %s по продажам ведет переговоры", getName());

    }
}
