import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class BookStore {
    private Map<String, Book> inventory = new HashMap<>();

    public void addBook(Book book) {
        if (book == null) {
            System.out.println("Bookstore: Invalid book. Cannot add to inventory.");
            return;
        }
        inventory.put(book.getId(), book);
        System.out.println("Bookstore: Added book - " + book);
    }

    public List<Book> removeOldBooks(int yearsLimit) {
        List<Book> removedBooks = new ArrayList<>();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        Iterator<Map.Entry<String, Book>> iterator = inventory.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Book> entry = iterator.next();
            Book book = entry.getValue();

            if (currentYear - book.getYear() > yearsLimit) {
                removedBooks.add(book);
                iterator.remove();
                System.out.println("Bookstore: Removed old book - " + book);
            }
        }
        return removedBooks;
    }

    public void purchaseBook(String id, int count, String email, String address) {
        Book book = inventory.get(id);

        if (book == null) {
            System.out.println("Bookstore: Book not found.");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Bookstore: Book '" + book.getName() + "' is not available for purchase.");
            return;
        }

        if (book.handlePurchase(count, email, address)) {
            System.out.println("Bookstore: Successfully purchased " + count + " copies of '" + book.getName() + "'. Total: $" + (book.getCost() * count));
        } else {
            System.out.println("Bookstore: Purchase failed.");
        }
    }

    public void showInventory() {
        System.out.println("Bookstore: Current Inventory:");
        if (inventory.isEmpty()) {
            System.out.println("Bookstore: No books in inventory.");
        } else {
            for (Book book : inventory.values()) {
                System.out.println("Bookstore: " + book);
            }
        }
    }
}
