public class TestBook {
    public static void main(String[] agrs) {
        Book book1 = new Book("J.K Rowlling", "Harry Potter");
        Book book2 = new Book();

        book2.setAuthor("Taylor Jenkins Reid");
        book2.setTitle("Atmosphere");

        book1.display();
        book2.display();

        System.out.println(book1);
        System.out.println(book2);
    }
}
