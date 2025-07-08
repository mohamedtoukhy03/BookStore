class PaperBook extends Book {
    private int quantity;

    public PaperBook(String id, String name, String author, int year, double cost, int quantity) {
        super(id, name, author, year, cost);
        this.quantity = quantity;
    }

    private boolean updateQuantity(int count) {
        if (count > quantity) {
            System.out.println("Bookstore: Not enough stock for '" + name + "'. Available: " + quantity);
            return false;
        }
        quantity -= count;
        return true;
    }

    public boolean isAvailable() {
        return quantity > 0;
    }

    public boolean handlePurchase(int count, String email, String address) {
        if (!updateQuantity(count)) return false;
        System.out.println("Bookstore: Shipping " + count + " copies of '" + name + "' to address: " + address);
        return true;
    }

    public String toString() {
        return super.toString() + String.format(", Stock: %d", quantity);
    }
}
