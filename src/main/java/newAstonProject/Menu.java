package newAstonProject;

import newAstonProject.classes.Bus;
import newAstonProject.classes.User;
import newAstonProject.comparators.BusComporators;
import newAstonProject.comparators.CompositeComparator;
import newAstonProject.comparators.UserComparators;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите тип данных для сортировки:");
            System.out.println("1. Автобусы");
            System.out.println("2. Студенты");
            System.out.println("3. Пользователи");
            System.out.println("0. Выход");

            System.out.println("Ваш выбор: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ForBus.run(args);
                    break;
                case 2:
                    ForStudent.run(args);
                    break;
                case 3:
                    ForUser.run(args);
                    break;
                case 0:
                    System.out.println("Программа завершена.");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }


//        Bus[] buses = {
//                new Bus.Builder().setNumber("AB3211").setModel("Volvo").setMileage(50000).build(),
//                new Bus.Builder().setNumber("AB3211").setModel("Volvo").setMileage(30000).build(),
//                new Bus.Builder().setNumber("DH3233").setModel("Kamaz").setMileage(40000).build()
//        };
//
//        CompositeComparator<Bus> busCompositeComparator = new CompositeComparator<>(
//                new BusComporators.SortByModel(),
//                new BusComporators.SortByNumber(),
//                new BusComporators.SortByMileage()
//        );
//new QuickSortWithStrategy<>new CompositeComparator<>(
//                new BusComporators.SortByModel(),
//                new BusComporators.SortByNumber(),
//                new BusComporators.SortByMileage()
//        );
//        QuickSortWithStrategy<Bus> busQuickSortWithStrategy = new QuickSortWithStrategy<>(busCompositeComparator);
//        busQuickSortWithStrategy.sort(buses);
//
//        for(Bus bus : buses){
//            System.out.println(bus);
//        }
//
//        User[] users = {
//                new User.Builder().setName("Alice").setPassword("pass123").setEmail("alice@example.com").build(),
//                new User.Builder().setName("AACharlie").setPassword("mypassword").setEmail("charlie@example.com").build(),
//                new User.Builder().setName("Alice").setPassword("qwerty").setEmail("aabob@example.com").build()
//        };
//
//        CompositeComparator<User> userComparator = new CompositeComparator<>(
//                new UserComparators.SortByName(),
//                new UserComparators.SortByEmail()
//        );
//
//        QuickSortWithStrategy<User> userQuickSortWithStrategy = new QuickSortWithStrategy<>(userComparator);
//        userQuickSortWithStrategy.sort(users);
//        for(User user : users){
//            System.out.println(user);
//        }
    }
}
