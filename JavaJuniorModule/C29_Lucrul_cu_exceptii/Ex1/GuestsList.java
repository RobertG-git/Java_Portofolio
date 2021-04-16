package src.C29_Lucrul_cu_exceptii.Ex1;

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

        Guest guest = new Guest(SystemService.readLastName(sc), SystemService.readFirstName(sc),
                SystemService.readEmail(sc), SystemService.readPhoneNumber(sc));

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
        int number = SystemService.readAuthenticationNumber(sc);

        if (number == 1) {
            sc.nextLine();
            String lastName = SystemService.readLastName(sc);
            String firstName = SystemService.readFirstName(sc);

            for (int index = 0; index < this.subscriberList.size(); index++) {
                if ((this.subscriberList.get(index).getLastName().equalsIgnoreCase(lastName)
                        && this.subscriberList.get(index).getFirstName().equalsIgnoreCase(firstName))) {
                    return index;
                }
            }

        } else if (number == 2) {
            sc.nextLine();
            String email = SystemService.readEmail(sc);

            for (int index = 0; index < this.subscriberList.size(); index++) {
                if (this.subscriberList.get(index).getEmail().equalsIgnoreCase(email)) {
                    return index;
                }
            }

        } else if (number == 3) {
            sc.nextLine();
            String phoneNumber = SystemService.readPhoneNumber(sc);

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

            int number = SystemService.readUpdateNumber(sc);

            if (number == 1) {
                sc.nextLine();
                String lastName = SystemService.readLastName(sc);
                this.subscriberList.get(index).setLastName(lastName);

            } else if (number == 2) {
                sc.nextLine();
                String firstName = SystemService.readFirstName(sc);
                this.subscriberList.get(index).setFirstName(firstName);

            } else if (number == 3) {
                sc.nextLine();
                String email = SystemService.readEmail(sc);
                this.subscriberList.get(index).setEmail(email);

            } else if (number == 4) {
                sc.nextLine();
                String phoneNumber = SystemService.readPhoneNumber(sc);
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

        String substring = SystemService.readSubstring(sc);

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
