package homework.homework3.part2.book.yourturn;


public class TestMain {
    public static void main(String[] args) {
        Author author1 = new Author("pham viet long", "long@asdasd.com");
        System.out.println(author1);

        author1.setEmail("ahteck@somewhere.com");
        System.out.println(author1);
        System.out.println("name is: " + author1.getName());
        System.out.println("email is: " + author1.getEmail());

        Book book1 = new Book("12345", "Javas", author1, 8.8, 88);
        System.out.println(book1);
        book1.setPrice(9.9);
        book1.setQty(99);
        System.out.println(book1);
        System.out.println("isbn is: " + book1.getIsbn());
        System.out.println("name is: " + book1.getName());
        System.out.println("price is: " + book1.getPrice());
        System.out.println("qty is: " + book1.getQty());

        System.out.println("author is: " + book1.getAuthor());
        System.out.println("author's name: " + book1.getAuthorName());
        System.out.println("author's name: " + book1.getAuthor().getName());
        System.out.println("author's email: " + book1.getAuthor().getEmail());
    }
}
