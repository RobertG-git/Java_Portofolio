package src.P1_SistemGestiuneInscrieri;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class GuestsList {

    // fields
    private final int eventSeats;
    private final ArrayList<Guest> subscriberList = new ArrayList<>();

    // constructors
    public GuestsList(int eventSeats) {
        this.eventSeats = eventSeats;
    }

    // Methods
    // 1.
    public int add(Scanner sc) {
        System.out.println("Enter last name:");
        String lastName = sc.nextLine();
        System.out.println(Constants.BLUE + lastName + Constants.RESET);

        System.out.println("Enter first name:");
        String firstName = sc.nextLine();
        System.out.println(Constants.BLUE + firstName + Constants.RESET);

        System.out.println("Enter email:");
        String email = sc.nextLine();
        System.out.println(Constants.BLUE + email + Constants.RESET);

        System.out.println("Enter phone number (format „+40733386463“):");
        String phoneNumber = sc.nextLine();
        System.out.println(Constants.BLUE + phoneNumber + Constants.RESET);

        Guest guest = new Guest(lastName, firstName, email, phoneNumber);

        for (Guest participant : this.subscriberList) {
            if (participant.equals(guest)) {
                System.out.println("You are already in the list of subscribers!");
                return -1;
            }
        }
        if (this.subscriberList.size() < this.eventSeats) {
            this.subscriberList.add(guest);
            System.out.println("[" + guest.getLastName() + " " + guest.getFirstName() + "] Congratulations! " +
                    "Your place at the event is confirmed. We are waiting for you!");
            return 0;
        } else {
            this.subscriberList.add(guest);
            System.out.println(("[" + guest.getLastName() + " " + guest.getFirstName() + "]" + " You have successfully " +
                    "signed up for the waiting list and received the serial number "
                    + (this.subscriberList.size() - this.eventSeats) + ". We will notify you if a place becomes available."));
            return this.subscriberList.size() - this.eventSeats;
        }
    }

    // 2.
    public int check(Scanner sc) {

        // note: return 'index' if subscriber is in subscriberList or '-1' is not.
        System.out.println("""
                Choose the authentication mode, typing:
                "1" - Name and surname
                "2" - Email
                "3" - Phone number (format "+40733386463")\s""");

        int number = sc.nextInt();
        System.out.println(Constants.BLUE + number + Constants.RESET);

        if (number == 1) {
            System.out.println("Please insert last name:");
            sc.nextLine();
            String lastName = sc.nextLine();
            System.out.println(Constants.BLUE + lastName + Constants.RESET);
            System.out.println("Please insert first name:");
            String firstName = sc.nextLine();
            System.out.println(Constants.BLUE + firstName + Constants.RESET);

            for (int index = 0; index < this.subscriberList.size(); index++) {
                if ((this.subscriberList.get(index).getLastName().equalsIgnoreCase(lastName)
                        && this.subscriberList.get(index).getFirstName().equalsIgnoreCase(firstName))) {
                    return index;
                }
            }

        } else if (number == 2) {
            System.out.println("Please insert email:");
            sc.nextLine();
            String email = sc.nextLine();
            System.out.println(Constants.BLUE + email + Constants.RESET);

            for (int index = 0; index < this.subscriberList.size(); index++) {
                if (this.subscriberList.get(index).getEmail().equalsIgnoreCase(email)) {
                    return index;
                }
            }


        } else if (number == 3) {
            System.out.println("Please enter phone number (format \"+40733386463\"):");
            sc.nextLine();
            String phoneNumber = sc.nextLine();
            System.out.println(Constants.BLUE + phoneNumber + Constants.RESET);

            for (int index = 0; index < this.subscriberList.size(); index++) {
                if (this.subscriberList.get(index).getPhoneNumber().equalsIgnoreCase(phoneNumber)) {
                    return index;
                }
            }
        }

        return -1;

    }

    // 3.
    public boolean remove(Scanner sc) {
        System.out.println("Deleting an existing person from the list…");
        int index = check(sc);
        if (index == -1) {
            System.out.println("Error: The person is not registered for the event.");
            return false;
        } else {
            if (index < this.eventSeats - 1 && this.subscriberList.size() > this.eventSeats) {
                System.out.println("[" + this.subscriberList.get(this.eventSeats).getLastName() + " "
                        + this.subscriberList.get(this.eventSeats).getFirstName() + "] Congratulations! " +
                        "Your place at the event is confirmed. We are waiting for you!");
            }
            this.subscriberList.remove(index);
            System.out.println("The deletion of the person was successful.");
            return true;
        }
    }

    // 4.
    public void update(Scanner sc) {
        System.out.println("Updating a person's details……");
        int index = check(sc);
        if (index == -1) {
            System.out.println("Error: The person is not registered for the event.");
        } else {
            System.out.println("""
                    Choose the update field by typing:
                    "1" - Name
                    "2" - First name
                    "3" - Email
                    "4" - Phone number (format "+40733386463"))\s""");

            int number = sc.nextInt();
            System.out.println(Constants.BLUE + number + Constants.RESET);

            if (number == 1) {
                System.out.println("Please insert last name:");
                sc.nextLine();
                String lastName = sc.nextLine();
                System.out.println(Constants.BLUE + lastName + Constants.RESET);
                this.subscriberList.get(index).setLastName(lastName);

            } else if (number == 2) {
                System.out.println("Please insert first name:");
                sc.nextLine();
                String firstName = sc.nextLine();
                System.out.println(Constants.BLUE + firstName + Constants.RESET);
                this.subscriberList.get(index).setFirstName(firstName);

            } else if (number == 3) {
                System.out.println("Please insert email:");
                sc.nextLine();
                String email = sc.nextLine();
                System.out.println(Constants.BLUE + email + Constants.RESET);
                this.subscriberList.get(index).setEmail(email);

            } else if (number == 4) {
                System.out.println("Please enter phone number (format \"+40733386463\"):");
                sc.nextLine();
                String phoneNumber = sc.nextLine();
                System.out.println(Constants.BLUE + phoneNumber + Constants.RESET);
                this.subscriberList.get(index).setPhoneNumber(phoneNumber);
            }
        }
    }

    // 5.
    public void guests() {
        if (this.subscriberList.size() == 0) {
            System.out.println("No participants registered…");
        }
        for (int i = 0; i < Math.min(this.subscriberList.size(), this.eventSeats); i++) {
            System.out.println((i + 1) + "." + this.subscriberList.get(i).toString());
        }
    }

    // 6.
    public void waitList() {
        int counter = 0;
        if (this.subscriberList.size() > this.eventSeats) {
            for (int i = this.eventSeats; i < this.subscriberList.size(); i++) {
                counter++;
                System.out.println((i - this.eventSeats + 1) + "." + this.subscriberList.get(i).toString());
            }
        }
        if (counter == 0) {
            System.out.println("Waiting list is empty…");
        }
    }

    // 7.
    public void available() {
        System.out.println("Number of seats available: " + Math.max(this.eventSeats - this.subscriberList.size(), 0));
    }

    // 8.
    public void guests_no() {
        int guest_no = 0;
        for (int i = 0; i < Math.min(this.subscriberList.size(), this.eventSeats); i++) {
            guest_no++;
        }

        System.out.println("Number of participants: " + guest_no);
    }

    // 9.
    public void waitList_no() {
        if (this.subscriberList.size() > this.eventSeats) {
            int waitList_no = 0;
            for (int i = this.eventSeats; i < this.subscriberList.size(); i++) {
                waitList_no++;
            }
            System.out.println("Waiting list size: " + waitList_no);
        } else {
            System.out.println("Waiting list size: 0");
        }
    }

    // 10.
    public void subscribe_no() {
        System.out.println("Total number of subscribers: " + this.subscriberList.size());
    }

    // 11.
    public void search(Scanner sc) {
        System.out.println("Please enter the substring to search: ");
        String substring = sc.nextLine();
        System.out.println(Constants.BLUE + substring + Constants.RESET);
        System.out.println("Search result is the following: ");
        for (Guest guest : this.subscriberList) {

            if ((guest.getFirstName().toLowerCase().contains(substring.toLowerCase()))) {
                System.out.println("\t- " + guest.getFirstName());
            } else if ((guest.getLastName().toLowerCase().contains(substring.toLowerCase()))) {
                System.out.println("\t- " + guest.getLastName());
            } else if ((guest.getEmail().toLowerCase().contains(substring.toLowerCase()))) {
                System.out.println("\t- " + guest.getEmail());
            } else if ((guest.getPhoneNumber().toLowerCase().contains(substring.toLowerCase()))) {
                System.out.println("\t- " + guest.getPhoneNumber());
            }
        }
    }

    @Override
    public String toString() {
        return "GuestsList{" +
                "eventSeats=" + eventSeats +
                ", subscribeList=" + subscriberList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GuestsList)) return false;
        GuestsList that = (GuestsList) o;
        return eventSeats == that.eventSeats &&
                Objects.equals(subscriberList, that.subscriberList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventSeats, subscriberList);
    }
}
