package newAstonProject;

import newAstonProject.classes.Bus;
import newAstonProject.classes.User;
import newAstonProject.comparators.BusComporators;
import newAstonProject.comparators.ComparatorStrategy;
import newAstonProject.comparators.CompositeComparator;
import newAstonProject.comparators.UserComparators;

public class Menu {
    public static void main(String[] args) {
        Bus[] buses = {
                new Bus.Builder().setNumber("AB3211").setModel("Volvo").setMileage(50000).build(),
                new Bus.Builder().setNumber("AB3211").setModel("Volvo").setMileage(30000).build(),
                new Bus.Builder().setNumber("DH3233").setModel("Kamaz").setMileage(40000).build()
        };

        CompositeComparator<Bus> busCompositeComparator = new CompositeComparator<>(
                new BusComporators.SortByModel(),
                new BusComporators.SortByNumber(),
                new BusComporators.SortByMileage()
        );

        QuickSort<Bus> busQuickSort = new QuickSort<>(busCompositeComparator);
        busQuickSort.sort(buses);

        for(Bus bus : buses){
            System.out.println(bus);
        }

        User[] users = {
                new User.Builder().setName("Alice").setPassword("pass123").setEmail("alice@example.com").build(),
                new User.Builder().setName("AACharlie").setPassword("mypassword").setEmail("charlie@example.com").build(),
                new User.Builder().setName("Alice").setPassword("qwerty").setEmail("aabob@example.com").build()
        };

        CompositeComparator<User> userComparator = new CompositeComparator<>(
                new UserComparators.SortByName(),
                new UserComparators.SortByEmail()
        );

        QuickSort<User> userQuickSort = new QuickSort<>(userComparator);
        userQuickSort.sort(users);
        for(User user : users){
            System.out.println(user);
        }
    }
}
