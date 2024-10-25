package com.pluralsight;

public class StaticClasses {

    public static String formatFullName(String lastName, String prefix, String firstName, String middleName, String suffix) {
        StringBuilder builder = new StringBuilder();

        //format in order starting with last name. Make sure in each format line it includes spaces, comma, and/or period
        builder.append(lastName).append(", ");

        // format optional name parts using if statements
        if(prefix != null && !prefix.isEmpty()) {
            builder.append(prefix).append(".");
        }

        // format first name
        if(firstName != null && !firstName.isEmpty()) {
            builder.append(" ").append(firstName);
        }


        if(middleName != null && !middleName.isEmpty()) {
            builder.append(" ").append(middleName);
        }

        if(suffix != null && !suffix.isEmpty()) {
            builder.append(" ").append(suffix);
        }

        // return formated fullname and make sure to trim
        return builder.toString();
    }

    // Create class that formats without middle name
    public static String noMiddleName(String lastName, String prefix, String firstName, String suffix) {
        StringBuilder builder = new StringBuilder();

        //format in order starting with last name
        builder.append(lastName).append(", ");

        // optional without prefix name
        if(prefix != null && !prefix.isEmpty()) {
            builder.append(prefix).append(". ");
        }

        if(firstName != null && !firstName.isEmpty()) {
            builder.append(firstName).append(" ");
        }

        if(suffix != null && !suffix.isEmpty()) {
            builder.append(" ").append(suffix);
        }

        return builder.toString();
    }

    // Create class that formats without suffix
    public static String noSuffix(String lastName, String prefix, String firstName, String middleName) {
        StringBuilder builder = new StringBuilder();

        builder.append(lastName).append(", ");

        if(prefix != null && !prefix.isEmpty()) {
            builder.append(prefix).append(". ");
        }

        if(firstName != null && !firstName.isEmpty()) {
            builder.append(firstName).append(" ");
        }

        if(middleName != null && !middleName.isBlank()) {
            builder.append(middleName);
        }

        return builder.toString();
    }

    // Create class that formats without prefix
    public static String noPrefix(String lastName, String firstName, String middleName, String suffix) {
        StringBuilder builder = new StringBuilder();

        builder.append(lastName).append(", ");

        if(firstName != null && !firstName.isEmpty()) {
            builder.append(firstName).append(" ");
        }

        if(middleName != null && !middleName.isEmpty()) {
            builder.append(middleName).append(" ");
        }

        if(suffix != null && !suffix.isEmpty()) {
            builder.append(suffix).append(".");
        }

        return builder.toString().trim();
    }

    public static String mandatoryName(String lastName, String firstName) {
        return lastName + ", " + firstName;
    }

    public static void main(String[] args) {
        String formattedName1 = formatFullName("Chung", "Mr", "Shawn", "S", "Dr");
        String formattedName2 = noMiddleName("Chung", "Mr", "Shawn", "Dr.");
        String formattedName3 = noSuffix("Chung", "Mr", "Shawn", "S");
        String formattedName4 = noPrefix("Chung", "Shawn", "S", "Dr");
        String formattedName5 = mandatoryName("Chung", "Shawn");

        System.out.println(formattedName1);
        System.out.println(formattedName2);
        System.out.println(formattedName3);
        System.out.println(formattedName4);
        System.out.println(formattedName5);
    }
}
