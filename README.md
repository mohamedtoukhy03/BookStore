# Bookstore

Welcome to **Bookstore**, a simple and extensible application to manage an online bookstore. Whether you're handling paper books, eBooks, or demo books, this system provides a clean and scalable solution for inventory management, purchases, and outdated book removal.

---

## Features

### 📚 Inventory Management
- Add new books to your inventory.
- Remove outdated books based on their publishing year.

### 🛒 Purchase System
- Buy books by providing their ID, quantity, email, and shipping address.
- Automatically handles inventory updates.
- Supports shipping for paper books and email delivery for eBooks.

### 🚀 Extensibility
Designed with scalability in mind:
- Easily add new book types by extending the base `Book` class.
- No need to modify existing code for new functionality.

---

## Supported Book Types
1. **Paper Books**: Physical copies available for shipping.
2. **eBooks**: Digital books delivered via email.
3. **Showcase Books**: Demo books not available for sale.

---

## How It Works

### Adding Books
Simply create a book object and add it to the inventory:
```java
store.addBook(new EBook("345", "Design Patterns", "Joshua Bloch", 2004, 29.99, "PDF"));
store.addBook(new ShowcaseBook("675", "C++ Primer", "Joshua Bloch", 2008, 39.99));
store.addBook(new PaperBook("878", "Head First Java", "Joshua Bloch", 2000, 34.99, 5));
```

### Purchasing Books
Purchase books by providing their ID, quantity, email, and address:
```java
store.purchaseBook("345", 1, "test@example.com", "");
```

### Removing Outdated Books
Remove books older than a certain number of years:
```java
store.removeOldBooks(20); // Removes books older than 20 years
```

---

## Sample Output

### Inventory
```
Bookstore: Current Inventory:
Bookstore: ID: 345, Name: Design Patterns, Author: Joshua Bloch, Year: 2004, Cost: $29.99, Format: PDF
Bookstore: ID: 675, Name: C++ Primer, Author: Joshua Bloch, Year: 2008, Cost: $39.99 Not for sale
Bookstore: ID: 878, Name: Head First Java, Author: Joshua Bloch, Year: 2000, Cost: $34.99, Stock: 5
```

### Successful Purchase
```
Bookstore: Sending EBook 'Design Patterns' (PDF) to email: test@example.com
Bookstore: Successfully purchased 1 copies of 'Design Patterns'. Total: $29.99
```

---
