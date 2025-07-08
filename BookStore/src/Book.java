abstract class Book {
    protected String id;
    protected String name;
    protected String author;
    protected int year;
    protected double cost;

    public Book(String id, String name, String author, int year, double cost) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
        this.cost = cost;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public double getCost() { return cost; }

    public abstract boolean isAvailable();
    public abstract boolean handlePurchase(int count, String email, String address);

    public String toString() {
        return String.format("ID: %s, Name: %s, Author: %s, Year: %d, Cost: $%.2f", id, name, author, year, cost);
    }
}
