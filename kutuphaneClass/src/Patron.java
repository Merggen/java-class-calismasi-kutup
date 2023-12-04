public class Patron extends Person {
    private int libraryCardNumber;
    private String emailAddress;
    private static int lastLibraryCardNumber = -1;

    public Patron(String firstName, String lastName, int day, int month, int year, String emailAddress) {
        super(firstName, lastName, day, month, year);
        this.emailAddress = emailAddress;
        this.libraryCardNumber = getNextLibraryCardNumber();
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return super.toString() + " " + libraryCardNumber + " " + emailAddress;
    }

    private static int getNextLibraryCardNumber() {
        lastLibraryCardNumber++;
        return lastLibraryCardNumber;
    }
}
