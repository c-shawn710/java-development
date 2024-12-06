package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Shawn", UserRole.USER);
        User user2 = new User("Bob", UserRole.ADMIN);
        User user3 = new User("Charlie", UserRole.EDITOR);

        user1.printRole();
        user1.printPermissions();

        user2.printRole();
        user2.printPermissions();

        user3.printRole();
        user3.printPermissions();
    }
}
