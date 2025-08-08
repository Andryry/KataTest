package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Андрей", "Каплин", (byte) 27);
        userService.saveUser("Агафия", "Каплина", (byte) 23);
        userService.saveUser("Георгий", "Свиридов", (byte) 105);
        userService.saveUser("Чарли", "Чаплин", (byte) 122);

        System.out.println("Все пользователи:");
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
