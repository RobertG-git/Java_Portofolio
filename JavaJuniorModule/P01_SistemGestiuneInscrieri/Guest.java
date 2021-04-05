package src.P1_SistemGestiuneInscrieri;

import java.util.Objects;

public class Guest {

    // fields
    private String lastName;
    private String firstName;
    private String email;
    private String phoneNumber;

    // constructor
    public Guest(String lastName, String firstName, String email, String phoneNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // methods
    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + lastName + " " + firstName +
                ", Email: " + email +
                ", PhoneNumber: " + phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guest)) return false;
        Guest guest = (Guest) o;
        return Objects.equals(this.lastName.toLowerCase(), guest.lastName.toLowerCase()) &&
                Objects.equals(this.firstName.toLowerCase(), guest.firstName.toLowerCase()) &&
                Objects.equals(this.email.toLowerCase(), guest.email.toLowerCase()) &&
                Objects.equals(this.phoneNumber.toLowerCase(), guest.phoneNumber.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, email, phoneNumber);
    }
}
