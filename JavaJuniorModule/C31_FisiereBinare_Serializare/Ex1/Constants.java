package src.C31_FisiereBinare_Serializare.Ex1;

public class Constants {

    protected final static String HELPLIST = """
            \t- help - Displays this command list\s
            \t- add - Add a new person (registration)\s
            \t- check - Checks if a person is registered for the event\s
            \t- remove - Checks if a person is registered for the event\s
            \t- update - Updates a person's details\s
            \t- guests - The list of people participating in the event\s
            \t- waitlist - People on the waiting list\s
            \t- available - Number of vacancies\s
            \t- guests_no - The number of people attending the event\s
            \t- waitlist_no - The number of people on the waiting list\s
            \t- subscribe_no - The total number of people registered
            \t- search - Search for all invitations according to the string entered\s
            \t- clear - Clear program data\s
            \t- quit - Close the application\s
            """;

    protected final static String WAITCOMMAND = "Wait command (help - Displays a list of commands)";

    //console color change
    protected static final String BLUE = "\033[0;34m";
    protected static final String RESET = "\033[0m";

    protected static final String WELCOME = """
            Welcome!\s
            Program data was loaded!\s
            """;


}
