public class Person {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;

    public Person(String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = new Date(day, month, year);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return String.format("%s %s, Date of Birth: %s", firstName, lastName, dateOfBirth);
    }
}
