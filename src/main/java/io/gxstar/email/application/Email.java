package io.gxstar.email.application;

/**
 * Created by @author Ifeanyichukwu Otiwa
 * 27/08/2022
 */

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private Integer mailBoxCapacity;
    private String alternateEmail;


    public Email(final String firstName, final String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(final String department) {
        this.department = department;
    }

    public Integer getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public void setMailBoxCapacity(final Integer mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(final String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }
}