public class LibraryItem {
    private String title;
    private int itemID;
    private boolean isAvailable;
    private static int lastItemID = -1;

    public LibraryItem(String title) {
        this.title = title;
        this.isAvailable = true;
        this.itemID = ++lastItemID;
    }

    public String getTitle() {
        return title;
    }

    public int getItemID() {
        return itemID;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("Item is already borrowed.");
        }
    }

    public void returnItem() {
        if (!isAvailable) {
            isAvailable = true;
        } else {
            System.out.println("Item is already available.");
        }
    }

    @Override
    public String toString() {
        return String.format("%d %s %s", itemID, title, (isAvailable ? "available" : "not available"));
    }
}
