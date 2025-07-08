class Test {
    public static void main(String[] args) {
        BookStore store = new BookStore();

        // Add books
        store.addBook(new PaperBook("123", "Effective Java", "Joshua Bloch", 2017, 45.99, 10));
        store.addBook(new EBook("345", "Design Patterns", "Joshua Bloch", 2004, 29.99, "PDF"));
        store.addBook(new ShowcaseBook("675", "C++ Primer", "Joshua Bloch", 2008, 39.99));
        store.addBook(new PaperBook("878", "Head First Java", "Joshua Bloch", 2000, 34.99, 5));

        // Show inventory
        store.showInventory();

        // Make purchases
        store.purchaseBook("123", 2, "john@example.com", "123 Main St");
        store.purchaseBook("345", 1, "jane@example.com", "456 Oak Ave");

        // Error cases
        store.purchaseBook("000", 1, "test@example.com", "Test Address");
        store.purchaseBook("675", 1, "test@example.com", "Test Address");
        store.purchaseBook("123", 20, "test@example.com", "Test Address");

        // Remove old books
        store.removeOldBooks(20);

        // Final inventory
        store.showInventory();
    }
}