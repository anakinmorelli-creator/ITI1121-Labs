public class Book {
    // Variables
    private String title, author;

    // Constructor
    public Book(String a, String t) {
        author = a;
        title = t;
    }
    public Book() {
    }

    // Getters
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }

    // Modifiers
    public void setAuthor(String a) {
        author = a;
    }
    public void setTitle(String t) {
        title = t;
    }

    // Display and toString
    public String toString() {
        return "Book [title=" + title + ", author=" + author +"]";
    }
}