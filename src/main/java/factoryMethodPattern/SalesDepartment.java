package factoryMethodPattern;

public class SalesDepartment extends Department {
    @Override
    public Employee createEmployee(String name) {
        return new SalesManager(name);
    }
}
