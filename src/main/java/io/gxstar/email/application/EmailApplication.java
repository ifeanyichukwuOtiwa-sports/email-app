package io.gxstar.email.application;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by @author Ifeanyichukwu Otiwa
 * 27/08/2022
 */

public class EmailApplication {

    public static final Scanner sc = new Scanner(System.in);
    private static final Integer DEFAULT_EMAIL_CAPACITY = 15;
    private static final Integer DEFAULT_LENGTH = 8;
    private static final String COMPANY_NAME = "SoftSolutions";

    public static void main(String[] args) {
        final String department = setDepartment();
        final String firstName = sc.nextLine();
        final String lastName = sc.nextLine();

        final Email email = new Email(firstName, lastName, department);

        //generate random String for password
        email.setPassword(generateRandomPassword(DEFAULT_LENGTH));
        //create email
        //set email capacity
        email.setMailBoxCapacity(DEFAULT_EMAIL_CAPACITY);
        //define alternative email address
        String emailAddress = generateEmailAddress(email);
        //change password
        System.out.println();
        //display the name, email, and mailbox capacity
    }

    private static String generateEmailAddress(final Email email) {
        final String emailAddress = email.getDepartment() + "." + email.getLastName() + "@"
                + email.getDepartment() + COMPANY_NAME + ".com";
        return emailAddress.toLowerCase();
    }


    private static String setDepartment() {
        System.out.println("""
                Enter the department
                
                1. Sales
                
                2. Development
                
                3. Accounting
                """);
        int response = sc.nextInt();
        return switch (response) {
            case 1 -> "Sales";
            case 2 -> "Development";
            case 3 -> "Accounting";
            default -> "";
        };
    }


    private static String generateRandomPassword(Integer passwordLength) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%abcdefghijklmnopqrstuvwxyz";
        char[] password = new char[passwordLength];
        for (int i = 0; i < passwordLength; i++) {
            int rand = (int) (Math.random() * (passwordSet.length() - 1));
            password[i] = passwordSet.charAt(rand);
        }
        return Arrays.toString(password);
    }
}
