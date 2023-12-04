public class Librarian extends Person {
    private int employeeID;
    private static int lastEmployeeID = -1;

    public Librarian(String firstName, String lastName, int day, int month, int year) {
        super(firstName, lastName, day, month, year);
        this.employeeID = ++lastEmployeeID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %d", employeeID);
    }
}
