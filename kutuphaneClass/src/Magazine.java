
public class Magazine extends LibraryItem {
    private String issueNumber;
    private Date publicationDate;

    public Magazine(String title, String issueNumber, Date publicationDate) {
        super(title);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %s %s", publicationDate.toString(), issueNumber);
    }
}
