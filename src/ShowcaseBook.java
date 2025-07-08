class ShowcaseBook extends Book {
    public ShowcaseBook(String id, String name, String author, int year, double cost) {
        super(id, name, author, year, cost);
    }

    public boolean isAvailable() {
        return false; 
    }

    public boolean handlePurchase(int count, String email, String address) {
        System.out.println("Bookstore: Showcase books are not for sale.");
        return false;
    }

    public String toString() {
        return super.toString() + " Not for sale";
    }
}