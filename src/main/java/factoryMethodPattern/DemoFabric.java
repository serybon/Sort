package factoryMethodPattern;

public class DemoFabric {
    public static void main(String[] args) {
        Department department = new SalesDepartment();
        Employee employee = department.createEmployee("Валера");
        employee.doSomething();
        Department itDep = new ITDepartment();
        Employee employee2 = itDep.createEmployee("Володя");
        employee2.doSomething();

    }
}
