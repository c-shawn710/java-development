package com.pluralsight;

public class User {
    private String name;
    private UserRole role;

    public User(String name, UserRole role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public void printRole() {
        System.out.println(name + "'s role: " + role);
    }

    public void printPermissions() {
        switch (role) {
            case USER:
                System.out.println("You are a user. Don't break the application please.");
                break;
            case ADMIN:
                System.out.println("You are an admin. Be responsible.");
                break;
            case EDITOR:
                System.out.println("You are an editor. Be creative.");
                break;
            default:
                System.out.println("Unknown role.");
        }
    }
}
