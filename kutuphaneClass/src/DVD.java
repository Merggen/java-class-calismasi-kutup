public class DVD extends LibraryItem {
    private Person director;
    private int runtimeMinutes;

    public DVD(String title, Person director, int runtimeMinutes) {
        super(title);
        this.director = director;
        this.runtimeMinutes = runtimeMinutes;
    }

    public Person getDirector() {
        return director;
    }

    public int getRuntimeMinutes() {
        return runtimeMinutes;
    }
    @Override
    public String toString() {
        return super.toString() + String.format(" %s %d minutes", director.toString(), runtimeMinutes);
    }
}
