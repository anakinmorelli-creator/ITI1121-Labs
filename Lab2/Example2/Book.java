public class Book {
    // Variables
    private String title, author;

    // Constructor
    public Book(String a, String t) {
        author = a;
        title = t;
    }

    // getters
    public String getAuthor() {
        return author;
    }

    public static void main(String[] agrs) {
        Book book1 = new Book("J.K Rowlling", "Harry Potter");
        Book book2 = new Book("Taylor Jenkins Reid", "Atmosphere");

        System.out.println(book1.getAuthor());
        System.out.println(book2.getAuthor());
    }
}