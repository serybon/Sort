package factoryMethodPattern;

public class ITDepartment extends Department{
    @Override
    public Employee createEmployee(String name) {
        return new Programmer(name);
    }


}
