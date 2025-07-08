class EBook extends Book {
    private String fileFormat;

    public EBook(String id, String name, String author, int year, double cost, String fileFormat) {
        super(id, name, author, year, cost);
        this.fileFormat = fileFormat;
    }

    public boolean isAvailable() {
        return true;
    }

    public boolean handlePurchase(int count, String email, String address) {
        System.out.println("Bookstore: Sending EBook '" + name + "' (" + fileFormat + ") to email: " + email);
        return true;
    }

    public String toString() {
        return super.toString() + String.format(", Format: %s", fileFormat);
    }
}
